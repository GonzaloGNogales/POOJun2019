package poo;

import java.util.*;

public class Pelicula extends Compartible {
    private String titulo;
    private int year;
    private String director;
    private String genero;
    private String actor;
    private String actriz;
    private Vector<Critica> criticas;

    
//Constructor de PelÃ­cula
// Dejo constructor cambiado para hacer pruebas.
//String titulo, int year, String director, String genero, String actor, String actriz
    
    public Pelicula() { //añadir entrada desde interfaz grafica 
        this.titulo = "titulo";
        this.year = 1;
        this.director = "dire";
        this.genero = "genero";
        this.actor = "actor";
        this.actriz = "actriz";
        this.criticas = new Vector<Critica>(0);
    }


    public Critica addCritica() { //No es void para que sea compatible con Usuario
    	Critica crit = new Critica(this);
    	this.criticas.add(crit);
    	return crit;
    }
    
    
    
    
   
//-------------**GETTERS & SETTERS**---------------------- 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
    
    
}
