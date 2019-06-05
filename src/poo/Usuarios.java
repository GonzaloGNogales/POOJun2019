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
	
    //Comprueba que el usuario u pertenece al fichero y que, por consiguiente, está registrado 
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
    
    //Añade el usuario u al fichero de usuarios
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
    
    //Renueva los datos del usuario en el fichero para guardarlos
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
    
    public static ArrayList<Usuario> leer () { 
        ArrayList<Usuario> vectorLeido = new ArrayList<>();
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(archivo));
            vectorLeido = (ArrayList<Usuario>) ficheroLect.readObject();
            ficheroLect.close();
        }catch(Exception e) {
            System.out.println("Lectura usuarios fallida.");
        }
                
	return vectorLeido;
    }
    
    public static void cargarSerializado (String nombre) { 
        ArrayList<Usuario> vectorLeido = new ArrayList<>();
        try {
            ObjectInputStream ficheroLect = new ObjectInputStream(new FileInputStream(nombre));
            vectorLeido = (ArrayList<Usuario>) ficheroLect.readObject();
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
            System.out.println("Lectura usuarios fallida.");
        }                
    }
    
    private static void escribir (ArrayList<Usuario> vectEscr) {
        try {
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(archivo));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Fallo al escribir usuario.");
        }
    }  
    
    public static void escribirNuevo (ArrayList<Usuario> vectEscr, String nombre) {
        try {
            File f = new File(nombre);
            ObjectOutputStream ficheroEscr = new ObjectOutputStream(new FileOutputStream(f));
            ficheroEscr.writeObject(vectEscr);
            ficheroEscr.close();
        }catch(IOException e) {
            System.out.println("Fallo al escribir usuario.");
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
    
    public static ArrayList<Partida> leerPartidasCompletas (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Partida> aux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_completas();                
            }
        }      
        
        return aux;
    }
    
    public static ArrayList<Partida> leerPartidasPendientes (Usuario u) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Partida> aux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            if (usuario.getNombre().compareTo(u.getNombre()) == 0) { 
                aux = usuario.getPartidas_pendientes();                
            }
        }      
        
        return aux;
    }
    
    //Extrae un usuario dado su nombre del fichero de usuarios
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
    
    //Extrae un usuario dado su nombre del fichero de usuarios
    public static ArrayList<Usuario> obtenerJugadores (Partida partida) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        ArrayList<Usuario> ususAux = new ArrayList<>();
        
        for (Usuario usuario: logReg) {
            for (Partida p: usuario.getPartidas_pendientes()) {
                if (p.getIdentificador() == (partida.getIdentificador())) {
                    ususAux.add(usuario); 
                }
            }
        }
        
        return ususAux;
    }
       
    //Extrae un usuario dada una partida del fichero de usuarios
    public static void actualizarUsuariosPartida (Partida partida, ArrayList<Usuario> arrayUsuarios) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Usuario uauxJ1 = new Usuario();
        Usuario uauxJ2 = new Usuario();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        boolean encontrado = false;
        
        //Primera búsqueda de un jugador de la partida
        for (Usuario usuario: logReg) {
            for (Usuario usu: arrayUsuarios) {
                if (usuario.getNombre().compareTo(usu.getNombre()) == 0) {  
                    for (Partida p: usuario.getPartidas_pendientes()) {
                        if (p.getIdentificador() == (partida.getIdentificador())) { 
                            uauxJ1 = usuario; 
                            u1 = usu;
                            encontrado = true;
                        }
                    }   
                }
            }
        }
        
        //Cuando encontramos al jugador lo actualizamos
        if (encontrado) {
            logReg.remove(uauxJ1);
            logReg.add(u1);
            encontrado = false;
        }

        //Segunda búsqueda para encontrar al otro jugador
        for (Usuario usuario: logReg) {
            for (Usuario usu: arrayUsuarios) {
                if (usuario.getNombre().compareTo(usu.getNombre()) == 0 && !(usuario.getNombre().equals(uauxJ1.getNombre()))) {  
                    for (Partida p: usuario.getPartidas_pendientes()) {
                        if (p.getIdentificador() == (partida.getIdentificador())) { 
                            uauxJ2 = usuario; 
                            u2 = usu;
                            encontrado = true;
                        }
                    }   
                }
            }
        }
        
        //Cuando encontramos al jugador lo actualizamos
        if (encontrado) {
            logReg.remove(uauxJ2);
            logReg.add(u2);
        }
        
    }
    
    //Dada una identificación extrae del fichero la partida correspondiente
    public static Partida obtenerPartida (int id) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Partida paux = new Partida();
        boolean encontrado = false;
        
        for (Usuario usuario: logReg) {
            for (Partida p: usuario.getPartidas_pendientes()) {
                if (p.getIdentificador() == (id)) { 
                    paux = p; 
                    encontrado = true;
                }
            }      
        }
        if (!encontrado) {
            paux = null;
        }
        
        return paux;
    }
    
    //Dada una identificación extrae del fichero la partida correspondiente
    public static Partida obtenerPartidaCompleta (int id) {
        ArrayList<Usuario> logReg = leer();  //logReg es el vector con usuarios registrados
        Partida paux = new Partida();
        boolean encontrado = false;
        
        for (Usuario usuario: logReg) {
            for (Partida p: usuario.getPartidas_completas()) {
                if (p.getIdentificador() == (id)) { 
                    paux = p; 
                    encontrado = true;
                }
            }      
        }
        if (!encontrado) {
            paux = null;
        }
        
        return paux;
    }
}
