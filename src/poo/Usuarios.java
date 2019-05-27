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
        boolean encontrado = false;
        Usuario aux = new Usuario ();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                encontrado = true;
                aux = usuario;
            }
        }
        if (encontrado) {
            logReg.remove(aux);
            logReg.add(u);
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
    
    public static ArrayList<Usuario> leerAmigos (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Usuario> aux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getAmigos();                
            }
        }      
        
        return aux;
    }
    
    public static ArrayList<Usuario> leerSolicitudesEnviadas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Usuario> aux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getSolicitudes_amigos_enviadas();                
            }
        }      
        
        return aux;
    }
    
    public static ArrayList<Usuario> leerSolicitudesRecibidas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Usuario> aux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getSolicitudes_amigos_recibidas();                
            }
        }      
        
        return aux;
    }
    
    public static int leerPartidasGanadas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        int aux = 0;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_ganadas();                
            }
        }      
        
        return aux;
    }
    
    public static int leerPartidasPerdidas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        int aux = 0;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_perdidas();                
            }
        }      
        
        return aux;
    }
    
    public static int leerPartidasEmpatadas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        int aux = 0;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_empatadas();                
            }
        }      
        
        return aux;
    }
    
    public static Partida[] leerPartidasCompletas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Partida[] aux = null;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_completas();                
            }
        }      
        
        return aux;
    }
    
    public static Partida[] leerPartidasPendientes (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Partida[] aux = null;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_pendientes();                
            }
        }      
        
        return aux;
    }
    
    public static Usuario obtenerUsuario (String nom) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Usuario uaux = new Usuario();
        boolean encontrado = false;
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(nom) == 0) { 
                uaux = usuario; 
                encontrado = true;
            }
        }
        if (!encontrado) {
            uaux = null;
        }
        
        return uaux;
    }
}
