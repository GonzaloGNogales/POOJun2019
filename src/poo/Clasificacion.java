package poo;

import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Clasificacion {
    
    public ArrayList <Item> items = new ArrayList();
    Iterator iter = items.iterator();
   
    //Métodos Get y Set
    public ArrayList<Item> getI() {
        return items;
    }

    public void setI(ArrayList<Item> i) {
        this.items = i;
    }

    public Iterator getIter() {
        return iter;
    }

    public void setIter(Iterator iter) {
        this.iter = iter;
    }
    
         public void actualizar (Partida p) {
        for (Item item : items) {
            Usuario u1 = p.getJugador1();
            Usuario u2 = p.getJugador2();
            if (item.getNombreUsuario().equals(u1.getNombre())) {
               item.setJugadas(item.getJugadas()+1);
               if (p.getPtos_jugador1()>p.getPtos_jugador2()) {
                   item.setPtos(item.getPtos()+3);
                   item.setGanadas(item.getGanadas()+1);
                }else if (p.getPtos_jugador1() == p.getPtos_jugador2()) {
                        p.setPtos_jugador1(item.getPtos()+1);
                }else{
                    item.setPerdidas(item.getPerdidas()+1);
                }item.setPorcentajeVictorias(u1);}      
            
            if (item.getNombreUsuario().equals(u2.getNombre())) {
                item.setJugadas(item.getJugadas()+1);
                if (p.getPtos_jugador2()>p.getPtos_jugador1()) {
                   item.setPtos(item.getPtos()+3);
                   item.setGanadas(item.getGanadas()+1);
                }else if (p.getPtos_jugador1() == p.getPtos_jugador2()) {
                        p.setPtos_jugador2(item.getPtos()+1);
                }else{
                    item.setPerdidas(item.getPerdidas()+1);
                }item.setPorcentajeVictorias(u2);}
        }  
    }
    
    //Hay que probarlo que no se si funciona, si no funciona tengo una versión alternativa

    public void visualizar () {
        while (iter.hasNext()) {
	    System.out.println(((Item)iter.next()).getNombreUsuario());
    	    System.out.println(((Item)iter.next()).getJugadas());
   	    System.out.println(((Item)iter.next()).getGanadas());
    	    System.out.println(((Item)iter.next()).getPerdidas());     
    	    System.out.println(((Item)iter.next()).getPorcentajeVictorias());  
	    System.out.println(((Item)iter.next()).getPtos());    
		}
    }
    
    public void ordenarVictorias () {
        
    }
    
    public void ordenarPorcentaje () {
        
    }
    
    public void ordenarPuntos () {
        
    }
    
    public void volcarTXT (File f) {
    try {
	if (!f.exists()) {
	     f.createNewFile();}
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        for (Item item : items) {
            bw.write(item.toString());
            bw.newLine();
            bw.flush();
        }}catch(IOException e){
            System.out.println("Error E/S: "+ e);
        }
    }
	
    public void leerUsuario (Usuario u){
	
 	Item parcial = new Item(u);
        items.add(parcial);

        }     
    
    public void DetallePartidas (String nombre) {
      for (Item item : items) {
            if (item.getNombreUsuario().equals(nombre)) {
                 System.out.println(item.toString());                   
            }else{
                System.out.println("Este perfil es privado");   
           } 
        }
    }
}
