package poo;

import java.io.*;
import java.util.*;

public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String pass;
	
    private StringBuilder muro;
    private int partidas_ganadas;
    private int partidas_perdidas;
    private int partidas_empatadas;
    private Partida[] partidas_completas;
    private Partida[] partidas_pendientes; 
    
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
    
    public Usuario(String nombre, String pass, StringBuilder muro, int partidas_ganadas, int partidas_perdidas, int partidas_empatadas, Partida[] partidas_completas, Partida[] partidas_pendientes, ArrayList<Usuario> solicitudes_amigos_recibidas, ArrayList<Usuario> solicitudes_amigos_enviadas, ArrayList<Usuario> amigos) {
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
    
    @Override
    public boolean equals (Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Usuario)) return false;
        Usuario o = (Usuario) obj;
        return o.getNombre().equals(this.getNombre());
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
        
    }
    
    public void compartirCritica (Critica c, Usuario u) {
        c.compartir(u);
    }
    
    public void compartirPartida (Partida partida) {
        
    }
    
    public void compartirPartida (Partida partida, Usuario u) {
        partida.compartir(u);
    }
    
    public void compartirTodo () {
        
    }
    
    public void compartirTodo (Usuario u) {
        
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
    
    public void iniciarPartida (Usuario u) {
        
    }
    
    public void completarPartida (Partida partida) {
        
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

    public Partida[] getPartidas_completas() {
            return partidas_completas;
    }

    public Partida[] getPartidas_pendientes() {
            return partidas_pendientes;
    }
    
    public void setPartidas_completas(Partida[] partidas_completas) {
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
}
