package poo;
public class Pregunta {
    private int id;
    private Pelicula pelicula;
    private int puntos_jugador_1;
    private int puntos_jugador_2;

    public Pregunta(int id, Pelicula pelicula, int puntos_jugador_1, int puntos_jugador_2) {
        this.id = id;
        this.pelicula = pelicula;
        this.puntos_jugador_1 = puntos_jugador_1;
        this.puntos_jugador_2 = puntos_jugador_2;
    }
    
    
    public void seleccionarPelicula (Peliculas film) {
        
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
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPuntos_jugador_1() {
        return puntos_jugador_1;
    }

    public void setPuntos_jugador_1(int puntos_jugador_1) {
        this.puntos_jugador_1 = puntos_jugador_1;
    }

    public int getPuntos_jugador_2() {
        return puntos_jugador_2;
    }

    public void setPuntos_jugador_2(int puntos_jugador_2) {
        this.puntos_jugador_2 = puntos_jugador_2;
    }
    
    
    
    
}
