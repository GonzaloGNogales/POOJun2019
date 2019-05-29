package poo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Pregunta {
    //Variable para el identificador de partida autoincrementable
    private static final AtomicInteger IDCONT = new AtomicInteger(0);
    
    //Variables que definen una pregunta
    private int id = 0;
    private Pelicula pelicula;
    private int puntos_jugador_1;
    private int puntos_jugador_2;

    
    //Constructores
    public Pregunta(Pelicula pelicula, int puntos_jugador_1, int puntos_jugador_2) {
        this.id = IDCONT.incrementAndGet();
        this.pelicula = pelicula;
        this.puntos_jugador_1 = puntos_jugador_1;
        this.puntos_jugador_2 = puntos_jugador_2;
    }
    
    
    //Funcionalidad requerida
    public static Pelicula seleccionarPelicula (Peliculas films) {
        Random random = new Random();
        int rnd = 0;
        ArrayList <Pelicula> peliculas = films.verInfoPeliculas();
        
        while (rnd < 0 || rnd > peliculas.size()) {
            rnd = random.nextInt();
        }
        
        return peliculas.get(rnd);
    }
    
    public void ofrecerNuevaPista () {
        
    }
       
    //Métodos GET y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPuntos_jugador_1() {
        return this.puntos_jugador_1;
    }

    public void setPuntos_jugador_1(int puntos_jugador_1) {
        this.puntos_jugador_1 = puntos_jugador_1;
    }

    public int getPuntos_jugador_2() {
        return this.puntos_jugador_2;
    }

    public void setPuntos_jugador_2(int puntos_jugador_2) {
        this.puntos_jugador_2 = puntos_jugador_2;
    }
    
    //Definición de un método similar a toString() para mostrar la pregunta
    public String mostrarPregunta (Pelicula p, int contadorFallo) {
        String pregunta = new String();
        switch (this.id) {
            case 1:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + p.getAño() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + p.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero();
                    case 2:  
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + p.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector();
                    case 3:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + p.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor();
                    case 4:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + p.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor() + '\n' + "Pista nº4: La actriz principal es: " + p.getActriz();                  
                }
                break;
            case 2:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + p.getTitulo() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero();
                    case 2:  
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector();
                    case 3:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor();
                    case 4:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getGenero() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor() + '\n' + "Pista nº4: La actriz principal es: " + p.getActriz();                  
                }
                break;
            case 3:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + p.getTitulo() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el género de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño();
                    case 2:  
                        pregunta = "¿Cuál es el género de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getDirector();
                    case 3:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor();
                    case 4:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getDirector() + '\n' + "Pista nº3: El actor principal es: " + p.getActor() + '\n' + "Pista nº4: La actriz principal es: " + p.getActriz();                  
                }
                break;
            case 4:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + p.getTitulo() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño();
                    case 2:  
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero();
                    case 3:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getActor();
                    case 4:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getActor() + '\n' + "Pista nº4: La actriz principal es: " + p.getActriz();                  
                }
                break;
            case 5:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + p.getTitulo() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño();
                    case 2:  
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero();
                    case 3:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getDirector();
                    case 4:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getDirector()+ '\n' + "Pista nº4: La actriz principal es: " + p.getActriz();                  
                }
                break;
            case 6:
                switch (contadorFallo) {
                    case 0:
                        pregunta = "¿Cuál es la actriz principal de la película cuyo título es " + p.getTitulo() + "?";
                    case 1:    
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño();
                    case 2:  
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero();
                    case 3:
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getDirector();
                    case 4:
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + p.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + p.getAño() + '\n' + "Pista nº2: El director/a es: " + p.getGenero() + '\n' + "Pista nº3: El actor principal es: " + p.getDirector()+ '\n' + "Pista nº4: La actriz principal es: " + p.getActor();                  
                }
                break;   
        }
        
        return pregunta;
        
    }
}

