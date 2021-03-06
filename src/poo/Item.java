package poo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class Item {
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int empatadas;
    private int perdidas;
    private double porcentaje_victorias;
    private int ptos;
    
    public Item (Usuario u) {
	this.nombreUsuario = u.getNombre();
	this.jugadas = (u.getPartidas_ganadas() + u.getPartidas_perdidas() + u.getPartidas_empatadas());
	this.ganadas = u.getPartidas_ganadas();
        this.empatadas = u.getPartidas_empatadas();
	this.perdidas = u.getPartidas_perdidas();
        
        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.##", separador);
        if ((u.getPartidas_ganadas() + u.getPartidas_perdidas() + u.getPartidas_empatadas()) != 0) {
            double porcentaje = (((double)(u.getPartidas_ganadas()) / (double)(u.getPartidas_ganadas() + u.getPartidas_empatadas() + u.getPartidas_perdidas())) * 100);
            this.porcentaje_victorias = Double.parseDouble(formato.format(porcentaje));
        }
        else {
            this.porcentaje_victorias = 0;
        }
	
        //Cálculo del sumatorio de puntos del usuario que se analiza en el item
        int sumatorio_pts = 0;
        for (Partida partida: u.getPartidas_completas()) {
            if (nombreUsuario.compareTo(partida.getJugador1().getNombre()) == 0) {
                sumatorio_pts += partida.getPtos_jugador1();
            }
            else if (nombreUsuario.compareTo(partida.getJugador2().getNombre()) == 0) {
                sumatorio_pts += partida.getPtos_jugador2();
            }
        }
        this.ptos = sumatorio_pts;
    }
    
    //Muestra los detalles de las partida del usuario que coincida con el nombre
    public static String detallePartida (String nombre) {
        Usuario u = Usuarios.obtenerUsuario(nombre);
        Item i = new Item(u);
        
        return i.toString();
    }
    
    //Muestra los detalles de las partidas del usuario que coincida con el nombre
    public static ArrayList<String> detallePartidas (String nombre) {
        Usuario u = Usuarios.obtenerUsuario(nombre);
        ArrayList<String> resultado = new ArrayList<>();
        
        for (Partida p: u.getPartidas_completas()) {
            resultado.add(p.toString());
        }
        
        return resultado;
    }
    
    //Métodos GET y SET
    public String getNombreUsuario() {
	return nombreUsuario;
    }    

    public void setNombreUsuario (String nombre){
	this.nombreUsuario = nombre;
    }

    public int getJugadas() {
	return jugadas;
    }
    
    public void setJugadas (Usuario u) {
	this.jugadas = (u.getPartidas_ganadas() + u.getPartidas_empatadas() + u.getPartidas_perdidas());
    }
    
    public void setJugadas (int i) {
        this.jugadas = i;
    }
    
    public void setJugadas(String dato){
	this.jugadas = Integer.parseInt(dato);
    }

    public int getGanadas() {
	return ganadas;
    }

    public void setGanadas(int ganadas) {
	this.ganadas = ganadas;
    }

    public int getEmpatadas() {
        return empatadas;
    }

    public void setEmpatadas(int empatadas) {
        this.empatadas = empatadas;
    }
    
    public void setGanadas (String dato){
	this.ganadas = Integer.parseInt(dato);
    }

    public int getPerdidas() {
	return perdidas;
    }

    public void setPerdidas(int perdidas) {
	this.perdidas = perdidas;
    }
    
    public void setPerdidas (String dato){
	this.perdidas = Integer.parseInt(dato);
    }

    public double getPorcentajeVictorias() {
	return this.porcentaje_victorias;
    }

    public void setPorcentajeVictorias(Usuario u) {
	this.porcentaje_victorias = ((this.getGanadas() / this.getJugadas())*100);
    }

    public int getPtos() {
	return ptos;
    }
    
    public void setPtos (int dato){
	this.ptos = dato;
    }

    @Override
    public String toString (){
        return '\n' + " Nombre: " + nombreUsuario + '\n' + 
               " Jugadas: " + jugadas + '\n' +
               " Ganadas: " + ganadas + '\n' +
               " Empatadas: " + empatadas + '\n' +
               " Perdidas: " + perdidas + '\n' +
               " Porcentaje de victorias: " + porcentaje_victorias + '\n' +
               " Puntos: " + ptos + '\n';
    }
}

