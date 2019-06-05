package poo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Clasificacion {

    public static ArrayList<String> visualizar () {
        //Se muestra el detalle de las partidas de todos los usuarios del sistema
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<String> resultado = new ArrayList<>();
        
        for (Usuario u: usuariosSistema) {
            resultado.add(Item.detallePartidas(u.getNombre()));
        }  
        
        return resultado;
    }
    
    
    
    public ArrayList<String> ordenarVictorias () {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<Item> aux = new ArrayList<>();
           
        //Se introducen todos los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            aux.add(item);              
        }
        
        //Se utiliza la clase abstracta Comparator redefiniendo el método de Collecions para que se ordenen los items de mayor a menor
        Collections.sort(aux, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {		
                    return new Integer(i2.getGanadas()).compareTo(new Integer(i1.getGanadas()));
            }
        });
        
        //Se transforma el array de items ordenados en un array de strings
        ArrayList<String> resultado = new ArrayList<>();

        for (Item i: aux) {
            resultado.add(i.toString());
        }
        
        return resultado;
    }
    
    public ArrayList<String> ordenarPorcentaje () {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<Item> aux = new ArrayList<>();
        
        //Se introducen todos los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            aux.add(item);              
        }
        
        //Se utiliza la clase abstracta Comparator redefiniendo el método de Collecions para que se ordenen los items de mayor a menor
        Collections.sort(aux, new Comparator<Item>() {         
            @Override
            public int compare(Item i1, Item i2) {		
                    return new Double(i2.getPorcentajeVictorias()).compareTo(new Double(i1.getPorcentajeVictorias()));
            }
        });
        
        //Se transforma el array de items ordenados en un array de strings
        ArrayList<String> resultado = new ArrayList<>();
        
        for (Item i: aux) {
            resultado.add(i.toString());
        }
        
        return resultado;
    }
    
    public ArrayList<String> ordenarPuntos () {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<Item> aux = new ArrayList<>();
        
        //Se introducen todos los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            aux.add(item);              
        }

        //Se utiliza la clase abstracta Comparator redefiniendo el método de Collecions para que se ordenen los items de mayor a menor
        Collections.sort(aux, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {		
                    return new Integer(i2.getPtos()).compareTo(new Integer(i1.getPtos()));
            }
        });
        
        //Se transforma el array de items ordenados en un array de strings
        ArrayList<String> resultado = new ArrayList<>();
        
        for (Item i: aux) {
            resultado.add(i.toString());
        }
        
        return resultado;
    }
    
    //Se vuelca toda la información de la clasificación en un archivo TXT
    public void volcarTXT (String nombreArchivo) {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        
        File f = new File(nombreArchivo);

        try {
            if (!f.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));

                for (Usuario u: usuariosSistema) {
                    Item i = new Item(u);

                    bw.write(i.toString());
                    bw.newLine();
                    bw.flush();
                }
            }
            
        }catch(IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }
    
}
