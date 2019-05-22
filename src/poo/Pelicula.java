package poo;

import java.util.*;
import java.io.*;

public class Pelicula extends Compartible implements Serializable{
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String actor;
    private String actriz;
    
    private ArrayList<Critica> criticas = new ArrayList<>();

    //Constructores
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
    
    
    //Métodos GET y SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return año;
    }

    public void setYear(int año) {
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
    
    
}
