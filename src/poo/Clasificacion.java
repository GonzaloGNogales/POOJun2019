package poo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
        ArrayList<String> resultado = new ArrayList<>();
        
        //Se ordenan los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            
            if (item.getGanadas() > aux.get(0).getGanadas()) {
                aux.add(0, item);
            }
            else {
                aux.add(item);
            }               
        }
        
        //Se transforma el array de items ordenados en un array de strings
        for (Item i: aux) {
            resultado.add(i.toString());
        }
        
        return resultado;
    }
    
    public ArrayList<String> ordenarPorcentaje () {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<Item> aux = new ArrayList<>();
        ArrayList<String> resultado = new ArrayList<>();
        
        //Se ordenan los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            
            if (item.getPorcentajeVictorias() > aux.get(0).getPorcentajeVictorias()) {
                aux.add(0, item);
            }
            else {
                aux.add(item);
            }               
        }
        
        //Se transforma el array de items ordenados en un array de strings
        for (Item i: aux) {
            resultado.add(i.toString());
        }
        
        return resultado;
    }
    
    public ArrayList<String> ordenarPuntos () {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        ArrayList<Item> aux = new ArrayList<>();
        ArrayList<String> resultado = new ArrayList<>();
        
        //Se ordenan los items en un array auxiliar
        for (Usuario u: usuariosSistema) {
            Item item = new Item(u);
            
            if (item.getPtos()> aux.get(0).getPtos()) {
                aux.add(0, item);
            }
            else {
                aux.add(item);
            }               
        }
        
        //Se transforma el array de items ordenados en un array de strings
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
