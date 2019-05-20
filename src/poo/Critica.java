package poo;
public class Critica extends Compartible {
    private String pelicula;
    private double puntuacion;
    private String texto;

    public Critica (Pelicula p) {
        this.pelicula = p.getTitulo();
        this.puntuacion = 10;
        this.texto = "10 de 10 Ma emosionao";
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
    

}
