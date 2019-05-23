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
	
    public static boolean autenticar (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        boolean encontrado = false;
        
        for(Usuario usuario: logReg) {
            if ((usuario.getNombre().compareTo(u.getNombre()) == 0) && (usuario.getPass().compareTo(u.getPass()) == 0) ) {
                encontrado = true;
            }
        }
        
        return encontrado;
    }
    
    public static boolean registrar (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        boolean terminado = false;
        
        boolean repetido = false;
        for(Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                repetido = true;
            }
        }
        if (!repetido) {
            logReg.add(u);
            terminado = true;
        }
        
        escribir(logReg);
        return terminado;
    }
    
    public static void actualizar (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                logReg.remove(usuario);
                logReg.add(u);
            }
        }
        
        escribir(logReg);
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
    
    private static void escribir (ArrayList<Usuario> vectEscr) {
        try {
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(archivo.getAbsolutePath()));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Exception al Escribir");
        }
    }   
    
    public static StringBuilder leerMuroUsuario (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        StringBuilder aux = new StringBuilder();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getMuro();                
            }
        }      
        
        return aux;
    }
}
