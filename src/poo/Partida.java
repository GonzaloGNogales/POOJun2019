package poo;
public class Partida implements Compartible {
    private int identificador;
    private Usuario jugador1;
    private Usuario jugador2;
    private String resultado_final;
    private int ptos_jugador1;
    private int ptos_jugador2;
    
    public Partida() {
        this.identificador = 0;
        this.jugador1 = null;
        this.jugador2 = null;
        this.resultado_final = "0-0";
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;   
    }

//Implementación de los métodos abstractos para Crítica
    
    public void compartir (Usuario u) {
        
    }
    public void compartir (Usuario[] users) {
        
    }    
    
 //Implementación Getters y Setters
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Usuario getJugador1() {
        return jugador1;
    }

    public void setJugador1(Usuario ganador) {
        this.jugador1 = ganador;
    }
    
    public Usuario getJugador2() {
        return jugador2;
    }

    public void setJugador2(Usuario ganador) {
        this.jugador2 = ganador;
    }

    public String getResultado_final() {
        return resultado_final;
    }

    public void setResultado_final(String resultado_final) {
        this.resultado_final = resultado_final;
    }

    public int getPtos_jugador1() {
        return ptos_jugador1;
    }

    public void setPtos_jugador1(int ptos_jugador1) {
        this.ptos_jugador1 = ptos_jugador1;
    }

    public int getPtos_jugador2() {
        return ptos_jugador2;
    }

    public void setPtos_jugador2(int ptos_jugador2) {
        this.ptos_jugador2 = ptos_jugador2;
    }
        
    
} 
