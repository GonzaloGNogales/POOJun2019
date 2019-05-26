package poo;

import java.io.*;
import java.util.ArrayList;

public class Critica implements Compartible, Serializable {
    private String pelicula;
    private double puntuacion;
    private String texto;

    public Critica (Pelicula p) {
        this.pelicula = p.getTitulo();
        this.puntuacion = 10;
        this.texto = "";
    }   

    public Critica() {
    }

    public Critica(String pelicula, double puntuacion, String texto) {
        this.pelicula = pelicula;
        this.puntuacion = puntuacion;
        this.texto = texto;
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
    
//---------------**GETTERS & SETTERS**----------------    
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String toString () {
        return '\n' + "  Titulo de la película: " + this.pelicula + '\n' + "  Puntuación: " + this.puntuacion + '\n' + "  Crítica: " + this.texto + '\n';
    }
    
}
