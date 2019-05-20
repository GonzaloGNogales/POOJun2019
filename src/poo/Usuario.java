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
    private Vector <Usuario> solicitudes_amigos_recibidas = new Vector <Usuario> (0);
    private Vector <Usuario> solicitudes_amigos_enviadas = new Vector <Usuario> (0);
    private Vector <Usuario> amigos = new Vector <Usuario> (0);
    
    
    public Usuario () { //Falta aÃ±adir que el usuario pueda poner nombre y contraseÃ±a (Enterno grafico)
        this.nombre = "a";
        this.pass = "a";
        this.muro = null;
        this.partidas_ganadas = 0;
        this.partidas_perdidas = 0;
        this.partidas_empatadas = 0;
    }
    
    //u.invitarAmigo(u2); u invita a u2
    
    public void invitarAmigo (Usuario u) {     
        u.getSolicitudes_amigos_recibidas().add(this);
        this.solicitudes_amigos_enviadas.add(u);
    }
    
    
    //u.aceptarInvitacion(u2); u acepta la invitacion de u2
    public void aceptarInvitacion (Usuario u) {
        this.amigos.add(u);
        u.getAmigos().add(this);    
        this.solicitudes_amigos_enviadas.remove(u);
        u.getSolicitudes_amigos_recibidas().remove(this);
  
    }
    

    //u.rechazarInvitacion(u2); u rechaza la invitacion de u2
    public void rechazarInvitacion (Usuario u) {
        this.solicitudes_amigos_recibidas.remove(u);
        u.getSolicitudes_amigos_enviadas().remove(this);        
    }

    public void compartirPelicula (Pelicula p) {
        
    }
    
    public void compartirPelicula (Pelicula p, Usuario u) {
        
    }
    
    public void compartirCritica (Critica c) {
        
    }
    
    public void compartirCritica (Critica c, Usuario u) {
        
    }
    
    public void compartirPartida (Partida p) {
        
    }
    
    public void compartirPartida (Partida p, Usuario u) {
        
    }
    
    public void compartirTodo () {
        
    }
    
    public void compartirTodo (Usuario u) {
        
    }
    
    public void addPelicula () { //lo mismo que con critica
    	Peliculas aux = new Peliculas();
    	Pelicula p = aux.addPelicula();
    	
        StringBuilder m_aux = new StringBuilder();
        
        m_aux.append(p.getTitulo());
        m_aux.append(p.getActor());
        m_aux.append(p.getActriz());
        m_aux.append(p.getYear());
        m_aux.append(p.getDirector());
        m_aux.append(p.getGenero());
        
        this.setMuro(m_aux);
        
    }
    
    public void addCritica (Pelicula p) { // Ni idea de como se usa el StringBuilder; Hago parte de Critica + Pelicula
// He quitado parametro de entrada critica y lo pongo como salida de metodo addCritica de Pelicula.
    	
    	Critica c = p.addCritica();  // Metodo que añade critica en vector de criticas + devuelve la critica así la usas aquí
    	
        StringBuilder m_aux = new StringBuilder();
        
        if (c.getPelicula() == p.getTitulo()) {
            m_aux.append(c.getPuntuacion());
            m_aux.append(c.getTexto());
            this.setMuro(m_aux);
        }
        else
            System.err.println("La cirtica no coincide con la pelicula.");
  
    }
    
    public void iniciarPartida (Usuario u) {
        
    }
    
    public void completarPartida (Partida p) {
        
    }
    
    //-------------**GETTERS & SETTERS**---------------------- 

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

	public void setPartidas_completas(Partida[] partidas_completas) {
		this.partidas_completas = partidas_completas;
	}
        
        public Vector<Usuario> getSolicitudes_amigos_recibidas() {
            return solicitudes_amigos_recibidas;
        }

        public Vector<Usuario> getSolicitudes_amigos_enviadas() {
            return solicitudes_amigos_enviadas;
        }

        public Vector<Usuario> getAmigos() {
            return amigos;
        }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StringBuilder getMuro() {
		return muro;
	}
    
        public void setMuro (StringBuilder s) {
        this.muro = s; 
    }
}
