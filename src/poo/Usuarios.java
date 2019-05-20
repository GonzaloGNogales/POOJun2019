package poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;


public class Usuarios{
	static final String NOMBRE_ARCHIVO = "usuarios.txt";
	static final String RUTA = "C:/Users/Vicente/Desktop/JavaShit/" + NOMBRE_ARCHIVO;
	
	public static void main(String[] args) {
		System.out.println(RUTA);
		Usuarios usuLog = new Usuarios();			// usuario del login   /********************************************************Constructor en pruebas
		usuLog.registrar();
	}
	
	
	public void autenticar () {
		Usuario u = new Usuario();
		Vector<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
		for(Usuario usuario:logReg) {
			if ((usuario.getNombre().compareTo(u.getNombre()) == 0) && (usuario.getPass().compareTo(u.getPass()) == 0) ) {
				System.out.println("Log-In Correcto");
			}
			else { System.out.println("Usuario not found");}
		}
	}
    
    public void registrar () {
		Usuario usu = new Usuario();			// usuario que se va a registrar
		Vector<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
		boolean repetido = false;
		for(Usuario usuario:logReg ) {
			if (usuario.getNombre().compareTo(usu.getNombre()) == 0) { 
				repetido = true;
				System.out.println("El usuario ya existe");
			}
		}
		if (!repetido) {
			logReg.add(usu);
		}
		escribir(logReg);
		for(Usuario usuario: logReg ) {
			System.out.println("usuario: "+ usuario.getNombre());
		}
    }
    
    private static Vector<Usuario> leer() { 
		Vector<Usuario> vectorLeido = new Vector<Usuario>(0);
		try {
		ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(RUTA));
		vectorLeido = (Vector<Usuario>) ficheroLect.readObject();
		ficheroLect.close();
		}catch(Exception e) {
			System.out.println("Exception leer fichero.");
		}
		return vectorLeido;
	}
	private static void escribir(Vector<Usuario> vectEscr) {
		try {
		ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(RUTA));
		ficheroEscr.writeObject(vectEscr);
		ficheroEscr.close();
		}catch(Exception e) {
			System.out.println("Exception al Escribir");
		}
	}   
}
