package poo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Partida implements Compartible {
    
    //Variables de definición de las partidas
    private int identificador = 0;
    private Usuario jugador1;
    private Usuario jugador2;
    private String resultado_final;
    private int ptos_jugador1;
    private int ptos_jugador2;
    
    //Variable para el identificador de partida autoincrementable
    private static final AtomicInteger IDCONT = new AtomicInteger(0);
    
    //Constructores
    public Partida() {
        this.identificador = IDCONT.incrementAndGet();
        this.jugador1 = null;
        this.jugador2 = null;
        this.resultado_final = "0-0";
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;   
    }

    public Partida(Usuario jugador1, Usuario jugador2) {
        this.identificador = IDCONT.incrementAndGet();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.resultado_final = (ptos_jugador1 + " - " + ptos_jugador2);
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;
    }
    
    public Partida(Usuario jugador1, Usuario jugador2, String resultado_final, int ptos_jugador1, int ptos_jugador2) {
        this.identificador = IDCONT.incrementAndGet();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.resultado_final = resultado_final;
        this.ptos_jugador1 = ptos_jugador1;
        this.ptos_jugador2 = ptos_jugador2;
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

    @Override
    public String toString () {
        return '\n' + "  ---- PARTIDA ----  " + '\n' + "  Id: " + this.identificador + '\n' + "  Jugador 1: " + this.jugador1.getNombre() + '\n' + "  Jugador 2: " + this.jugador2.getNombre() + '\n' + "  Puntos del jugador 1: " + this.ptos_jugador1 + '\n' + "  Puntos del jugador 2: " + this.ptos_jugador2 + '\n';
    }    
    
} 
