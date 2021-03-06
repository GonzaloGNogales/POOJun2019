package poo;

import java.io.Serializable;
import java.util.ArrayList;

public class Partida implements Compartible, Serializable {
    
    //Variables de definición de las partidas
    private int identificador;
    private Usuario jugador1;
    private Usuario jugador2;
    private String resultado_final;
    private int ptos_jugador1;
    private int ptos_jugador2;
    
    //Variable para marcar como parcial la partida cuando ya ha respondido el jugador1 y espera al jugador 2
    private boolean parcial;
    
    
    //Constructores
    public Partida() {
        this.identificador = 0;
        this.jugador1 = null;
        this.jugador2 = null;
        this.resultado_final = "0-0";
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0; 
        this.parcial = false;
    }

    public Partida(int id, Usuario jugador1, Usuario jugador2) {
        this.identificador = id;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.resultado_final = (ptos_jugador1 + " - " + ptos_jugador2);
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;
        this.parcial = false;
    }
    
    public Partida(int id, Usuario jugador1, Usuario jugador2, String resultado_final, int ptos_jugador1, int ptos_jugador2) {
        this.identificador = id;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.resultado_final = resultado_final;
        this.ptos_jugador1 = ptos_jugador1;
        this.ptos_jugador2 = ptos_jugador2;
    }

    
    //Implementación de los métodos abstractos para Crítica
    @Override
    public void compartir (Usuario u) {
               
        StringBuilder sbc1 = new StringBuilder(this.toString());
        if (u.getMuro().indexOf(String.valueOf(this.getIdentificador())) == -1) {
            sbc1.append("  Compartido por: ").append(Inicio.getUsuarioSesion().getNombre()).append('\n');
            u.setMuro(sbc1);
            Usuarios.actualizar(u);
        }

    }
    
    @Override
    public void compartir (ArrayList<Usuario> users) {
        
        StringBuilder sbc2 = new StringBuilder(this.toString());    
        for (Usuario us: users) {
            Usuario uAux = Usuarios.obtenerUsuario(us.getNombre());
            if (uAux.getMuro().indexOf(String.valueOf(this.getIdentificador())) == -1) {
                sbc2.append("  Compartido por: ").append(Inicio.getUsuarioSesion().getNombre()).append('\n');
                uAux.setMuro(sbc2);  
                Usuarios.actualizar(uAux);
            }       
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

    public void setJugador1(Usuario j1) {
        this.jugador1 = j1;
    }
    
    public Usuario getJugador2() {
        return jugador2;
    }

    public void setJugador2(Usuario j2) {
        this.jugador2 = j2;
    }

    public String getResultado_final() {
        return resultado_final;
    }

    public void setResultado_final(int resultado1, int resultado2) {
        this.resultado_final = (resultado1 + " - " + resultado2);
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
    
    public boolean getParcial () {
        return parcial;
    }
    
    public void setParcial (boolean valor) {
        this.parcial = valor;
    }

    @Override
    public String toString () {
        return '\n' + "  ---- PARTIDA ----  " + '\n' + "  Id: " + this.identificador + '\n' + "  Jugador 1: " + this.jugador1.getNombre() + '\n' + "  Jugador 2: " + this.jugador2.getNombre() + '\n' + "  Puntos del jugador 1: " + this.ptos_jugador1 + '\n' + "  Puntos del jugador 2: " + this.ptos_jugador2 + '\n';
    }   
    
    public String mostrarCompleta () {
        return '\n' + "  ---- PARTIDA ----  " + '\n' + "  Id: " + this.identificador + '\n' + "  Jugador 1: " + this.jugador1.getNombre() + '\n' + "  Jugador 2: " + this.jugador2.getNombre() + '\n' + "  Resultado Final: " + this.resultado_final + '\n';
    } 
    
} 
