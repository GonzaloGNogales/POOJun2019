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
    
    //Constructor
    public Peliculas () {
        
    }
    
    //Funcionalidad necesaria
    public static ArrayList<Pelicula> verInfoPeliculas () {
    	ArrayList<Pelicula> logReg = leer();  //logReg es el vector con Peliculas registrados
    	
        return logReg;
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

    public static void actualizar (Pelicula p) {
    ArrayList<Pelicula> logReg = leer();  //logReg es el vector con usuarios registrados
    boolean encontrado = false;
    Pelicula aux = new Pelicula ();

    for (Pelicula pelicula: logReg) {
        if (pelicula.getTitulo().compareTo(p.getTitulo()) == 0) { 
            encontrado = true;
            aux = pelicula;
        }
    }
    if (encontrado) {
        logReg.remove(aux);
        logReg.add(p);
    }

    escribir(logReg);
    }
        
    public static ArrayList<Pelicula> leer () { 
        ArrayList<Pelicula> vectorLeido = new ArrayList<Pelicula>(0);
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(archivo));
            vectorLeido = (ArrayList<Pelicula>) ficheroLect.readObject();
            ficheroLect.close();
        }catch(Exception e) {
            System.out.println("Lectura películas fallida.");
        }
        return vectorLeido;
    }
    
    public static void cargarSerializado (String nombre) { 
        ArrayList<Pelicula> vectorLeido = new ArrayList<>();
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(nombre));
            vectorLeido = (ArrayList<Pelicula>) ficheroLect.readObject();
            ficheroLect.close();
            
            if (archivo.exists()) {
                archivo.delete();
                archivo.createNewFile();
                escribir(vectorLeido);
            }
            else {
                archivo.createNewFile();
                escribir(vectorLeido);
            }
        }catch(Exception e) {
            System.out.println("Lectura peliculas fallida.");
        } 
    }

    private static void escribir (ArrayList<Pelicula> vectEscr) {
        try {
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(archivo));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Fallo al escribir película.");
        }
    }
    
    public static void escribirNuevo (ArrayList<Pelicula> vectEscr, String nombre) {
        try {
            File f = new File(nombre);
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(f));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Fallo al escribir película.");
        }
    }
    
    public static Pelicula obtenerPelicula (String nom) {
        ArrayList<Pelicula> logReg = leer();  //logReg es el vector con usuarios registrados
        Pelicula paux = new Pelicula();
        boolean encontrado = false;

        for (Pelicula pelicula: logReg) {
            if (pelicula.getTitulo().compareTo(nom) == 0) { 
                paux = pelicula; 
                encontrado = true;
            }
        }
        if (!encontrado) {
            paux = null;
        }

        return paux;
    }
    
    public static Critica obtenerCritica (String crit) {
        ArrayList<Pelicula> logReg = leer();  //logReg es el vector con usuarios registrados
        Critica caux = new Critica();
        boolean encontrado = false;

        for (Pelicula pelicula: logReg) {
            ArrayList<Critica> criticas = pelicula.getCriticas();
            if (criticas.size() >= 1) {
                for (Critica c: criticas) {                   
                    if (c.getTexto().compareTo(crit) == 0) {
                        caux = c;
                        encontrado = true;
                    }

                }
            }
        }
        
        if (!encontrado) {
            caux = null;
        }

        return caux;
    }
    
    public static ArrayList<Pelicula> obtenerPeliculas () {
        ArrayList<Pelicula> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        for (Pelicula pelicula: logReg) {
            peliculas.add(pelicula);
        }

        return peliculas;
    }    
    
}
