package poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Peliculas {
	static final String NOMBRE_ARCHIVO = "peliculas.txt";
	static final String RUTA = "C:/Users/Vicente/Desktop/JavaShit/" + NOMBRE_ARCHIVO;

    public void verInfoPeliculas () {
    	Vector<Pelicula> logReg = leer();  //logReg es el vector con Peliculas registrados
    	logReg.toString(); // *** Necesitamos sobreescribir el toString de Pelicula y de critica.
    } 
    
    public Pelicula addPelicula () {
		Pelicula peli = new Pelicula();			// Pelicula que se va a registrar
		Vector<Pelicula> logReg = leer();  //logReg es el vector con Peliculas registrados
		boolean repetido = false;
		for(Pelicula Pelicula: logReg ) {
			if (Pelicula.getTitulo().compareTo(peli.getTitulo()) == 0) { 
				repetido = true;
				System.out.println("la pelicula ya existe");
			}
		}
		if (!repetido) {
			logReg.add(peli);
		}
		escribir(logReg);
		for(Pelicula Pelicula: logReg ) { //pruebas
			System.out.println("Pelicula: "+ Pelicula.getTitulo());
		}
		return peli;
    }
    
        
    private static Vector<Pelicula> leer() { 
		Vector<Pelicula> vectorLeido = new Vector<Pelicula>(0);
		try {
		ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(RUTA));
		vectorLeido = (Vector<Pelicula>) ficheroLect.readObject();
		ficheroLect.close();
		}catch(Exception e) {
			System.out.println("Exception leer fichero.");
		}
		return vectorLeido;
	}
	private static void escribir(Vector<Pelicula> vectEscr) {
		try {
		ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(RUTA));
		ficheroEscr.writeObject(vectEscr);
		ficheroEscr.close();
		}catch(Exception e) {
			System.out.println("Exception al Escribir");
		}
	}   
}
