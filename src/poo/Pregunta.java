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
    
    //Variable para contar los cambios de pista
    private int contadorPista;


    
    //Constructores
    public Pregunta(Pelicula pelicula, int puntos_jugador_1, int puntos_jugador_2) {
        this.id = IDCONT.incrementAndGet();
        this.pelicula = pelicula;
        this.puntos_jugador_1 = puntos_jugador_1;
        this.puntos_jugador_2 = puntos_jugador_2;
        this.contadorPista = 0;
    }
    
    public Pregunta () {
        
    }
    
    public Pregunta (Pregunta pregunta) {
        Peliculas ps = new Peliculas();
        Pelicula peliAux  = seleccionarPelicula(ps);
        
        this.id = IDCONT.incrementAndGet();
        this.pelicula = peliAux;
        this.puntos_jugador_1 = pregunta.getPuntosJugador1();
        this.puntos_jugador_2 = pregunta.getPuntosJugador2();
        this.contadorPista = 0;
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

    public int getPuntosJugador1() {
        return this.puntos_jugador_1;
    }

    public void setPuntosJugador1Fallo() {
        this.puntos_jugador_1 -= 10;
    }
    
    public void setPuntosJugador1Acierto() {
        this.puntos_jugador_1 += 50;
    }

    public int getPuntosJugador2() {
        return this.puntos_jugador_2;
    }
    
    public int setPuntosJugador2Fallo() {
        return this.puntos_jugador_2 -= 10;
    }

    public void setPuntosJugador2Acierto() {
        this.puntos_jugador_2 += 50;
    }
    
    public int getContadorPista() {
        return this.contadorPista;
    }

    public void subirContadorPista() {
        this.contadorPista++;
    }
    
    //Definición de un método similar a toString() para mostrar la pregunta
    @Override
    public String toString () {
        String pregunta = new String();
        switch (this.id) {
            case 1:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + this.pelicula.getAño() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + this.pelicula.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + this.pelicula.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + this.pelicula.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el título de la película cuyo año de distribución es " + this.pelicula.getAño() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor() + '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActriz();                  
                        break;
                }
                break;
            case 2:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + this.pelicula.getTitulo() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el año de distribución de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getGenero() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor() + '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActriz();                  
                        break;
                }
                break;
            case 3:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + this.pelicula.getTitulo() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el género de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el género de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el género de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getDirector() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor() + '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActriz();                  
                        break;
                }
                break;
            case 4:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + this.pelicula.getTitulo() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el director/a de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getActor() + '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActriz();                  
                        break;
                }
                break;
            case 5:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + this.pelicula.getTitulo() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getDirector();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el actor principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getDirector()+ '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActriz();                  
                        break;
                }
                break;
            case 6:
                switch (this.contadorPista) {
                    case 0:
                        pregunta = "¿Cuál es la actriz principal de la película cuyo título es " + this.pelicula.getTitulo() + "?";
                        break;
                    case 1:    
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño();
                        break;
                    case 2:  
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero();
                        break;
                    case 3:
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getDirector();
                        break;
                    case 4:
                        pregunta = "¿Cuál es el actriz principal de la película cuyo título es " + this.pelicula.getTitulo() + "?" + '\n' + "Pista nº1: Su género es: " + this.pelicula.getAño() + '\n' + "Pista nº2: El director/a es: " + this.pelicula.getGenero() + '\n' + "Pista nº3: El actor principal es: " + this.pelicula.getDirector()+ '\n' + "Pista nº4: La actriz principal es: " + this.pelicula.getActor();                  
                        break;
                }
                break;   
        }
        
        return pregunta;
        
    }
}

