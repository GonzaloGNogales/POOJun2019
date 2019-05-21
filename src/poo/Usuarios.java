package poo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Usuarios{
	static File archivo = new File("usuarios.txt");	
	
    public void autenticar (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        
        for(Usuario usuario: logReg) {
            if ((usuario.getNombre().compareTo(u.getNombre()) == 0) && (usuario.getPass().compareTo(u.getPass()) == 0) ) {
                System.out.println("Log-In Correcto");
            }
            else { 
                System.out.println("El usuario o la clave son incorrectos");
            }
        }
    }
    
    public void registrar (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        
        boolean repetido = false;
        for(Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                repetido = true;
                System.out.println("El usuario ya existe");
            }
        }
        if (!repetido) {
            logReg.add(u);
        }
        
        escribir(logReg);
        
        //debug
        for(Usuario usuario: logReg) {
            System.out.println("usuario: "+ usuario.getNombre());
        }
    }
    
    private static ArrayList<Usuario> leer () { 
        ArrayList<Usuario> vectorLeido = new ArrayList<Usuario>(0);
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(archivo.getAbsolutePath()));
            vectorLeido = (ArrayList<Usuario>) ficheroLect.readObject();
            ficheroLect.close();
        }catch(Exception e) {
            System.out.println("Exception leer fichero.");
        }
                
	return vectorLeido;
    }
    
    private static void escribir(ArrayList<Usuario> vectEscr) {
        try {
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(archivo.getAbsolutePath()));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Exception al Escribir");
        }
    }   
}
