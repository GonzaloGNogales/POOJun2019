package poo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Peliculas {
    static File archivo = new File("peliculas.txt");
    
    public void verInfoPeliculas () {
    	ArrayList<Pelicula> logReg = leer();  //logReg es el vector con Peliculas registrados
    	logReg.toString(); // *** Necesitamos sobreescribir el toString de Pelicula y de critica.
    } 

    public static boolean addPelicula (Pelicula p) {
	ArrayList<Pelicula> logReg = leer();  //logReg es el vector con Peliculas registrados
	boolean repetido = false;
        boolean terminado = false;
	
        for(Pelicula pelicula: logReg) {
            if (pelicula.getTitulo().compareTo(p.getTitulo()) == 0) { 
		repetido = true;
            }
	}
	
        if (!repetido) {
            logReg.add(p);
            terminado = true;
	}
	
        escribir(logReg);
        
        return terminado;
    }
        
    public static ArrayList<Pelicula> leer () { 
        ArrayList<Pelicula> vectorLeido = new ArrayList<Pelicula>(0);
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(archivo.getAbsolutePath()));
            vectorLeido = (ArrayList<Pelicula>) ficheroLect.readObject();
            ficheroLect.close();
        }catch(Exception e) {
            System.out.println("Exception leer fichero.");
        }
        return vectorLeido;
    }

    private static void escribir (ArrayList<Pelicula> vectEscr) {
        try {
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(archivo.getAbsolutePath()));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Exception al Escribir");
        }
    }   
}
