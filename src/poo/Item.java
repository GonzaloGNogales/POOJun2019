package poo;

public class Item {
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int perdidas;
    private double porcentaje_victorias;
    private int ptos;
    
    public Item (Usuario u) {
	nombreUsuario = u.getNombre();
	jugadas = (u.getPartidas_ganadas() + u.getPartidas_perdidas() + u.getPartidas_empatadas());
	ganadas = u.getPartidas_ganadas();
	perdidas = u.getPartidas_perdidas();
	porcentaje_victorias = (u.getPartidas_ganadas() / (u.getPartidas_ganadas() + u.getPartidas_empatadas() + u.getPartidas_perdidas()));
	ptos = ((u.getPartidas_ganadas() * 3) + (u.getPartidas_empatadas()));
    }
    
    public void detallePartidas(String nombre) {
        
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
	return porcentaje_victorias;
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
               " Perdidas: " + perdidas + '\n' +
               " Porcentaje de victorias: " + porcentaje_victorias + '\n' +
               " Puntos: " + ptos + '\n';
    }
}

