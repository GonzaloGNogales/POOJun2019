package poo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Clasificacion {
    
    public void actualizar (Partida p) {
        
    }
    
    public void visualizar () {
        
    }
    
    public void ordenarVictorias () {
        
    }
    
    public void ordenarPorcentaje () {
        
    }
    
    public void ordenarPuntos () {
        
    }
    
    public void volcarTXT (File f, String nombreArchivo) {
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        File archivo = new File(nombreArchivo);
        try {
            if (!archivo.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

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
