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
    

}
