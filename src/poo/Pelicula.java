package poo;

import java.util.*;
import java.io.*;

public class Pelicula implements Compartible, Serializable{
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String actor;
    private String actriz;
    
    private ArrayList<Critica> criticas = new ArrayList<>();

    //Constructores
    public Pelicula(String titulo, int año, String director, String genero, String actor, String actriz, ArrayList<Critica> criticas) { //add entrada desde interfaz grafica 
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.actor = actor;
        this.actriz = actriz;
        this.criticas = criticas;
    }

    public Pelicula(String titulo, int año, String director, String genero, String actor, String actriz) { //add entrada desde interfaz grafica 
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.actor = actor;
        this.actriz = actriz;
    }
    
    public Pelicula() {
    }

    public Critica addCritica() { //No es void para que sea compatible con Usuario
    	Critica crit = new Critica(this);
    	this.criticas.add(crit);
    	return crit;
    }
    
//Implementación de los métodos abstractos para Crítica
    
    @Override
    public void compartir (Usuario u) {
        
        StringBuilder sb = new StringBuilder(this.toString());
        u.setMuro(sb);
        
    }
    
    @Override
    public void compartir (ArrayList<Usuario> users) {
        
        StringBuilder sb = new StringBuilder(this.toString());    
        for (Usuario u: users) {
            u.setMuro(sb);
        }
          
    }    
    
    //Métodos GET y SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
    
    public ArrayList<Critica> getCriticas () {
        return this.criticas;
    }
    
    @Override
    public String toString () {
        return '\n' + "  Titulo de la película: " + this.titulo + '\n' + "  Año de estreno: " + this.año + '\n' + "  Director: " + this.director + '\n' + "  Género: " + this.genero +'\n' + "  Actor protagonista: " + this.actor + '\n' + "  Actiz protagonista: " + this.actriz + '\n';
    }
    
}
