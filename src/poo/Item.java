package poo;

public class Item {
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int perdidas;
    private double porcentaje_victorias;
    private int ptos;
    
    public Item (Usuario u) {
	this.nombreUsuario = u.getNombre();
	this.jugadas = (u.getPartidas_ganadas() + u.getPartidas_perdidas() + u.getPartidas_empatadas());
	this.ganadas = u.getPartidas_ganadas();
	this.perdidas = u.getPartidas_perdidas();
	this.porcentaje_victorias = (((u.getPartidas_ganadas()) / (u.getPartidas_ganadas() + u.getPartidas_empatadas() + u.getPartidas_perdidas())) * 100);
	
        //Cálculo del sumatorio de puntos del usuario que se analiza en el item
        int sumatorio_pts = 0;
        for (Partida partida: u.getPartidas_completas()) {
            if (nombreUsuario.equals(partida.getJugador1())) {
                sumatorio_pts += partida.getPtos_jugador1();
            }
            else if (nombreUsuario.equals(partida.getJugador2())) {
                sumatorio_pts += partida.getPtos_jugador2();
            }
        }
        this.ptos = sumatorio_pts;
    }
    
    //Muestra los detalles de las partidas del usuario que coincida con el nombre
    public static String detallePartidas (String nombre) {
        Usuario u = Usuarios.obtenerUsuario(nombre);
        Item i = new Item(u);
        
        return i.toString();
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

