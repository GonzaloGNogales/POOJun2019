package poo;

import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Variables de definición del usuario
    private String nombre;
    private String pass;
    private StringBuilder muro;
    
    //Variables para sistema de partidas
    private int partidas_ganadas;
    private int partidas_perdidas;
    private int partidas_empatadas;
    private ArrayList<Partida> partidas_completas = new ArrayList<>();
    private ArrayList<Partida> partidas_pendientes = new ArrayList<>();

    //Variables para sistema de amigos
    private ArrayList<Usuario> solicitudes_amigos_recibidas = new ArrayList<>();
    private ArrayList<Usuario> solicitudes_amigos_enviadas = new ArrayList<>();
    private ArrayList<Usuario> amigos = new ArrayList<>();
    
    //Constructores
    public Usuario (String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
        this.muro = new StringBuilder("");
        this.partidas_ganadas = 0;
        this.partidas_perdidas = 0;
        this.partidas_empatadas = 0;
    }

    public Usuario (String nombre, String pass, StringBuilder muro) {
        this.nombre = nombre;
        this.pass = pass;
        this.muro = muro;
        this.partidas_ganadas = 0;
        this.partidas_perdidas = 0;
        this.partidas_empatadas = 0;
    }
    
    public Usuario(String nombre, String pass, StringBuilder muro, int partidas_ganadas, int partidas_perdidas, int partidas_empatadas, ArrayList<Partida> partidas_completas, ArrayList<Partida> partidas_pendientes, ArrayList<Usuario> solicitudes_amigos_recibidas, ArrayList<Usuario> solicitudes_amigos_enviadas, ArrayList<Usuario> amigos) {
        this.nombre = nombre;
        this.pass = pass;
        this.muro = muro;
        this.partidas_ganadas = partidas_ganadas;
        this.partidas_perdidas = partidas_perdidas;
        this.partidas_empatadas = partidas_empatadas;
        this.partidas_completas = partidas_completas;
        this.partidas_pendientes = partidas_pendientes;
        this.solicitudes_amigos_recibidas = solicitudes_amigos_recibidas;
        this.solicitudes_amigos_enviadas = solicitudes_amigos_enviadas;
        this.amigos = amigos;
    }
    
    //no-args
    public Usuario () {
        
    }

    public Usuario (Usuario u) {
        this.nombre = u.getNombre();
        this.pass = u.getPass();
        this.muro = u.getMuro();
        this.partidas_ganadas = u.getPartidas_ganadas();
        this.partidas_perdidas = u.getPartidas_perdidas();
        this.partidas_empatadas = u.getPartidas_empatadas();
        this.partidas_completas = u.getPartidas_completas();
        this.partidas_pendientes = u.getPartidas_pendientes();
        this.solicitudes_amigos_recibidas = u.getSolicitudes_amigos_recibidas();
        this.solicitudes_amigos_enviadas = u.getSolicitudes_amigos_enviadas();
        this.amigos = u.getAmigos();
    }
    
    
    //Implementación de funciones del sistema
    public void invitarAmigo (Usuario u) {     
        u.getSolicitudes_amigos_recibidas().add(this);
        this.solicitudes_amigos_enviadas.add(u);
    }

    public void aceptarInvitacion (Usuario u) {
        this.amigos.add(u);
        u.getAmigos().add(this);    
        this.solicitudes_amigos_recibidas.remove(u);
        u.getSolicitudes_amigos_enviadas().remove(this);
    }
    
    public void rechazarInvitacion (Usuario u) {
        this.solicitudes_amigos_recibidas.remove(u);
        u.getSolicitudes_amigos_enviadas().remove(this);  
    }
    
    public void eliminarAmigo (Usuario u) {
        this.amigos.remove(u);
        u.getAmigos().remove(this);
    }

    //Compartir pelicula con todos los amigos.
    public void compartirPelicula (Pelicula p) {
        ArrayList<Usuario> usuarios = Usuarios.leerAmigos(this);
        p.compartir(usuarios);  //Operación de la interfaz que comparte una pelicula con varios usuarios.
    }
    
    //Compartir pelicula con uno o varios amigos, pero no todos.
    public void compartirPelicula (Pelicula p, Usuario u) {
        p.compartir(u);
    }
    
    public void compartirCritica (Critica c) {
        ArrayList<Usuario> usuarios = Usuarios.leerAmigos(this);
        c.compartir(usuarios);  //Operación de la interfaz que comparte una critica con varios usuarios.        
    }
    
    public void compartirCritica (Critica c, Usuario u) {
        c.compartir(u);
    }
    
    public void compartirPartida (Partida partida) {
        ArrayList<Usuario> usuarios = Usuarios.leerAmigos(this);
        partida.compartir(usuarios);  //Operación de la interfaz que comparte una partida con varios usuarios.        
    }
    
    public void compartirPartida (Partida partida, Usuario u) {
        partida.compartir(u);
    }
    
    public void compartirTodo () {
        ArrayList<Usuario> usuarios = Usuarios.leerAmigos(this);
        ArrayList<Pelicula> peliculasSistema = Peliculas.leer();
        
        for (Pelicula p: peliculasSistema) {
            p.compartir(usuarios);
            ArrayList<Critica> criticasP = p.getCriticas();

            for (Critica c: criticasP) {
                c.compartir(usuarios);
            }
        }     
    }
    
    public void compartirTodo (Usuario u) {
        ArrayList<Pelicula> peliculasSistema = Peliculas.leer();
        
        for (Pelicula p: peliculasSistema) {
            p.compartir(u);
            ArrayList<Critica> criticasP = p.getCriticas();
            
            for (Critica c: criticasP) {
                c.compartir(u);
            }
        }
    }
    
    public StringBuilder muroPelicula (Pelicula p) {
        
        StringBuilder mAux = new StringBuilder(p.toString());       
        this.setMuro(mAux);
        return mAux;
        
    }
    
    public StringBuilder muroCritica (Critica c, Pelicula p) {
    	
        p.getCriticas().add(c);
        StringBuilder mAux = new StringBuilder(c.toString());       
        this.setMuro(mAux);
        return mAux;

    }
    
    public Partida iniciarPartida (Usuario u) {
        //Cada vez que se inicia una partida se le proporciona un identificador aleatorio y único
        SecureRandom random = new SecureRandom();
        int id = random.nextInt();
        while (id < 0) {
            id = random.nextInt();
        }
        System.err.println(id);
        
        Partida partida = new Partida(id,this,u);
        this.partidas_pendientes.add(partida);
        u.getPartidas_pendientes().add(partida);

        return partida;
    }
    
    public StringBuilder completarPartida (Partida partida) {       
        //Se quita la partida de partidas pendientes y se añade a partidas completadas.
        partida.getJugador1().getPartidas_pendientes().remove(partida);
        partida.getJugador2().getPartidas_pendientes().remove(partida);
        partida.setParcial(false);
        partida.getJugador1().getPartidas_completas().add(partida);   
        partida.getJugador2().getPartidas_completas().add(partida);
        
        //Se carga la información de la partida finalizada en los muros de los jugadores
        StringBuilder mAux = new StringBuilder(partida.toString());       
        partida.getJugador1().setMuro(mAux);
        partida.getJugador2().setMuro(mAux);
        
        //Actualizamos los ficheros de los jugadores 1 y 2
        Usuarios.actualizar(partida.getJugador1());
        Usuarios.actualizar(partida.getJugador2());    
        
        return mAux;
    }
    
    public static Usuario seleccionarUsuario () {
        ArrayList <Usuario> usuarios = Usuarios.leer(); //Se cargan todos los usuarios en el arraylist usuarios
        Random random = new Random();
        
        int rnd = random.nextInt(usuarios.size());
            
        while (usuarios.get(rnd).getNombre().compareTo(Inicio.getUsuarioSesion().getNombre()) == 0) {
            rnd = (int) Math.random()*usuarios.size();        
        }

        return usuarios.get(rnd);
    }
    
    //Métodos GET y SET
    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre= nombre;
    }

    public String getPass() {
            return pass;
    }

    public void setPass(String pass) {
            this.pass = pass;
    }

    public int getPartidas_ganadas() {
            return partidas_ganadas;
    }

    public void setPartidas_ganadas(int partidas_ganadas) {
            this.partidas_ganadas = partidas_ganadas;
    }

    public int getPartidas_perdidas() {
            return partidas_perdidas;
    }

    public void setPartidas_perdidas(int partidas_perdidas) {
            this.partidas_perdidas = partidas_perdidas;
    }

    public int getPartidas_empatadas() {
            return partidas_empatadas;
    }

    public void setPartidas_empatadas(int partidas_empatadas) {
            this.partidas_empatadas = partidas_empatadas;
    }

    public ArrayList<Partida> getPartidas_completas() {
            return this.partidas_completas;
    }

    public ArrayList<Partida> getPartidas_pendientes() {
            return this.partidas_pendientes;
    }
    
    public void setPartidas_completas(ArrayList<Partida> partidas_completas) {
            this.partidas_completas = partidas_completas;
    }

    public ArrayList<Usuario> getSolicitudes_amigos_recibidas() {
        return this.solicitudes_amigos_recibidas;
    }

    public ArrayList<Usuario> getSolicitudes_amigos_enviadas() {
        return this.solicitudes_amigos_enviadas;
    }

    public ArrayList<Usuario> getAmigos() {
        return this.amigos;
    }

    public static long getSerialversionuid() {
            return serialVersionUID;
    }

    public StringBuilder getMuro() {
        return this.muro;
    }

    public void setMuro (StringBuilder s) {
        if ("".equals(this.getMuro())) {
            this.getMuro().insert(0, s);
        }
        else {
            this.getMuro().append(s);
        }
    }
          
    //Redefinición del metodo equals para comparación de usuarios
    @Override
    public boolean equals (Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Usuario)) return false;
        Usuario o = (Usuario) obj;
        return o.getNombre().equals(this.getNombre());
    }
    
}
