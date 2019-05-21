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
    
    private ArrayList<Usuario> solicitudes_amigos_pendientes = new ArrayList<>();
    private ArrayList<Usuario> solicitudes_amigos_recibidas = new ArrayList<>();
    private ArrayList<Usuario> solicitudes_amigos_enviadas = new ArrayList<>();
    private ArrayList<Usuario> amigos = new ArrayList<>();
    
    //Constructores
    public Usuario () { //Falta añadir que el usuario pueda poner nombre y contraseña (Enterno grafico)
        this.nombre = "a";
        this.pass = "a";
        this.muro = null;
        this.partidas_ganadas = 0;
        this.partidas_perdidas = 0;
        this.partidas_empatadas = 0;
    }

    public Usuario(String nombre, String pass, StringBuilder muro, int partidas_ganadas, int partidas_perdidas, int partidas_empatadas, Partida[] partidas_completas, Partida[] partidas_pendientes) {
        this.nombre = nombre;
        this.pass = pass;
        this.muro = muro;
        this.partidas_ganadas = partidas_ganadas;
        this.partidas_perdidas = partidas_perdidas;
        this.partidas_empatadas = partidas_empatadas;
        this.partidas_completas = partidas_completas;
        this.partidas_pendientes = partidas_pendientes;
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
    
    public void addPelicula (Pelicula p) {
        StringBuilder m_aux = new StringBuilder();
        
        m_aux.append(p.getTitulo());
        m_aux.append(p.getActor());
        m_aux.append(p.getActriz());
        m_aux.append(p.getYear());
        m_aux.append(p.getDirector());
        m_aux.append(p.getGenero());
        
        this.setMuro(m_aux);
        
    }
    
    public void addCritica (Pelicula p) {
    	
    	Critica c = new Critica(p);
    	
        StringBuilder m_aux = new StringBuilder();
        
        if (c.getPelicula().equals(p.getTitulo())) {
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

    public ArrayList<Usuario> getSolicitudes_amigos_recibidas() {
        return solicitudes_amigos_recibidas;
    }

    public ArrayList<Usuario> getSolicitudes_amigos_enviadas() {
        return solicitudes_amigos_enviadas;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public static long getSerialversionuid() {
            return serialVersionUID;
    }

    public StringBuilder getMuro() {
            return muro;
    }

    public void setMuro (StringBuilder s) {
        this.muro.append(s); 
    }
}
