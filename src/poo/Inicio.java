package poo;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Gonzalo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    
    //Usuario global para gestionar la visualización de todos los datos.
    public static Usuario usuarioSesion = new Usuario();
    
    //Pregunta Local para gestionar las preguntas con los botones
    private Pregunta preguntaLocal = new Pregunta();
    
    //Partida a responder que se selecciona mediante el botón responder partida cuando se ha seleccionado de la lista.
    private Partida partidaResponder = new Partida();
    
    //Variable global que contiene el entero de puntos que se suma al acertar una pregunta
    private int puntuacionAcierto = 50;
    
    //Modelo necesario para ir agregando amigos a la lista para luego con el método setModel() pasarle la estructura creada y preparada al JList.
    private DefaultListModel dlm = new DefaultListModel();
    private DefaultListModel dlmC = new DefaultListModel();
    private DefaultListModel dlmP = new DefaultListModel();
    private DefaultListModel dlmCPartida = new DefaultListModel();
    private DefaultListModel dlmClasificacion = new DefaultListModel();
        
    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JDialog();
        cancelarRegistro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passRegistro = new javax.swing.JTextField();
        nombreRegistro = new javax.swing.JTextField();
        registrarRegistro = new javax.swing.JButton();
        Filmx = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        amigosFilmx = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        altaPeliculaFilmx = new javax.swing.JButton();
        salirFilmx = new javax.swing.JButton();
        cerrarSesionFilmx = new javax.swing.JButton();
        criticarPeliculaFilmx = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        invitarAmigosFILMX = new javax.swing.JButton();
        notificacionesFILMX = new javax.swing.JButton();
        eliminarAmigoFILMX = new javax.swing.JButton();
        refrescarMuroFILMX = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        muroFilmx = new javax.swing.JTextArea();
        compartirPeliculaFilmx = new javax.swing.JButton();
        CompartirPartidaFilmx = new javax.swing.JButton();
        CompartirCriticaFilmx = new javax.swing.JButton();
        CompartirTodoFilmx = new javax.swing.JButton();
        jugarPartidaFilmx = new javax.swing.JButton();
        partidasPendientesFilmx = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        nombreUsuarioSesion = new javax.swing.JLabel();
        clasificacionFilmx = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ajustesFilmx = new javax.swing.JButton();
        SeleccionadorPelicula = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        peliculaSelec = new javax.swing.JComboBox<>();
        selecPelicula = new javax.swing.JButton();
        cancelarSeleccionadorPelicula = new javax.swing.JButton();
        Critica = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        criticaCritica = new javax.swing.JTextArea();
        cancelarCritica = new javax.swing.JButton();
        publicarCritica = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        puntuacionCritica = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        tituloCritica = new javax.swing.JTextField();
        AltaPeliculas = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tituloAlta = new javax.swing.JTextField();
        añoAlta = new javax.swing.JTextField();
        generoAlta = new javax.swing.JTextField();
        directorAlta = new javax.swing.JTextField();
        actorAlta = new javax.swing.JTextField();
        actrizAlta = new javax.swing.JTextField();
        cancelarAlta = new javax.swing.JButton();
        aceptarAlta = new javax.swing.JButton();
        InvitarAmigos = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        usuarioBusInvitarAmigos = new javax.swing.JTextField();
        invitarInvitarAmigos = new javax.swing.JButton();
        cancelarInvitarAmigos = new javax.swing.JButton();
        NotificacionesAmigos = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        solEnviadasNotificacionesAmigos = new javax.swing.JComboBox<>();
        solRecibidasNotificacionesAmigos = new javax.swing.JComboBox<>();
        aceptarNotificacionesAmigos = new javax.swing.JButton();
        rechazarNotificacionesAmigos = new javax.swing.JButton();
        cancelarNotificacionesAmigos = new javax.swing.JButton();
        SeleccionadorCompartirPelicula = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        peliculaSeleccionadaSCP = new javax.swing.JComboBox<>();
        compartirTodosSCP = new javax.swing.JButton();
        cancelarSCP = new javax.swing.JButton();
        compartirSeleccionadosSCP = new javax.swing.JButton();
        SeleccionadorCompartirCritica = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        compartirTodosSCC = new javax.swing.JButton();
        cancelarSCC = new javax.swing.JButton();
        compartirSeleccionadosSCC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        criticaSeleccionadaSCC = new javax.swing.JList<>();
        SeleccionadorCompartirPartida = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        compartirTodosSCPartida = new javax.swing.JButton();
        cancelarCpartidaSCP = new javax.swing.JButton();
        compartirSeleccionadosSCPartida = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        partidaSeleccionadaSCP = new javax.swing.JList<>();
        SeleccionadorCompartirTodo = new javax.swing.JDialog();
        compartirTodosSCT = new javax.swing.JButton();
        compartirSeleccionadosSCT = new javax.swing.JButton();
        cancelarSCT = new javax.swing.JButton();
        PartidasPendientes = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaPendientesPP = new javax.swing.JList<>();
        cancelarPP = new javax.swing.JButton();
        responderPP = new javax.swing.JButton();
        FilmxQuiz = new javax.swing.JDialog();
        cancelarFilmxQuiz = new javax.swing.JButton();
        respuestaFilmxQuiz = new javax.swing.JTextField();
        responderFilmxQuiz = new javax.swing.JButton();
        siguientePistaFilmxQuiz = new javax.swing.JButton();
        jugador2FilmxQuiz = new javax.swing.JLabel();
        jugador1FilmxQuiz = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jugador1FQ = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jugador2FQ = new javax.swing.JLabel();
        puntosJ1FilmxQuiz = new javax.swing.JLabel();
        puntosJ2FilmxQuiz = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        preguntaFilmxQuiz = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        numeroPreguntaFilmxQuiz = new javax.swing.JLabel();
        MenuClasificacion = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaClasificacion = new javax.swing.JList<>();
        cancelarClasificacion = new javax.swing.JButton();
        ordenarPuntosClasificacion = new javax.swing.JButton();
        ordenarVictoriasClasificacion = new javax.swing.JButton();
        ordenarPorcentajeClasificacion = new javax.swing.JButton();
        txtClasificacion = new javax.swing.JButton();
        mostrarDetallesClasificacion = new javax.swing.JButton();
        DetallesClasificacion = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        detallesC = new javax.swing.JTextArea();
        cancelarDetallesClasificacion = new javax.swing.JButton();
        AjustesFilmx = new javax.swing.JDialog();
        guardarUSerializado = new javax.swing.JButton();
        guardarPSerializado = new javax.swing.JButton();
        cancelarAjustes = new javax.swing.JButton();
        cargarP = new javax.swing.JButton();
        cargarU = new javax.swing.JButton();
        cancelarInicio = new javax.swing.JButton();
        inicioSesionInicio = new javax.swing.JButton();
        tituloApp = new javax.swing.JLabel();
        usuInicio = new javax.swing.JTextField();
        registrarseInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passInicio = new javax.swing.JPasswordField();

        Registro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Registro.setTitle("Registro");
        Registro.setIconImage(getIconImage());
        Registro.setModal(true);
        Registro.setResizable(false);
        Registro.setSize(new java.awt.Dimension(330, 300));

        cancelarRegistro.setText("Cancelar");
        cancelarRegistro.setPreferredSize(new java.awt.Dimension(90, 30));
        cancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegistroActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de usuario:");

        jLabel5.setText("Contraseña:");

        nombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistroActionPerformed(evt);
            }
        });

        registrarRegistro.setText("Registrar");
        registrarRegistro.setPreferredSize(new java.awt.Dimension(90, 30));
        registrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addComponent(registrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Filmx.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Filmx.setTitle("Filmx");
        Filmx.setIconImage(getIconImage());
        Filmx.setResizable(false);
        Filmx.setSize(new java.awt.Dimension(1035, 625));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 300));

        jScrollPane1.setViewportView(amigosFilmx);

        jLabel6.setText("Amigos");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 21));

        altaPeliculaFilmx.setText("Alta Película");
        altaPeliculaFilmx.setPreferredSize(new java.awt.Dimension(120, 90));
        altaPeliculaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPeliculaFilmxActionPerformed(evt);
            }
        });

        salirFilmx.setText("Salir");
        salirFilmx.setPreferredSize(new java.awt.Dimension(90, 30));
        salirFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirFilmxActionPerformed(evt);
            }
        });

        cerrarSesionFilmx.setText("Cerrar Sesión");
        cerrarSesionFilmx.setPreferredSize(new java.awt.Dimension(140, 30));
        cerrarSesionFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionFilmxActionPerformed(evt);
            }
        });

        criticarPeliculaFilmx.setText("Criticar Película");
        criticarPeliculaFilmx.setPreferredSize(new java.awt.Dimension(120, 90));
        criticarPeliculaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criticarPeliculaFilmxActionPerformed(evt);
            }
        });

        jLabel16.setText("                                                                                MURO");
        jLabel16.setPreferredSize(new java.awt.Dimension(550, 35));

        invitarAmigosFILMX.setText("Invitar Amigos");
        invitarAmigosFILMX.setPreferredSize(new java.awt.Dimension(120, 40));
        invitarAmigosFILMX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitarAmigosFILMXActionPerformed(evt);
            }
        });

        notificacionesFILMX.setText("Notificaciones");
        notificacionesFILMX.setPreferredSize(new java.awt.Dimension(120, 40));
        notificacionesFILMX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificacionesFILMXActionPerformed(evt);
            }
        });

        eliminarAmigoFILMX.setText("Eliminar Amigo");
        eliminarAmigoFILMX.setPreferredSize(new java.awt.Dimension(120, 40));
        eliminarAmigoFILMX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAmigoFILMXActionPerformed(evt);
            }
        });

        refrescarMuroFILMX.setText("⟳");
        refrescarMuroFILMX.setPreferredSize(new java.awt.Dimension(50, 50));
        refrescarMuroFILMX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarMuroFILMXActionPerformed(evt);
            }
        });

        muroFilmx.setEditable(false);
        muroFilmx.setColumns(20);
        muroFilmx.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        muroFilmx.setRows(5);
        jScrollPane2.setViewportView(muroFilmx);

        compartirPeliculaFilmx.setText("Compartir Película");
        compartirPeliculaFilmx.setPreferredSize(new java.awt.Dimension(150, 45));
        compartirPeliculaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirPeliculaFilmxActionPerformed(evt);
            }
        });

        CompartirPartidaFilmx.setText("Compartir Partida");
        CompartirPartidaFilmx.setPreferredSize(new java.awt.Dimension(150, 45));
        CompartirPartidaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompartirPartidaFilmxActionPerformed(evt);
            }
        });

        CompartirCriticaFilmx.setText("Compartir Crítica");
        CompartirCriticaFilmx.setPreferredSize(new java.awt.Dimension(150, 45));
        CompartirCriticaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompartirCriticaFilmxActionPerformed(evt);
            }
        });

        CompartirTodoFilmx.setText("Compartir Todo");
        CompartirTodoFilmx.setPreferredSize(new java.awt.Dimension(150, 45));
        CompartirTodoFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompartirTodoFilmxActionPerformed(evt);
            }
        });

        jugarPartidaFilmx.setText("Jugar a FilmxQuiz");
        jugarPartidaFilmx.setPreferredSize(new java.awt.Dimension(120, 40));
        jugarPartidaFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarPartidaFilmxActionPerformed(evt);
            }
        });

        partidasPendientesFilmx.setText("Partidas Pendientes");
        partidasPendientesFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidasPendientesFilmxActionPerformed(evt);
            }
        });

        jLabel23.setText("Bienvenido:");

        clasificacionFilmx.setText("🏆");
        clasificacionFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacionFilmxActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoFilmx/logoFilmx.png"))); // NOI18N

        ajustesFilmx.setText("⚙");
        ajustesFilmx.setPreferredSize(new java.awt.Dimension(50, 50));
        ajustesFilmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesFilmxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FilmxLayout = new javax.swing.GroupLayout(Filmx.getContentPane());
        Filmx.getContentPane().setLayout(FilmxLayout);
        FilmxLayout.setHorizontalGroup(
            FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreUsuarioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(altaPeliculaFilmx, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarAmigoFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(criticarPeliculaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invitarAmigosFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FilmxLayout.createSequentialGroup()
                                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(notificacionesFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jugarPartidaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clasificacionFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(partidasPendientesFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FilmxLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(refrescarMuroFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ajustesFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FilmxLayout.createSequentialGroup()
                                .addComponent(compartirPeliculaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CompartirCriticaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addComponent(CompartirPartidaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompartirTodoFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesionFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        FilmxLayout.setVerticalGroup(
            FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FilmxLayout.createSequentialGroup()
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreUsuarioSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FilmxLayout.createSequentialGroup()
                                .addComponent(refrescarMuroFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ajustesFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(FilmxLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(FilmxLayout.createSequentialGroup()
                                            .addComponent(invitarAmigosFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(notificacionesFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jugarPartidaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(clasificacionFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(partidasPendientesFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(eliminarAmigoFILMX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(criticarPeliculaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(altaPeliculaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CompartirPartidaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CompartirTodoFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(compartirPeliculaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompartirCriticaFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(salirFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cerrarSesionFilmx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        SeleccionadorPelicula.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionadorPelicula.setIconImage(getIconImage());
        SeleccionadorPelicula.setModal(true);
        SeleccionadorPelicula.setResizable(false);
        SeleccionadorPelicula.setSize(new java.awt.Dimension(400, 200));

        jLabel8.setText("Seleccione la película que desea criticar:");

        peliculaSelec.setPreferredSize(new java.awt.Dimension(150, 30));

        selecPelicula.setText("Seleccionar");
        selecPelicula.setPreferredSize(new java.awt.Dimension(115, 50));
        selecPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecPeliculaActionPerformed(evt);
            }
        });

        cancelarSeleccionadorPelicula.setText("Cancelar");
        cancelarSeleccionadorPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSeleccionadorPeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionadorPeliculaLayout = new javax.swing.GroupLayout(SeleccionadorPelicula.getContentPane());
        SeleccionadorPelicula.getContentPane().setLayout(SeleccionadorPeliculaLayout);
        SeleccionadorPeliculaLayout.setHorizontalGroup(
            SeleccionadorPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionadorPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SeleccionadorPeliculaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarSeleccionadorPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeleccionadorPeliculaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SeleccionadorPeliculaLayout.createSequentialGroup()
                        .addComponent(peliculaSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(selecPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SeleccionadorPeliculaLayout.setVerticalGroup(
            SeleccionadorPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(SeleccionadorPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peliculaSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(cancelarSeleccionadorPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Critica.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Critica.setIconImage(getIconImage());
        Critica.setModal(true);
        Critica.setResizable(false);
        Critica.setSize(new java.awt.Dimension(640, 465));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(450, 200));

        criticaCritica.setColumns(20);
        criticaCritica.setRows(5);
        jScrollPane3.setViewportView(criticaCritica);
        criticaCritica.getAccessibleContext().setAccessibleParent(Critica);

        cancelarCritica.setText("Cancelar");
        cancelarCritica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCriticaActionPerformed(evt);
            }
        });

        publicarCritica.setText("Publicar");
        publicarCritica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicarCriticaActionPerformed(evt);
            }
        });

        jLabel18.setText("Título de la película:");
        jLabel18.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel19.setText("Puntuación:");
        jLabel19.setPreferredSize(new java.awt.Dimension(120, 30));

        puntuacionCritica.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel20.setText("Crítica:");
        jLabel20.setPreferredSize(new java.awt.Dimension(120, 30));

        tituloCritica.setEditable(false);
        tituloCritica.setPreferredSize(new java.awt.Dimension(462, 30));

        javax.swing.GroupLayout CriticaLayout = new javax.swing.GroupLayout(Critica.getContentPane());
        Critica.getContentPane().setLayout(CriticaLayout);
        CriticaLayout.setHorizontalGroup(
            CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CriticaLayout.createSequentialGroup()
                        .addGap(0, 378, Short.MAX_VALUE)
                        .addComponent(publicarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(cancelarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CriticaLayout.createSequentialGroup()
                        .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CriticaLayout.createSequentialGroup()
                                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(puntuacionCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CriticaLayout.setVerticalGroup(
            CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntuacionCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(CriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicarCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Critica.getAccessibleContext().setAccessibleParent(Critica);

        AltaPeliculas.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AltaPeliculas.setIconImage(getIconImage());
        AltaPeliculas.setModal(true);
        AltaPeliculas.setResizable(false);
        AltaPeliculas.setSize(new java.awt.Dimension(400, 430));

        jLabel10.setText("Título:");

        jLabel11.setText("Año de estreno:");

        jLabel12.setText("Género:");

        jLabel13.setText("Director/a:");

        jLabel14.setText("Actor protagonista:");

        jLabel15.setText("Actriz protagonista:");

        tituloAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloAltaActionPerformed(evt);
            }
        });

        cancelarAlta.setText("Cancelar");
        cancelarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaActionPerformed(evt);
            }
        });

        aceptarAlta.setText("Dar de Alta");
        aceptarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AltaPeliculasLayout = new javax.swing.GroupLayout(AltaPeliculas.getContentPane());
        AltaPeliculas.getContentPane().setLayout(AltaPeliculasLayout);
        AltaPeliculasLayout.setHorizontalGroup(
            AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltaPeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltaPeliculasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cancelarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AltaPeliculasLayout.createSequentialGroup()
                        .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(AltaPeliculasLayout.createSequentialGroup()
                                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actrizAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(directorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(generoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(añoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AltaPeliculasLayout.setVerticalGroup(
            AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltaPeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tituloAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(añoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(generoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(directorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(actorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(actrizAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(AltaPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        InvitarAmigos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        InvitarAmigos.setTitle("Invitar Amigos");
        InvitarAmigos.setIconImage(getIconImage());
        InvitarAmigos.setModal(true);
        InvitarAmigos.setPreferredSize(new java.awt.Dimension(520, 235));
        InvitarAmigos.setResizable(false);
        InvitarAmigos.setSize(new java.awt.Dimension(520, 235));

        jLabel7.setText("Introduzca el nombre del usuario que quiere agregar:");
        jLabel7.setPreferredSize(new java.awt.Dimension(310, 40));

        usuarioBusInvitarAmigos.setPreferredSize(new java.awt.Dimension(310, 40));

        invitarInvitarAmigos.setText("Invitar");
        invitarInvitarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitarInvitarAmigosActionPerformed(evt);
            }
        });

        cancelarInvitarAmigos.setText("Cancelar");
        cancelarInvitarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInvitarAmigosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InvitarAmigosLayout = new javax.swing.GroupLayout(InvitarAmigos.getContentPane());
        InvitarAmigos.getContentPane().setLayout(InvitarAmigosLayout);
        InvitarAmigosLayout.setHorizontalGroup(
            InvitarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvitarAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InvitarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioBusInvitarAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(invitarInvitarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvitarAmigosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarInvitarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        InvitarAmigosLayout.setVerticalGroup(
            InvitarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvitarAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InvitarAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioBusInvitarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invitarInvitarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(cancelarInvitarAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        InvitarAmigos.getAccessibleContext().setAccessibleParent(Filmx);

        NotificacionesAmigos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NotificacionesAmigos.setIconImage(getIconImage());
        NotificacionesAmigos.setModal(true);
        NotificacionesAmigos.setResizable(false);
        NotificacionesAmigos.setSize(new java.awt.Dimension(436, 263));

        jLabel9.setText("Solicitudes enviadas:");

        jLabel17.setText("Solicitudes recibidas:");

        solEnviadasNotificacionesAmigos.setPreferredSize(new java.awt.Dimension(180, 30));

        solRecibidasNotificacionesAmigos.setPreferredSize(new java.awt.Dimension(186, 30));

        aceptarNotificacionesAmigos.setText("Aceptar");
        aceptarNotificacionesAmigos.setPreferredSize(new java.awt.Dimension(80, 30));
        aceptarNotificacionesAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarNotificacionesAmigosActionPerformed(evt);
            }
        });

        rechazarNotificacionesAmigos.setText("Rechazar");
        rechazarNotificacionesAmigos.setPreferredSize(new java.awt.Dimension(80, 30));
        rechazarNotificacionesAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechazarNotificacionesAmigosActionPerformed(evt);
            }
        });

        cancelarNotificacionesAmigos.setText("Cancelar");
        cancelarNotificacionesAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNotificacionesAmigosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NotificacionesAmigosLayout = new javax.swing.GroupLayout(NotificacionesAmigos.getContentPane());
        NotificacionesAmigos.getContentPane().setLayout(NotificacionesAmigosLayout);
        NotificacionesAmigosLayout.setHorizontalGroup(
            NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificacionesAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(solEnviadasNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarNotificacionesAmigos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotificacionesAmigosLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotificacionesAmigosLayout.createSequentialGroup()
                        .addComponent(aceptarNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechazarNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(solRecibidasNotificacionesAmigos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        NotificacionesAmigosLayout.setVerticalGroup(
            NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificacionesAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotificacionesAmigosLayout.createSequentialGroup()
                        .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solEnviadasNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solRecibidasNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(NotificacionesAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rechazarNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotificacionesAmigosLayout.createSequentialGroup()
                        .addGap(0, 211, Short.MAX_VALUE)
                        .addComponent(cancelarNotificacionesAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        SeleccionadorCompartirPelicula.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionadorCompartirPelicula.setIconImage(getIconImage());
        SeleccionadorCompartirPelicula.setModal(true);
        SeleccionadorCompartirPelicula.setResizable(false);
        SeleccionadorCompartirPelicula.setSize(new java.awt.Dimension(300, 305));

        jLabel21.setText("Seleccione la película que desea compartir:");

        peliculaSeleccionadaSCP.setPreferredSize(new java.awt.Dimension(150, 30));

        compartirTodosSCP.setText("Compartir con todos");
        compartirTodosSCP.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirTodosSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirTodosSCPActionPerformed(evt);
            }
        });

        cancelarSCP.setText("Cancelar");
        cancelarSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSCPActionPerformed(evt);
            }
        });

        compartirSeleccionadosSCP.setText("Compartir seleccionados");
        compartirSeleccionadosSCP.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirSeleccionadosSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirSeleccionadosSCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionadorCompartirPeliculaLayout = new javax.swing.GroupLayout(SeleccionadorCompartirPelicula.getContentPane());
        SeleccionadorCompartirPelicula.getContentPane().setLayout(SeleccionadorCompartirPeliculaLayout);
        SeleccionadorCompartirPeliculaLayout.setHorizontalGroup(
            SeleccionadorCompartirPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionadorCompartirPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SeleccionadorCompartirPeliculaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeleccionadorCompartirPeliculaLayout.createSequentialGroup()
                        .addGroup(SeleccionadorCompartirPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(peliculaSeleccionadaSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compartirTodosSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compartirSeleccionadosSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SeleccionadorCompartirPeliculaLayout.setVerticalGroup(
            SeleccionadorCompartirPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(peliculaSeleccionadaSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compartirTodosSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compartirSeleccionadosSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cancelarSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SeleccionadorCompartirPelicula.getAccessibleContext().setAccessibleParent(Filmx);

        SeleccionadorCompartirCritica.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionadorCompartirCritica.setIconImage(getIconImage());
        SeleccionadorCompartirCritica.setModal(true);
        SeleccionadorCompartirCritica.setPreferredSize(new java.awt.Dimension(1000, 475));
        SeleccionadorCompartirCritica.setResizable(false);
        SeleccionadorCompartirCritica.setSize(new java.awt.Dimension(1000, 475));

        jLabel22.setText("Seleccione la crítica que desea compartir:");

        compartirTodosSCC.setText("Compartir con todos");
        compartirTodosSCC.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirTodosSCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirTodosSCCActionPerformed(evt);
            }
        });

        cancelarSCC.setText("Cancelar");
        cancelarSCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSCCActionPerformed(evt);
            }
        });

        compartirSeleccionadosSCC.setText("Compartir seleccionados");
        compartirSeleccionadosSCC.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirSeleccionadosSCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirSeleccionadosSCCActionPerformed(evt);
            }
        });

        criticaSeleccionadaSCC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(criticaSeleccionadaSCC);
        criticaSeleccionadaSCC.getAccessibleContext().setAccessibleParent(Filmx);

        javax.swing.GroupLayout SeleccionadorCompartirCriticaLayout = new javax.swing.GroupLayout(SeleccionadorCompartirCritica.getContentPane());
        SeleccionadorCompartirCritica.getContentPane().setLayout(SeleccionadorCompartirCriticaLayout);
        SeleccionadorCompartirCriticaLayout.setHorizontalGroup(
            SeleccionadorCompartirCriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirCriticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionadorCompartirCriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SeleccionadorCompartirCriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionadorCompartirCriticaLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(cancelarSCC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(compartirTodosSCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compartirSeleccionadosSCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        SeleccionadorCompartirCriticaLayout.setVerticalGroup(
            SeleccionadorCompartirCriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirCriticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(SeleccionadorCompartirCriticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionadorCompartirCriticaLayout.createSequentialGroup()
                        .addComponent(compartirTodosSCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(compartirSeleccionadosSCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                        .addComponent(cancelarSCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        SeleccionadorCompartirCritica.getAccessibleContext().setAccessibleParent(Filmx);

        SeleccionadorCompartirPartida.setIconImage(getIconImage());
        SeleccionadorCompartirPartida.setSize(new java.awt.Dimension(1000, 475));

        jLabel28.setText("Seleccione la partida que desea compartir:");

        compartirTodosSCPartida.setText("Compartir con todos");
        compartirTodosSCPartida.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirTodosSCPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirTodosSCPartidaActionPerformed(evt);
            }
        });

        cancelarCpartidaSCP.setText("Cancelar");
        cancelarCpartidaSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCpartidaSCPActionPerformed(evt);
            }
        });

        compartirSeleccionadosSCPartida.setText("Compartir seleccionados");
        compartirSeleccionadosSCPartida.setPreferredSize(new java.awt.Dimension(180, 50));
        compartirSeleccionadosSCPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirSeleccionadosSCPartidaActionPerformed(evt);
            }
        });

        partidaSeleccionadaSCP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(partidaSeleccionadaSCP);

        javax.swing.GroupLayout SeleccionadorCompartirPartidaLayout = new javax.swing.GroupLayout(SeleccionadorCompartirPartida.getContentPane());
        SeleccionadorCompartirPartida.getContentPane().setLayout(SeleccionadorCompartirPartidaLayout);
        SeleccionadorCompartirPartidaLayout.setHorizontalGroup(
            SeleccionadorCompartirPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionadorCompartirPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionadorCompartirPartidaLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 532, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SeleccionadorCompartirPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionadorCompartirPartidaLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(cancelarCpartidaSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(compartirTodosSCPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compartirSeleccionadosSCPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        SeleccionadorCompartirPartidaLayout.setVerticalGroup(
            SeleccionadorCompartirPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(SeleccionadorCompartirPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionadorCompartirPartidaLayout.createSequentialGroup()
                        .addComponent(compartirTodosSCPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(compartirSeleccionadosSCPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                        .addComponent(cancelarCpartidaSCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );

        SeleccionadorCompartirTodo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionadorCompartirTodo.setIconImage(getIconImage());
        SeleccionadorCompartirTodo.setModal(true);
        SeleccionadorCompartirTodo.setResizable(false);
        SeleccionadorCompartirTodo.setSize(new java.awt.Dimension(255, 250));

        compartirTodosSCT.setText("Compartir con todos");
        compartirTodosSCT.setPreferredSize(new java.awt.Dimension(200, 60));
        compartirTodosSCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirTodosSCTActionPerformed(evt);
            }
        });

        compartirSeleccionadosSCT.setText("Compartir seleccionados");
        compartirSeleccionadosSCT.setPreferredSize(new java.awt.Dimension(200, 60));
        compartirSeleccionadosSCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartirSeleccionadosSCTActionPerformed(evt);
            }
        });

        cancelarSCT.setText("Cancelar");
        cancelarSCT.setPreferredSize(new java.awt.Dimension(90, 35));
        cancelarSCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionadorCompartirTodoLayout = new javax.swing.GroupLayout(SeleccionadorCompartirTodo.getContentPane());
        SeleccionadorCompartirTodo.getContentPane().setLayout(SeleccionadorCompartirTodoLayout);
        SeleccionadorCompartirTodoLayout.setHorizontalGroup(
            SeleccionadorCompartirTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionadorCompartirTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compartirTodosSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compartirSeleccionadosSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SeleccionadorCompartirTodoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SeleccionadorCompartirTodoLayout.setVerticalGroup(
            SeleccionadorCompartirTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionadorCompartirTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compartirTodosSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compartirSeleccionadosSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cancelarSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SeleccionadorCompartirTodo.getAccessibleContext().setAccessibleParent(Filmx);

        PartidasPendientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        PartidasPendientes.setIconImage(getIconImage());
        PartidasPendientes.setModal(true);
        PartidasPendientes.setResizable(false);
        PartidasPendientes.setSize(new java.awt.Dimension(1050, 300));

        listaPendientesPP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(listaPendientesPP);
        listaPendientesPP.getAccessibleContext().setAccessibleParent(PartidasPendientes);

        cancelarPP.setText("Cancelar");
        cancelarPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPPActionPerformed(evt);
            }
        });

        responderPP.setText("Responder Partida");
        responderPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderPPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PartidasPendientesLayout = new javax.swing.GroupLayout(PartidasPendientes.getContentPane());
        PartidasPendientes.getContentPane().setLayout(PartidasPendientesLayout);
        PartidasPendientesLayout.setHorizontalGroup(
            PartidasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartidasPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PartidasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responderPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PartidasPendientesLayout.setVerticalGroup(
            PartidasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PartidasPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PartidasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PartidasPendientesLayout.createSequentialGroup()
                        .addComponent(responderPP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarPP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );

        FilmxQuiz.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        FilmxQuiz.setIconImage(getIconImage());
        FilmxQuiz.setModal(true);
        FilmxQuiz.setResizable(false);
        FilmxQuiz.setSize(new java.awt.Dimension(725, 575));

        cancelarFilmxQuiz.setText("Cancelar");
        cancelarFilmxQuiz.setPreferredSize(new java.awt.Dimension(110, 35));
        cancelarFilmxQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFilmxQuizActionPerformed(evt);
            }
        });

        respuestaFilmxQuiz.setPreferredSize(new java.awt.Dimension(685, 40));

        responderFilmxQuiz.setText("Responder");
        responderFilmxQuiz.setPreferredSize(new java.awt.Dimension(150, 40));
        responderFilmxQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderFilmxQuizActionPerformed(evt);
            }
        });

        siguientePistaFilmxQuiz.setText("Siguiente Pista");
        siguientePistaFilmxQuiz.setPreferredSize(new java.awt.Dimension(150, 40));
        siguientePistaFilmxQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientePistaFilmxQuizActionPerformed(evt);
            }
        });

        jugador2FilmxQuiz.setPreferredSize(new java.awt.Dimension(100, 30));

        jugador1FilmxQuiz.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel26.setText("vs");
        jLabel26.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel24.setText("Puntos de:");
        jLabel24.setPreferredSize(new java.awt.Dimension(68, 30));

        jugador1FQ.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel25.setText("Puntos de:");
        jLabel25.setPreferredSize(new java.awt.Dimension(68, 30));

        jugador2FQ.setPreferredSize(new java.awt.Dimension(55, 30));

        puntosJ1FilmxQuiz.setPreferredSize(new java.awt.Dimension(60, 30));

        puntosJ2FilmxQuiz.setPreferredSize(new java.awt.Dimension(60, 30));

        preguntaFilmxQuiz.setEditable(false);
        preguntaFilmxQuiz.setColumns(20);
        preguntaFilmxQuiz.setRows(5);
        jScrollPane6.setViewportView(preguntaFilmxQuiz);

        jLabel27.setText("Pregunta nº:");

        javax.swing.GroupLayout FilmxQuizLayout = new javax.swing.GroupLayout(FilmxQuiz.getContentPane());
        FilmxQuiz.getContentPane().setLayout(FilmxQuizLayout);
        FilmxQuizLayout.setHorizontalGroup(
            FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmxQuizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelarFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FilmxQuizLayout.createSequentialGroup()
                            .addComponent(siguientePistaFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(responderFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FilmxQuizLayout.createSequentialGroup()
                            .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FilmxQuizLayout.createSequentialGroup()
                                    .addComponent(jugador1FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numeroPreguntaFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jugador2FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(256, 256, 256)
                            .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmxQuizLayout.createSequentialGroup()
                                    .addComponent(jugador1FQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puntosJ1FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                                .addGroup(FilmxQuizLayout.createSequentialGroup()
                                    .addComponent(jugador2FQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puntosJ2FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(respuestaFilmxQuiz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        FilmxQuizLayout.setVerticalGroup(
            FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmxQuizLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugador2FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador1FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador1FQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntosJ1FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroPreguntaFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jugador2FQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntosJ2FilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(respuestaFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FilmxQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responderFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguientePistaFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(cancelarFilmxQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FilmxQuiz.getAccessibleContext().setAccessibleParent(Filmx);

        MenuClasificacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MenuClasificacion.setIconImage(getIconImage());
        MenuClasificacion.setModal(true);
        MenuClasificacion.setResizable(false);
        MenuClasificacion.setSize(new java.awt.Dimension(945, 510));

        listaClasificacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaClasificacion.setToolTipText("");
        jScrollPane7.setViewportView(listaClasificacion);
        listaClasificacion.getAccessibleContext().setAccessibleParent(Filmx);

        cancelarClasificacion.setText("Cancelar");
        cancelarClasificacion.setPreferredSize(new java.awt.Dimension(110, 35));
        cancelarClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarClasificacionActionPerformed(evt);
            }
        });

        ordenarPuntosClasificacion.setText("Ordenar por puntos");
        ordenarPuntosClasificacion.setPreferredSize(new java.awt.Dimension(180, 180));
        ordenarPuntosClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPuntosClasificacionActionPerformed(evt);
            }
        });

        ordenarVictoriasClasificacion.setText("Ordenar por victorias");
        ordenarVictoriasClasificacion.setPreferredSize(new java.awt.Dimension(180, 40));
        ordenarVictoriasClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarVictoriasClasificacionActionPerformed(evt);
            }
        });

        ordenarPorcentajeClasificacion.setText("Ordenar por porcentaje");
        ordenarPorcentajeClasificacion.setPreferredSize(new java.awt.Dimension(180, 40));
        ordenarPorcentajeClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorcentajeClasificacionActionPerformed(evt);
            }
        });

        txtClasificacion.setText("Guardar en TXT");
        txtClasificacion.setPreferredSize(new java.awt.Dimension(145, 75));
        txtClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClasificacionActionPerformed(evt);
            }
        });

        mostrarDetallesClasificacion.setText("Mostrar Detalles");
        mostrarDetallesClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDetallesClasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuClasificacionLayout = new javax.swing.GroupLayout(MenuClasificacion.getContentPane());
        MenuClasificacion.getContentPane().setLayout(MenuClasificacionLayout);
        MenuClasificacionLayout.setHorizontalGroup(
            MenuClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuClasificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuClasificacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MenuClasificacionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MenuClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ordenarVictoriasClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordenarPuntosClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordenarPorcentajeClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarDetallesClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        MenuClasificacionLayout.setVerticalGroup(
            MenuClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuClasificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuClasificacionLayout.createSequentialGroup()
                        .addComponent(ordenarPuntosClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ordenarVictoriasClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ordenarPorcentajeClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarDetallesClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(cancelarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );

        MenuClasificacion.getAccessibleContext().setAccessibleParent(Filmx);

        DetallesClasificacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DetallesClasificacion.setIconImage(getIconImage());
        DetallesClasificacion.setModal(true);
        DetallesClasificacion.setResizable(false);
        DetallesClasificacion.setSize(new java.awt.Dimension(400, 420));

        detallesC.setEditable(false);
        detallesC.setColumns(20);
        detallesC.setRows(5);
        jScrollPane9.setViewportView(detallesC);

        cancelarDetallesClasificacion.setText("Cancelar");
        cancelarDetallesClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDetallesClasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetallesClasificacionLayout = new javax.swing.GroupLayout(DetallesClasificacion.getContentPane());
        DetallesClasificacion.getContentPane().setLayout(DetallesClasificacionLayout);
        DetallesClasificacionLayout.setHorizontalGroup(
            DetallesClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesClasificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DetallesClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesClasificacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarDetallesClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DetallesClasificacionLayout.setVerticalGroup(
            DetallesClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesClasificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cancelarDetallesClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DetallesClasificacion.getAccessibleContext().setAccessibleParent(MenuClasificacion);

        AjustesFilmx.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AjustesFilmx.setIconImage(getIconImage());
        AjustesFilmx.setModal(true);
        AjustesFilmx.setResizable(false);
        AjustesFilmx.setSize(new java.awt.Dimension(470, 255));

        guardarUSerializado.setText("Guardar Usuarios Serializado");
        guardarUSerializado.setPreferredSize(new java.awt.Dimension(210, 65));
        guardarUSerializado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUSerializadoActionPerformed(evt);
            }
        });

        guardarPSerializado.setText("Guardar Películas Serializado");
        guardarPSerializado.setPreferredSize(new java.awt.Dimension(210, 65));
        guardarPSerializado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPSerializadoActionPerformed(evt);
            }
        });

        cancelarAjustes.setText("Cancelar");
        cancelarAjustes.setPreferredSize(new java.awt.Dimension(90, 35));
        cancelarAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAjustesActionPerformed(evt);
            }
        });

        cargarP.setText("Cargar Películas");
        cargarP.setPreferredSize(new java.awt.Dimension(210, 65));
        cargarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPActionPerformed(evt);
            }
        });

        cargarU.setText("Cargar Usuarios");
        cargarU.setPreferredSize(new java.awt.Dimension(210, 65));
        cargarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AjustesFilmxLayout = new javax.swing.GroupLayout(AjustesFilmx.getContentPane());
        AjustesFilmx.getContentPane().setLayout(AjustesFilmxLayout);
        AjustesFilmxLayout.setHorizontalGroup(
            AjustesFilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustesFilmxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AjustesFilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjustesFilmxLayout.createSequentialGroup()
                        .addComponent(guardarUSerializado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(guardarPSerializado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjustesFilmxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjustesFilmxLayout.createSequentialGroup()
                        .addComponent(cargarU, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargarP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        AjustesFilmxLayout.setVerticalGroup(
            AjustesFilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustesFilmxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AjustesFilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarUSerializado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarPSerializado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AjustesFilmxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargarU, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargarP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(cancelarAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setName("Inicio"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(381, 370));

        cancelarInicio.setText("Cancelar");
        cancelarInicio.setPreferredSize(new java.awt.Dimension(100, 30));
        cancelarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInicioActionPerformed(evt);
            }
        });

        inicioSesionInicio.setText("Iniciar Sesión");
        inicioSesionInicio.setPreferredSize(new java.awt.Dimension(120, 40));
        inicioSesionInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionInicioActionPerformed(evt);
            }
        });

        tituloApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoFilmx/tituloFilmx.png"))); // NOI18N

        usuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuInicioActionPerformed(evt);
            }
        });

        registrarseInicio.setText("Registrarse");
        registrarseInicio.setPreferredSize(new java.awt.Dimension(100, 30));
        registrarseInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseInicioActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Pass:");

        passInicio.setPreferredSize(new java.awt.Dimension(245, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registrarseInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(usuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(passInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inicioSesionInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloApp)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inicioSesionInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarseInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioSesionInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionInicioActionPerformed
        //Se crean los objetos necesarios para componer un usuario que tras controlar su autenticación con un valor booleano va a ser el usuario de la sesion con el que se va a trabajar.
        String pass = new String(passInicio.getPassword());
        Usuario uAux = new Usuario(usuInicio.getText(),pass);
        Usuario u = new Usuario(usuInicio.getText(),pass,Usuarios.leerMuroUsuario(uAux),Usuarios.leerPartidasGanadas(uAux),Usuarios.leerPartidasPerdidas(uAux),Usuarios.leerPartidasEmpatadas(uAux),Usuarios.leerPartidasCompletas(uAux),Usuarios.leerPartidasPendientes(uAux),Usuarios.leerSolicitudesRecibidas(uAux),Usuarios.leerSolicitudesEnviadas(uAux),Usuarios.leerAmigos(uAux));
        boolean autenticado = Usuarios.autenticar(u);
        
        if (autenticado) {
            usuarioSesion = u;
            nombreUsuarioSesion.setText(usuarioSesion.getNombre());
            Filmx.setLocationRelativeTo(null);
            Filmx.setTitle("Filmx");
            
            //Configuración inicial del muro 
            muroFilmx.setText(null);
            String infoMuro = new String(usuarioSesion.getMuro());
            muroFilmx.setText(infoMuro);
            
            //Configuración inicial de la lista de amigos en la que se limpia lo de la anterior sesión y se cargan los nuevos datos.
            dlm.removeAllElements();
            amigosFilmx.setModel(dlm);
            for (Usuario amigo: usuarioSesion.getAmigos()) {
                dlm.addElement(amigo.getNombre());
            }
            amigosFilmx.setModel(dlm);
            
            //Configuración inicial de la lista de solicitudes enviadas en la que se limpia lo de la anterior sesión y se cargan los nuevos datos.
            solEnviadasNotificacionesAmigos.removeAllItems();
            for (Usuario sol1: usuarioSesion.getSolicitudes_amigos_enviadas()) {
                solEnviadasNotificacionesAmigos.addItem(sol1.getNombre());
            }
            
            //Configuración inicial de la lista de solicitudes recibidas en la que se limpia lo de la anterior sesión y se cargan los nuevos datos.
            solRecibidasNotificacionesAmigos.removeAllItems();      
            for (Usuario sol2: usuarioSesion.getSolicitudes_amigos_recibidas()) {
                solRecibidasNotificacionesAmigos.addItem(sol2.getNombre());
            }
            
            //Configuración inicial del desplegable seleccionador de películas para que se actualice a la nueva sesión y muestre las películas correspondientes con el nuevo usuario.
            peliculaSelec.removeAllItems();
            peliculaSeleccionadaSCP.removeAllItems();
            for (Pelicula p: Peliculas.obtenerPeliculas()) {
                peliculaSelec.addItem(p.getTitulo());
                peliculaSeleccionadaSCP.addItem(p.getTitulo());
            }
            
            //Configuración inicial de la lista de criticas para compartirlas
            dlmC.removeAllElements();
            criticaSeleccionadaSCC.setModel(dlmC);
            for (Pelicula p: Peliculas.obtenerPeliculas()) {
                ArrayList<Critica> criticas = p.getCriticas();              
                for (Critica c: criticas) {
                    dlmC.addElement(c.toString());
                }               
            }
            criticaSeleccionadaSCC.setModel(dlmC);
            
            //Configuración inicial de la lista de partidas pendientes de FilmxQuiz
            dlmP.removeAllElements();
            listaPendientesPP.setModel(dlmP);
            for (Partida partida: usuarioSesion.getPartidas_pendientes()) {
                dlmP.addElement(partida.toString());              
            }
            listaPendientesPP.setModel(dlmP);
            
            //Configuración inicial de la lista de partidas completadas para compartir
            dlmCPartida.removeAllElements();
            partidaSeleccionadaSCP.setModel(dlmCPartida);
            for (Partida partida: usuarioSesion.getPartidas_completas()) {
                dlmCPartida.addElement(partida.mostrarCompleta());
            }
            partidaSeleccionadaSCP.setModel(dlmCPartida);
            
            //Se carga la clasificación al iniciar
            dlmClasificacion.removeAllElements();
            listaClasificacion.setModel(dlmClasificacion);
            for (String s: Clasificacion.visualizar()) {
                dlmClasificacion.addElement(s);
            }
            listaClasificacion.setModel(dlmClasificacion);
            
            Filmx.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "El usuario o la clave son incorrectos","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_inicioSesionInicioActionPerformed

    //Función para utilizar el nombre del usuario jefe de sesión fuera de la clase Inicio
    public static Usuario getUsuarioSesion () {
        return usuarioSesion;
    }
    
    private void usuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuInicioActionPerformed
        
    }//GEN-LAST:event_usuInicioActionPerformed

    private void cancelarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInicioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarInicioActionPerformed

    private void registrarseInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseInicioActionPerformed
        //Configuración de la ventana Registro.
        Registro.setModal(true);
        Registro.setLocationRelativeTo(null);
        Registro.setTitle("Registro");
        Registro.setVisible(true);
        nombreRegistro.setText(null);
        passRegistro.setText(null);
    }//GEN-LAST:event_registrarseInicioActionPerformed

    private void nombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistroActionPerformed

    }//GEN-LAST:event_nombreRegistroActionPerformed

    private void cancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRegistroActionPerformed
        Registro.dispose();
    }//GEN-LAST:event_cancelarRegistroActionPerformed

    private void salirFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirFilmxActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirFilmxActionPerformed

    private void cerrarSesionFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionFilmxActionPerformed
        //Se cierra el Frame de Filmx y se vuelve a abrir el Inicio para cargar otro usuario.
        Filmx.dispose();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio");
        this.setVisible(true);
    }//GEN-LAST:event_cerrarSesionFilmxActionPerformed

    private void cancelarSeleccionadorPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSeleccionadorPeliculaActionPerformed
        SeleccionadorPelicula.dispose();
    }//GEN-LAST:event_cancelarSeleccionadorPeliculaActionPerformed

    private void criticarPeliculaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criticarPeliculaFilmxActionPerformed
        //Configuración de la ventana SeleccionadorPelicula.
        SeleccionadorPelicula.setModal(true);
        SeleccionadorPelicula.setLocationRelativeTo(null);
        SeleccionadorPelicula.setTitle("Seleccionador de Peliculas");
        SeleccionadorPelicula.setVisible(true);
    }//GEN-LAST:event_criticarPeliculaFilmxActionPerformed

    private void registrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRegistroActionPerformed
        if ("".equals(nombreRegistro.getText()) || "".equals(passRegistro.getText())) {
            JOptionPane.showMessageDialog(Registro, "Los campos de registro están vacios, rellénelos si desea registrarse.","INFO", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //Se crea un objeto de un usuario auxiliar para registrar sus datos en el fichero y esta operación se controla devolviendo un valor booleano cuando ya está registrado.
            Usuario uR = new Usuario(nombreRegistro.getText(), passRegistro.getText());
            boolean registrado = Usuarios.registrar(uR);
            
            if (registrado) {
                JOptionPane.showMessageDialog(Registro, "El usuario se ha registrado correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
                Registro.dispose();
            }
            else {
                JOptionPane.showMessageDialog(Registro, "El usuario ya existe.","ERROR", JOptionPane.ERROR_MESSAGE);
                Registro.dispose();
            }
        }
  
    }//GEN-LAST:event_registrarRegistroActionPerformed

    private void tituloAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloAltaActionPerformed

    }//GEN-LAST:event_tituloAltaActionPerformed

    private void altaPeliculaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPeliculaFilmxActionPerformed
        //Configuración de la ventana AltaPeliculas.
        AltaPeliculas.setModal(true);
        AltaPeliculas.setLocationRelativeTo(null);
        tituloAlta.setText(null);
        añoAlta.setText(null);
        generoAlta.setText(null);
        directorAlta.setText(null);
        actorAlta.setText(null);
        actrizAlta.setText(null);
        AltaPeliculas.setTitle("Seleccionador de Peliculas");
        AltaPeliculas.setVisible(true);
    }//GEN-LAST:event_altaPeliculaFilmxActionPerformed

    private void cancelarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaActionPerformed
        AltaPeliculas.dispose();
    }//GEN-LAST:event_cancelarAltaActionPerformed
    
    //Función privada auxiliar para controlar si la cadena que introduce el usuario en el campo de año de estreno de la película que quiere dar de alta es un numero válido.
    private static boolean esNumero (String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
    }
    
    private void aceptarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaActionPerformed
        if ("".equals(tituloAlta.getText()) || "".equals(añoAlta.getText()) || "".equals(generoAlta.getText()) || "".equals(directorAlta.getText()) || "".equals(actorAlta.getText()) || "".equals(actrizAlta.getText())) {
            JOptionPane.showMessageDialog(AltaPeliculas, "Algunos campos del formulario están vacios, rellénelos si desea dar de alta la película.","INFO", JOptionPane.WARNING_MESSAGE);
        }
        else if (!esNumero(añoAlta.getText())) {
            JOptionPane.showMessageDialog(AltaPeliculas, "El campo de año de estreno debe contener números únicamente","INFO", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //Se añade la pelicula auxiliar p al archivo de peliculas y se controla con un booleano para gestionar los errores. También se podría usar un try-catch.
            Pelicula p = new Pelicula(tituloAlta.getText(), Integer.parseInt(añoAlta.getText()), generoAlta.getText(), directorAlta.getText(), actorAlta.getText(), actrizAlta.getText());
            boolean dadaAlta = Peliculas.addPelicula(p);
            
            if (dadaAlta) {
                peliculaSelec.addItem(p.getTitulo());
                peliculaSeleccionadaSCP.addItem(p.getTitulo());
                String infoMuro = new String(usuarioSesion.muroPelicula(p));
                muroFilmx.append(infoMuro);
                
                //Operación que actualiza el fichero de usuarios con los nuevos datos añadidos.
                Usuarios.actualizar(usuarioSesion);
                JOptionPane.showMessageDialog(AltaPeliculas, "La pelicula se ha dado de alta correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
                AltaPeliculas.dispose();
            }
            else {
                JOptionPane.showMessageDialog(AltaPeliculas, "La pelicula ya existe.","ERROR", JOptionPane.ERROR_MESSAGE);
                AltaPeliculas.dispose();
            }
        }
    }//GEN-LAST:event_aceptarAltaActionPerformed

    private void invitarAmigosFILMXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitarAmigosFILMXActionPerformed
        //Configuración de la ventana AltaPeliculas.
        InvitarAmigos.setModal(true);
        InvitarAmigos.setLocationRelativeTo(null);
        usuarioBusInvitarAmigos.setText(null);
        InvitarAmigos.setTitle("Invitar Amigos");
        InvitarAmigos.setVisible(true);
    }//GEN-LAST:event_invitarAmigosFILMXActionPerformed

    private void cancelarInvitarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInvitarAmigosActionPerformed
        InvitarAmigos.dispose();  
    }//GEN-LAST:event_cancelarInvitarAmigosActionPerformed

    private void refrescarMuroFILMXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarMuroFILMXActionPerformed
        //Configuración del botón de refrescar que actualiza el muro por si surgiera algún error de visualización.
        muroFilmx.setText(null);
        String infoMuro = new String(usuarioSesion.getMuro());
        muroFilmx.setText(infoMuro);
    }//GEN-LAST:event_refrescarMuroFILMXActionPerformed

    private void notificacionesFILMXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesFILMXActionPerformed
        //Configuración de la ventana NotificacionesAmigos.
        NotificacionesAmigos.setModal(true);
        NotificacionesAmigos.setLocationRelativeTo(null);
        NotificacionesAmigos.setTitle("Notificaciones");
        NotificacionesAmigos.setVisible(true);
    }//GEN-LAST:event_notificacionesFILMXActionPerformed

    private void cancelarNotificacionesAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNotificacionesAmigosActionPerformed
        NotificacionesAmigos.dispose();
    }//GEN-LAST:event_cancelarNotificacionesAmigosActionPerformed

    private void invitarInvitarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitarInvitarAmigosActionPerformed
        //Se busca el usuario que se ha escrito en la caja de texto, en el fichero, y si se encuentra se le manda la invitación a su ArrayList de solicitudes recibidas y se añade la solicitud enviada en la lista del usuario jefe de sesión.
        boolean repetido1 = false;
        boolean repetido2 = false;
        for (int i = 0; i < dlm.size(); i++) {
            String nombre = dlm.getElementAt(i).toString();
            
            if (usuarioBusInvitarAmigos.getText().compareTo(nombre) == 0) {
                repetido1 = true;
            }
        }
        
        for (Usuario usuAux: usuarioSesion.getSolicitudes_amigos_enviadas()) {
            if (usuarioBusInvitarAmigos.getText().compareTo(usuAux.getNombre()) == 0) {
                repetido2 = true;
            }
        }
        
        
        if (Usuarios.obtenerUsuario(usuarioBusInvitarAmigos.getText()) != null && !(repetido1) && !(repetido2)) {
            Usuario uII = Usuarios.obtenerUsuario(usuarioBusInvitarAmigos.getText());
            usuarioSesion.invitarAmigo(uII);
            Usuarios.actualizar(usuarioSesion);
            Usuarios.actualizar(uII);
            solEnviadasNotificacionesAmigos.addItem(Usuarios.obtenerUsuario(usuarioBusInvitarAmigos.getText()).getNombre());
            JOptionPane.showMessageDialog(InvitarAmigos,"Se ha enviado la solicitud correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
            InvitarAmigos.dispose();
        }
        else if (repetido1) {
            JOptionPane.showMessageDialog(InvitarAmigos, "El usuario que busca ya pertenece a su lista de amigos.","ERROR", JOptionPane.ERROR_MESSAGE);
            usuarioBusInvitarAmigos.setText(null);
        }
        else if (repetido2) {
            JOptionPane.showMessageDialog(InvitarAmigos, "No puede invitar 2 veces al mismo usuario, por favor espere a que su solicitud sea evaluada.","ERROR", JOptionPane.ERROR_MESSAGE);
            usuarioBusInvitarAmigos.setText(null);
        }
        else{
            JOptionPane.showMessageDialog(InvitarAmigos, "El usuario que busca no existe.","ERROR", JOptionPane.ERROR_MESSAGE);
            usuarioBusInvitarAmigos.setText(null);
        }
    }//GEN-LAST:event_invitarInvitarAmigosActionPerformed

    private void aceptarNotificacionesAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarNotificacionesAmigosActionPerformed
        //Se controla que la selección de solicitudes recibidas en el desplegable no sea una selección vacía y se añade el o los usuarios seleccionados a la lista de amigos del usuario jefe de sesión.
        if (solRecibidasNotificacionesAmigos.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(NotificacionesAmigos,"No hay ninguna solicitud recibida seleccionada, seleccione una por favor.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {           
            Usuario uANA = Usuarios.obtenerUsuario(solRecibidasNotificacionesAmigos.getSelectedItem().toString());
            usuarioSesion.aceptarInvitacion(uANA);
            Usuarios.actualizar(usuarioSesion);
            Usuarios.actualizar(uANA);
            dlm.addElement(uANA.getNombre());
            amigosFilmx.setModel(dlm);
            solRecibidasNotificacionesAmigos.removeItem(uANA.getNombre());
            JOptionPane.showMessageDialog(NotificacionesAmigos,"Se ha aceptado la invitación correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_aceptarNotificacionesAmigosActionPerformed

    private void rechazarNotificacionesAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarNotificacionesAmigosActionPerformed
        //Se controla que la selección de amigos en la lista no sea una selección vacía y se elimina el o los usuarios seleccionados de la lista de amigos del usuario jefe de sesión.
        if (solRecibidasNotificacionesAmigos.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(NotificacionesAmigos,"No hay ninguna solicitud recibida seleccionada, seleccione una por favor.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {           
            Usuario uRNA = Usuarios.obtenerUsuario(solRecibidasNotificacionesAmigos.getSelectedItem().toString());
            usuarioSesion.rechazarInvitacion(uRNA);
            Usuarios.actualizar(usuarioSesion);
            Usuarios.actualizar(uRNA);  
            solRecibidasNotificacionesAmigos.removeItem(uRNA.getNombre());
            JOptionPane.showMessageDialog(NotificacionesAmigos,"Se ha rechazado la invitación correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_rechazarNotificacionesAmigosActionPerformed

    private void eliminarAmigoFILMXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAmigoFILMXActionPerformed
        //Se controla que la selección de amigos en la lista no sea una selección vacía y se elimina el o los usuarios seleccionados de la lista de amigos del usuario jefe de sesión.
        if (amigosFilmx.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(Filmx,"Seleccione el amigo o los amigos que desea eliminar haciendo click en su nombre que aparece en la lista y añadiendo más maneteniendo pulsado CTRL.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {           
            int[] indices = amigosFilmx.getSelectedIndices();
            
            ArrayList<String> usuariosNom = new ArrayList<>(amigosFilmx.getSelectedValuesList());
            for (String nom: usuariosNom) {
                Usuario uENA = Usuarios.obtenerUsuario(nom);
                usuarioSesion.eliminarAmigo(uENA);
                Usuarios.actualizar(usuarioSesion);
                Usuarios.actualizar(uENA);
                dlm.removeElement(uENA.getNombre());
                amigosFilmx.setModel(dlm);
            }
            
            if (indices.length == 1) {
                JOptionPane.showMessageDialog(Filmx,"Se ha eliminado el amigo correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(Filmx,"Se han eliminado los amigos correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
            }     
        }
    }//GEN-LAST:event_eliminarAmigoFILMXActionPerformed

    private void selecPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecPeliculaActionPerformed
        //Se controla que la pelicula seleccionada en el desplegable no sea una selección vacía y se configura la ventana de critica para que el usuario pueda redactarla.
        if (peliculaSelec.getSelectedItem() != null) {
            Critica.setModal(true);
            Critica.setLocationRelativeTo(null);
            Critica.setTitle("Criticas");
            SpinnerNumberModel model = new SpinnerNumberModel(0.00, 0.00, 10.00, 0.01);
            puntuacionCritica.setModel(model);
            criticaCritica.setText(null);
            tituloCritica.setText(null);
            tituloCritica.setText(peliculaSelec.getSelectedItem().toString());
            puntuacionCritica.setValue(0);
            Critica.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(Critica,"No hay ninguna película dada de alta.","WARNING", JOptionPane.WARNING_MESSAGE);            
        }
        
        
    }//GEN-LAST:event_selecPeliculaActionPerformed

    private void cancelarCriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCriticaActionPerformed
        Critica.dispose();
    }//GEN-LAST:event_cancelarCriticaActionPerformed

    private void publicarCriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicarCriticaActionPerformed
        //Si ya se ha añadido una crítica se le permite al usuario publicar su critica completa en su muro.
        if ("".equals(criticaCritica.getText())) {
            JOptionPane.showMessageDialog(AltaPeliculas, "No ha escrito su crítica, por favor rellénela para publicarla.","INFO", JOptionPane.WARNING_MESSAGE);
        }
        else {
            Critica c = new Critica (tituloCritica.getText(), (Double) puntuacionCritica.getValue(), criticaCritica.getText());
            Pelicula p = Peliculas.obtenerPelicula(tituloCritica.getText());
            
            String infoMuro = new String(usuarioSesion.muroCritica(c , p));
            muroFilmx.append(infoMuro);
            dlmC.addElement(c.toString());
            criticaSeleccionadaSCC.setModel(dlmC);
            
            //Con la operación de actualizar se cargan los nuevos datos añadidos en el fichero de películas.
            Peliculas.actualizar(p);
            Usuarios.actualizar(usuarioSesion);
            JOptionPane.showMessageDialog(AltaPeliculas, "La crítica se ha publicado correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
            Critica.dispose();         
        }
    }//GEN-LAST:event_publicarCriticaActionPerformed

    private void compartirPeliculaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirPeliculaFilmxActionPerformed
        //Configuración de la ventana SeleccionadorCompartirPeliculas.
        SeleccionadorCompartirPelicula.setModal(true);
        SeleccionadorCompartirPelicula.setLocationRelativeTo(null);
        SeleccionadorCompartirPelicula.setTitle("Seleccionador Compartir");
        SeleccionadorCompartirPelicula.setVisible(true);
    }//GEN-LAST:event_compartirPeliculaFilmxActionPerformed

    private void compartirTodosSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirTodosSCPActionPerformed
        if (peliculaSeleccionadaSCP.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Todavía no hay ninguna película dada de alta.","ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else {
            usuarioSesion.compartirPelicula(Peliculas.obtenerPelicula(peliculaSeleccionadaSCP.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Se ha compartido la película con todos sus amigos, menos con los que ya contaban con ella en su muro.","INFO", JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_compartirTodosSCPActionPerformed

    private void cancelarSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSCPActionPerformed
        SeleccionadorCompartirPelicula.dispose();
    }//GEN-LAST:event_cancelarSCPActionPerformed

    private void compartirSeleccionadosSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirSeleccionadosSCPActionPerformed
        //Si se ha seleccionado algun amigo en la lista de amigos se le compartirá la película, que también haya seleccionado el usuario, y ésta aparecerá en su muro.
        if (amigosFilmx.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Seleccione el amigo o los amigos con los que desea compartir haciendo click en su nombre que aparece en la lista y añadiendo más maneteniendo pulsado CTRL.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if (peliculaSeleccionadaSCP.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Todavía no hay ninguna película dada de alta.","ERROR", JOptionPane.ERROR_MESSAGE);            
        }
        else {           
            int[] indices = amigosFilmx.getSelectedIndices();

            if (indices.length == 1) {               
                Usuario uC = Usuarios.obtenerUsuario(amigosFilmx.getSelectedValue());
                
                if (uC.getMuro().indexOf(peliculaSeleccionadaSCP.getSelectedItem().toString()) == -1) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Se ha compartido la película con su amigo.","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Ya ha compartido la película con su amigo, seleccione otro amigo para compartir.","ERROR", JOptionPane.ERROR_MESSAGE);
                } 
                
                usuarioSesion.compartirPelicula(Peliculas.obtenerPelicula(peliculaSeleccionadaSCP.getSelectedItem().toString()), uC);  
            }
            else {
                StringBuilder mensaje1 = new StringBuilder("");
                StringBuilder mensaje2 = new StringBuilder("");
                ArrayList<String> usuariosNom = new ArrayList<>(amigosFilmx.getSelectedValuesList());
                for (String nom: usuariosNom) {
                    Usuario uCs = Usuarios.obtenerUsuario(nom);
                    
                    if (uCs.getMuro().indexOf(peliculaSeleccionadaSCP.getSelectedItem().toString()) == -1) {
                        if ("".equals(mensaje1)) {
                           mensaje1.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje1.append(uCs.getNombre()).append(" ");
                        }                        
                    }  
                    else {
                        if ("".equals(mensaje2)) {
                           mensaje2.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje2.append(uCs.getNombre()).append(" ");
                        }  
                    }  
                    
                    usuarioSesion.compartirPelicula(Peliculas.obtenerPelicula(peliculaSeleccionadaSCP.getSelectedItem().toString()), uCs);
                }
                
                if ("".equals(mensaje1.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Ya ha compartido la pelicula con todos los amigos seleccionados.","ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else if ("".equals(mensaje2.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Se ha compartido la pelicula con todos los amigos seleccionados correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);                    
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPelicula,"Se ha compartido la película con " + mensaje1 + "pero " + mensaje2 + "ya contaban con la película en su muro.","WARNING", JOptionPane.WARNING_MESSAGE);                    
                }
            }     
        }
    }//GEN-LAST:event_compartirSeleccionadosSCPActionPerformed

    private void compartirTodosSCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirTodosSCCActionPerformed
        if (criticaSeleccionadaSCC.isSelectionEmpty() || "".equals(criticaSeleccionadaSCC.getSelectedValue())) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Seleccione una crítica o publique alguna para compartirla.","ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else {
            //Algoritmo para extraer el texto de la critica para identificarla mediante uso de Strings.
            int ind = criticaSeleccionadaSCC.getSelectedValue().indexOf("Crítica: ");
            String critica_Aux = criticaSeleccionadaSCC.getSelectedValue().substring(ind);
                
            //Los indices que componen el string "Crítica: " que siempre aparece en los elementos de la lista cuenta con  caracteres, por lo que se escoge el substring a partir del 9.
            String critic = critica_Aux.substring(9, critica_Aux.length()-1);            
            
            usuarioSesion.compartirCritica(Peliculas.obtenerCritica(critic));
            JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Se ha compartido la crítica con todos sus amigos, menos con los que ya contaban con ella en su muro.","INFO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_compartirTodosSCCActionPerformed

    private void cancelarSCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSCCActionPerformed
        SeleccionadorCompartirCritica.dispose();
    }//GEN-LAST:event_cancelarSCCActionPerformed

    private void compartirSeleccionadosSCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirSeleccionadosSCCActionPerformed
        //Si se ha seleccionado algun amigo en la lista de amigos se le compartirá la crítica, que también haya seleccionado el usuario, y ésta aparecerá en su muro.
        if (amigosFilmx.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Seleccione el amigo o los amigos con los que desea compartir haciendo click en su nombre que aparece en la lista y añadiendo más maneteniendo pulsado CTRL.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if (criticaSeleccionadaSCC.isSelectionEmpty() || "".equals(criticaSeleccionadaSCC.getSelectedValue())) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Todavía no hay ninguna crítica publicada.","ERROR", JOptionPane.ERROR_MESSAGE);            
        }
        else {           
            int[] indices = amigosFilmx.getSelectedIndices();
            
            //Algoritmo para extraer el texto de la critica para identificarla mediante uso de Strings.
            int index = criticaSeleccionadaSCC.getSelectedValue().indexOf("Crítica: ");
            String criticaAux = criticaSeleccionadaSCC.getSelectedValue().substring(index);
                
            //Los indices que componen el string "Crítica: " que siempre aparece en los elementos de la lista cuenta con  caracteres, por lo que se escoge el substring a partir del 9.
            String critica = criticaAux.substring(9, criticaAux.length()-1);

            if (indices.length == 1) {               
                Usuario uC = Usuarios.obtenerUsuario(amigosFilmx.getSelectedValue());
                
                if (uC.getMuro().indexOf(critica) == -1) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Se ha compartido la crítica con su amigo.","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Ya ha compartido la crítica con su amigo, seleccione otro amigo para compartir.","ERROR", JOptionPane.ERROR_MESSAGE);
                } 
                
                usuarioSesion.compartirCritica(Peliculas.obtenerCritica(critica), uC);  
            }
            else {
                StringBuilder mensaje1 = new StringBuilder("");
                StringBuilder mensaje2 = new StringBuilder("");
                ArrayList<String> usuariosNom = new ArrayList<>(amigosFilmx.getSelectedValuesList());               
                
                for (String nom: usuariosNom) {
                    Usuario uCs = Usuarios.obtenerUsuario(nom);
                    
                    if (uCs.getMuro().indexOf(critica) == -1) {
                        if ("".equals(mensaje1)) {
                           mensaje1.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje1.append(uCs.getNombre()).append(" ");
                        }                        
                    }  
                    else {
                        if ("".equals(mensaje2)) {
                           mensaje2.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje2.append(uCs.getNombre()).append(" ");
                        }  
                    }  
                    
                    usuarioSesion.compartirCritica(Peliculas.obtenerCritica(critica), uCs);
                }
                
                if ("".equals(mensaje1.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Ya ha compartido la crítica con todos los amigos seleccionados.","ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else if ("".equals(mensaje2.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Se ha compartido la crítica con todos los amigos seleccionados correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);                    
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirCritica,"Se ha compartido la crítica con " + mensaje1 + "pero " + mensaje2 + "ya contaban con la crítica en su muro.","WARNING", JOptionPane.WARNING_MESSAGE);                    
                }
            }     
        }
    }//GEN-LAST:event_compartirSeleccionadosSCCActionPerformed

    private void CompartirCriticaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompartirCriticaFilmxActionPerformed
        //Configuración de la ventana SeleccionadorCompartirCrítica.
        SeleccionadorCompartirCritica.setModal(true);
        SeleccionadorCompartirCritica.setLocationRelativeTo(null);
        SeleccionadorCompartirCritica.setTitle("Seleccionador Compartir");
        SeleccionadorCompartirCritica.setVisible(true);
    }//GEN-LAST:event_CompartirCriticaFilmxActionPerformed

    private void CompartirTodoFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompartirTodoFilmxActionPerformed
        //Configuración de la ventana SeleccionadorCompartirTodo.
        SeleccionadorCompartirTodo.setModal(true);
        SeleccionadorCompartirTodo.setLocationRelativeTo(null);
        SeleccionadorCompartirTodo.setTitle("Seleccionador Compartir");
        SeleccionadorCompartirTodo.setVisible(true);
    }//GEN-LAST:event_CompartirTodoFilmxActionPerformed

    private void compartirSeleccionadosSCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirSeleccionadosSCTActionPerformed
        //Si se ha seleccionado algun amigo en la lista de amigos se le compartirán todas las críticas y películas del sistema, y estas aparecerán en su muro.
        if (amigosFilmx.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirTodo,"Seleccione el amigo o los amigos con los que desea compartir haciendo click en su nombre que aparece en la lista y añadiendo más maneteniendo pulsado CTRL.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {           
            int[] indices = amigosFilmx.getSelectedIndices();

            if (indices.length == 1) {               
                Usuario uC = Usuarios.obtenerUsuario(amigosFilmx.getSelectedValue());
                usuarioSesion.compartirTodo(uC);
                //En el muro del amigo aparecerá todo lo que no tenga él ya en su muro, si lo tiene, no se sobreescribirá.
                JOptionPane.showMessageDialog(SeleccionadorCompartirTodo,"Se ha compartido todo con su amigo seleccionado correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                ArrayList<String> usuariosNom = new ArrayList<>(amigosFilmx.getSelectedValuesList());          
                for (String nom: usuariosNom) {
                    Usuario uCs = Usuarios.obtenerUsuario(nom);                   
                    usuarioSesion.compartirTodo(uCs);
                }

                JOptionPane.showMessageDialog(SeleccionadorCompartirTodo,"Se ha compartido todo con sus amigos seleccionados correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE); 
            }     
        }
    }//GEN-LAST:event_compartirSeleccionadosSCTActionPerformed

    private void compartirTodosSCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirTodosSCTActionPerformed
        //Al compartir todo con todos los amigos, sólo aparecerá la información no duplicada como compartida.
        usuarioSesion.compartirTodo();
        JOptionPane.showMessageDialog(SeleccionadorCompartirTodo,"Se ha compartido todo con todos sus amigos.","INFO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_compartirTodosSCTActionPerformed

    private void cancelarSCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSCTActionPerformed
        SeleccionadorCompartirTodo.dispose();
    }//GEN-LAST:event_cancelarSCTActionPerformed

    private void cancelarPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPPActionPerformed
        PartidasPendientes.dispose();
    }//GEN-LAST:event_cancelarPPActionPerformed

    private void partidasPendientesFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidasPendientesFilmxActionPerformed
        //Configuración de la ventana PartidasPendientes.
        PartidasPendientes.setModal(true);
        PartidasPendientes.setLocationRelativeTo(null);
        PartidasPendientes.setTitle("Partidas Pendientes");
        PartidasPendientes.setVisible(true);
    }//GEN-LAST:event_partidasPendientesFilmxActionPerformed

    private void jugarPartidaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarPartidaFilmxActionPerformed
        if (Peliculas.obtenerPeliculas().size() < 1) {
            JOptionPane.showMessageDialog(Filmx,"Para jugar a FilmxQuiz debe dar de alta películas en el sistema.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (Usuarios.leer().size() <= 1) {
            JOptionPane.showMessageDialog(Filmx,"No hay suficientes jugadores registrados para jugar a FilmxQuiz.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            //Se crea una nueva partida que se añade a la lista de partidas pendientes eligiendo un usuario aleatorio
            Usuario uJQ = Usuario.seleccionarUsuario();
            Partida nuevaPartida = usuarioSesion.iniciarPartida(uJQ);

            //Se actualizan los objetos dentro de los ficheros tras recibir la información de la partida
            Usuarios.actualizar(usuarioSesion);
            Usuarios.actualizar(uJQ);
            
            //Generación de preguntas
            Pelicula peliculaP = Pregunta.seleccionarPelicula();
            Pregunta pregunta = new Pregunta(peliculaP,nuevaPartida.getPtos_jugador1(),nuevaPartida.getPtos_jugador2());
            preguntaLocal = pregunta;
            
            //Función de formular pregunta de la clase Pregunta y diseño de la ventana de FilmxQuiz
            jugador1FilmxQuiz.setText(nuevaPartida.getJugador1().getNombre());
            jugador2FilmxQuiz.setText(nuevaPartida.getJugador2().getNombre());
            jugador1FQ.setText(nuevaPartida.getJugador1().getNombre());
            jugador2FQ.setText(nuevaPartida.getJugador2().getNombre());
            puntosJ1FilmxQuiz.setText(String.valueOf(nuevaPartida.getPtos_jugador1()));
            puntosJ2FilmxQuiz.setText(String.valueOf(nuevaPartida.getPtos_jugador2()));
            numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
            preguntaFilmxQuiz.setText(pregunta.toString());

            //Configuración de la ventana JuegoFilmx.
            FilmxQuiz.setModal(true);
            FilmxQuiz.setLocationRelativeTo(null);
            FilmxQuiz.setTitle("Filmx Quiz");
            FilmxQuiz.setVisible(true);
        }
        
    }//GEN-LAST:event_jugarPartidaFilmxActionPerformed

    private void cancelarFilmxQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFilmxQuizActionPerformed
        //Alogritmo para controlar si el jugador 1 ya ha terminado de contestar (partida parcial = TRUE) o si sigue contestando (partida parcial = FALSE)
        ArrayList<Partida> partidas = Usuarios.leerPartidasPendientes(usuarioSesion);
        Partida pAux = new Partida ();
        boolean partidaNueva = false;
        for (Partida partida: partidas) {
            if (!(partida.getParcial())) {
                partidaNueva = true;
                pAux = partida;
            }
            else if (partida.getIdentificador() == partidaResponder.getIdentificador()) {
                pAux = partida;
            }
        }
        
        usuarioSesion.deshacerPartida(pAux);
        dlmP.removeElement(pAux);
        listaPendientesPP.setModel(dlmP);
        FilmxQuiz.dispose();
    }//GEN-LAST:event_cancelarFilmxQuizActionPerformed

    private void siguientePistaFilmxQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientePistaFilmxQuizActionPerformed
        if (preguntaLocal.getContadorPista() < 4) {
            preguntaLocal.ofrecerNuevaPista();
            puntuacionAcierto -= 10;
            preguntaFilmxQuiz.setText(preguntaLocal.toString());
            
            //Alogritmo para controlar si el jugador 1 ya ha terminado de contestar (partida parcial = TRUE) o si sigue contestando (partida parcial = FALSE)
            ArrayList<Partida> partidas = Usuarios.leerPartidasPendientes(usuarioSesion);
            boolean partidaNueva = false;
            for (Partida partida: partidas) {
                if (!(partida.getParcial())) {
                    partidaNueva = true;
                }
            }
            
            if (partidaNueva) {
                preguntaLocal.setPuntosJugador1Fallo();
            }
            else {
                preguntaLocal.setPuntosJugador2Fallo();
            }
            
            //Se actualiza la interfaz de FilmxQuiz
            puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
            puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
            respuestaFilmxQuiz.setText(null);
        }
        else {
            JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);         
        }
    }//GEN-LAST:event_siguientePistaFilmxQuizActionPerformed

    private void responderFilmxQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderFilmxQuizActionPerformed
        //Alogritmo para controlar si el jugador 1 ya ha terminado de contestar (partida parcial = TRUE) o si sigue contestando (partida parcial = FALSE)
        ArrayList<Partida> partidas = Usuarios.leerPartidasPendientes(usuarioSesion);
        Partida pAux = new Partida ();
        boolean partidaNueva = false;
        for (Partida partida: partidas) {
            if (!(partida.getParcial())) {
                partidaNueva = true;
                pAux = partida;
            }
            else if (partida.getIdentificador() == partidaResponder.getIdentificador()) {
                pAux = partida;
            }
        }

        //Algoritmo para obtener la partida parcial que se va a contestar
              
        switch (preguntaLocal.getId()) {
            case 1:
                //Se escribe el numero de pregunta 1
                numeroPreguntaFilmxQuiz.setText(String.valueOf(1));
                
                if (respuestaFilmxQuiz.getText().compareTo(preguntaLocal.getPelicula().getTitulo()) == 0) {                    
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                    }
                    else  {
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                    }
                    
                    //Se crea el objeto de la siguiente pregunta que va a aparecer
                    Pelicula peliculaAux = Pregunta.seleccionarPelicula();
                    Pregunta preguntaNueva = new Pregunta(peliculaAux,preguntaLocal);
                    preguntaLocal = preguntaNueva;
                    
                    //Se escribe el numero de pregunta
                    numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaFilmxQuiz.setText(preguntaLocal.toString());
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }                
                }   

                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            case 2:
                if (respuestaFilmxQuiz.getText().compareTo(String.valueOf(preguntaLocal.getPelicula().getAño())) == 0) {
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                    }
                    else  {
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                    }
                    
                    //Se crea el objeto de la siguiente pregunta que va a aparecer
                    Pelicula peliculaAux = Pregunta.seleccionarPelicula();
                    Pregunta preguntaNueva = new Pregunta(peliculaAux,preguntaLocal);
                    preguntaLocal = preguntaNueva;
                    
                    //Se escribe el numero de pregunta
                    numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaFilmxQuiz.setText(preguntaLocal.toString());
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }   
                }   

                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            case 3:
                if (respuestaFilmxQuiz.getText().compareTo(preguntaLocal.getPelicula().getGenero()) == 0) {
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                    }
                    else  {
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                    }
                    
                    //Se crea el objeto de la siguiente pregunta que va a aparecer
                    Pelicula peliculaAux = Pregunta.seleccionarPelicula();
                    Pregunta preguntaNueva = new Pregunta(peliculaAux,preguntaLocal);
                    preguntaLocal = preguntaNueva;
                    
                    //Se escribe el numero de pregunta
                    numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaFilmxQuiz.setText(preguntaLocal.toString());
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }   
                }   

                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            case 4:
                if (respuestaFilmxQuiz.getText().compareTo(preguntaLocal.getPelicula().getDirector()) == 0) {
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                    }
                    else  {
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                    }
                    
                    //Se crea el objeto de la siguiente pregunta que va a aparecer
                    Pelicula peliculaAux = Pregunta.seleccionarPelicula();
                    Pregunta preguntaNueva = new Pregunta(peliculaAux,preguntaLocal);
                    preguntaLocal = preguntaNueva;
                    
                    //Se escribe el numero de pregunta
                    numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaFilmxQuiz.setText(preguntaLocal.toString());
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }   
                }   

                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            case 5:
                if (respuestaFilmxQuiz.getText().compareTo(preguntaLocal.getPelicula().getActor()) == 0) {
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                    }
                    else  {
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                    }
                    
                    //Se crea el objeto de la siguiente pregunta que va a aparecer
                    Pelicula peliculaAux = Pregunta.seleccionarPelicula();
                    Pregunta preguntaNueva = new Pregunta(peliculaAux,preguntaLocal);
                    preguntaLocal = preguntaNueva;
                    
                    //Se escribe el numero de pregunta
                    numeroPreguntaFilmxQuiz.setText(String.valueOf(preguntaLocal.getId()));
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaFilmxQuiz.setText(preguntaLocal.toString());
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }   
                }   

                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            case 6:
                if (respuestaFilmxQuiz.getText().compareTo(preguntaLocal.getPelicula().getActriz()) == 0) {
                    //Se computan los puntos obtenidos al acertar
                    if (partidaNueva) {
                        preguntaLocal.setPuntosJugador1Acierto(puntuacionAcierto);
                        pAux.setParcial(true);
                        pAux.setPtos_jugador1(preguntaLocal.getPuntosJugador1());
                        pAux.setPtos_jugador2(preguntaLocal.getPuntosJugador2());
                        pAux.setResultado_final(preguntaLocal.getPuntosJugador1(), preguntaLocal.getPuntosJugador2()); 
                        
                        //Actualización de puntos
                        ArrayList<Usuario> jugadores = Usuarios.obtenerJugadores(pAux);
                        for (Usuario u: jugadores) {
                            for (Partida p: u.getPartidas_pendientes()) {
                                if (p.getIdentificador() == pAux.getIdentificador()) {
                                    Partida aux = p;
                                    aux.setParcial(true);
                                    aux.setPtos_jugador1(pAux.getPtos_jugador1());
                                    aux.setPtos_jugador2(pAux.getPtos_jugador2());
                                    aux.setResultado_final(pAux.getPtos_jugador1(), pAux.getPtos_jugador2());
                                    
                                    u.getPartidas_pendientes().remove(p);
                                    u.getPartidas_pendientes().add(aux);
                                    Usuarios.actualizar(u);
                                }
                            }
                        }
                        
                        Usuarios.actualizarUsuariosPartida(pAux, jugadores);  
                        
                        //Se actualiza la interfaz de FilmxQuiz
                        puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                        puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                        respuestaFilmxQuiz.setText(null);
                        
                        //Se añade la partida parcial respondida por el jugador 1 a la lista de partidas parciales de ambos jugadores
                        dlmP.addElement(pAux.toString());
                        listaPendientesPP.setModel(dlmP);
                        
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ha terminado de responder a todas las preguntas de FilmxQuiz, ahora le toca al jugador enemigo!","INFO", JOptionPane.INFORMATION_MESSAGE);
                                     
                    }
                    else  {
                        //Se actualiza la lista de partidas parciales de ambos jugadores
                        dlmP.removeElement(pAux.toString());
                        listaPendientesPP.setModel(dlmP);
                        
                        preguntaLocal.setPuntosJugador2Acierto(puntuacionAcierto);
                        pAux.setPtos_jugador1(preguntaLocal.getPuntosJugador1());
                        pAux.setPtos_jugador2(preguntaLocal.getPuntosJugador2());
                        pAux.setResultado_final(preguntaLocal.getPuntosJugador1(), preguntaLocal.getPuntosJugador2());
                        pAux.setParcial(false);
                        String sAux = new String(usuarioSesion.completarPartida(pAux));
                        muroFilmx.append(sAux);
                        
                        //Se actualiza la lista de compartir partidas y la clasificación
                        dlmCPartida.addElement(pAux.mostrarCompleta());
                        partidaSeleccionadaSCP.setModel(dlmCPartida);
                        dlmClasificacion.removeAllElements();
                        listaClasificacion.setModel(dlmClasificacion);
                        for (String s: Clasificacion.visualizar()) {
                            dlmClasificacion.addElement(s);
                        }
                        listaClasificacion.setModel(dlmClasificacion);
                        
                        //Se actualiza la interfaz de FilmxQuiz
                        puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                        puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                        respuestaFilmxQuiz.setText(null);
   
                        JOptionPane.showMessageDialog(FilmxQuiz,"La partida ha terminado!","INFO", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    //Se reestablecen los puntos a 50
                    puntuacionAcierto = 50;
                    preguntaLocal.setId(0);
                    FilmxQuiz.dispose();
                }
                else {
                    //Se ofrece una nueva pista y se deduce la puntuación de acierto en 10 puntos
                    if (preguntaLocal.getContadorPista() < 4) {
                        preguntaLocal.ofrecerNuevaPista();
                        puntuacionAcierto -= 10;
                        preguntaFilmxQuiz.setText(preguntaLocal.toString());

                        if (partidaNueva) {
                            preguntaLocal.setPuntosJugador1Fallo();
                        }
                        else {
                            preguntaLocal.setPuntosJugador2Fallo();
                        } 
                    }
                    else {
                        JOptionPane.showMessageDialog(FilmxQuiz,"Ya no puede conseguir más pistas.","WARNING", JOptionPane.WARNING_MESSAGE);  
                    }   
                }   
                
                //Se actualiza la interfaz de FilmxQuiz
                puntosJ1FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(preguntaLocal.getPuntosJugador2()));
                respuestaFilmxQuiz.setText(null);
                break;
                
            default:
                break;
        }
    }//GEN-LAST:event_responderFilmxQuizActionPerformed

    private void responderPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderPPActionPerformed
        if (listaPendientesPP.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(PartidasPendientes,"Seleccione una partida de la lista para poder responderla.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            //Algoritmo para extraer la id de la partida para identificarla mediante uso de Strings.
            int index = listaPendientesPP.getSelectedValue().indexOf(("Id: "));
            String id = listaPendientesPP.getSelectedValue().substring(index + 4, index + 13);
 
            partidaResponder = Usuarios.obtenerPartida(Integer.parseInt(id));
            
            if (usuarioSesion.getNombre().compareTo(partidaResponder.getJugador2().getNombre()) == 0) {
                //Generación de preguntas
                Pelicula peliculaP = Pregunta.seleccionarPelicula();
                Pregunta pregunta = new Pregunta(peliculaP,partidaResponder.getPtos_jugador1(),partidaResponder.getPtos_jugador2());
                preguntaLocal = pregunta;

                //Función de formular pregunta de la clase Pregunta y diseño de la ventana de FilmxQuiz
                jugador1FilmxQuiz.setText(partidaResponder.getJugador1().getNombre());
                jugador2FilmxQuiz.setText(partidaResponder.getJugador2().getNombre());
                jugador1FQ.setText(partidaResponder.getJugador1().getNombre());
                jugador2FQ.setText(partidaResponder.getJugador2().getNombre());
                puntosJ1FilmxQuiz.setText(String.valueOf(partidaResponder.getPtos_jugador1()));
                puntosJ2FilmxQuiz.setText(String.valueOf(partidaResponder.getPtos_jugador2()));
                preguntaFilmxQuiz.setText(pregunta.toString());
                
                //Se escribe el numero de pregunta 1
                numeroPreguntaFilmxQuiz.setText(String.valueOf(1));

                //Configuración de la ventana JuegoFilmx.
                FilmxQuiz.setModal(true);
                FilmxQuiz.setLocationRelativeTo(null);
                FilmxQuiz.setTitle("Filmx Quiz");
                FilmxQuiz.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(PartidasPendientes,"Ya has jugado esta partida, espere a que el jugador 2 responda a las preguntas.","ERROR", JOptionPane.ERROR_MESSAGE);
            }  
        }  
    }//GEN-LAST:event_responderPPActionPerformed

    private void compartirTodosSCPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirTodosSCPartidaActionPerformed
        if (partidaSeleccionadaSCP.isSelectionEmpty() || "".equals(partidaSeleccionadaSCP.getSelectedValue())) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Seleccione una partida o complete alguna para poder compartirla.","ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else {
            //Algoritmo para extraer la id de la partida para identificarla mediante uso de Strings.
            int index = partidaSeleccionadaSCP.getSelectedValue().indexOf(("Id: "));
            String id = partidaSeleccionadaSCP.getSelectedValue().substring(index + 4, index + 13);           
            
            usuarioSesion.compartirPartida(Usuarios.obtenerPartidaCompleta(Integer.parseInt(id)));
            JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Se ha compartido la partida con todos sus amigos, menos con los que ya contaban con ella en su muro.","INFO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_compartirTodosSCPartidaActionPerformed

    private void cancelarCpartidaSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCpartidaSCPActionPerformed
        SeleccionadorCompartirPartida.dispose();
    }//GEN-LAST:event_cancelarCpartidaSCPActionPerformed

    private void compartirSeleccionadosSCPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartirSeleccionadosSCPartidaActionPerformed
        //Si se ha seleccionado algun amigo en la lista de amigos se le compartirá la partida, que también haya seleccionado el usuario, y ésta aparecerá en su muro.
        if (amigosFilmx.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Seleccione el amigo o los amigos con los que desea compartir haciendo click en su nombre que aparece en la lista y añadiendo más maneteniendo pulsado CTRL.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if (partidaSeleccionadaSCP.isSelectionEmpty() || "".equals(partidaSeleccionadaSCP.getSelectedValue())) {
            JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Seleccione una partida de la lista o complete alguna para poder compartirla.","ERROR", JOptionPane.ERROR_MESSAGE);            
        }
        else {           
            int[] indices = amigosFilmx.getSelectedIndices();
            
            //Algoritmo para extraer la id de la partida para identificarla mediante uso de Strings.
            int index = partidaSeleccionadaSCP.getSelectedValue().indexOf(("Id: "));
            String id = partidaSeleccionadaSCP.getSelectedValue().substring(index + 4, index + 13);
 
            if (indices.length == 1) {               
                Usuario uC = Usuarios.obtenerUsuario(amigosFilmx.getSelectedValue());
                
                if (uC.getMuro().indexOf(id) == -1) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Se ha compartido la partida con su amigo.","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Ya ha compartido la partida con su amigo, seleccione otro amigo para compartir.","ERROR", JOptionPane.ERROR_MESSAGE);
                } 
                
                usuarioSesion.compartirPartida(Usuarios.obtenerPartidaCompleta(Integer.parseInt(id)), uC);  
            }
            else {
                StringBuilder mensaje1 = new StringBuilder("");
                StringBuilder mensaje2 = new StringBuilder("");
                ArrayList<String> usuariosNom = new ArrayList<>(amigosFilmx.getSelectedValuesList());               
                
                for (String nom: usuariosNom) {
                    Usuario uCs = Usuarios.obtenerUsuario(nom);
                    
                    if (uCs.getMuro().indexOf(id) == -1) {
                        if ("".equals(mensaje1)) {
                           mensaje1.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje1.append(uCs.getNombre()).append(" ");
                        }                        
                    }  
                    else {
                        if ("".equals(mensaje2)) {
                           mensaje2.insert(0, uCs.getNombre()).append(" ");
                        }
                        else {
                            mensaje2.append(uCs.getNombre()).append(" ");
                        }  
                    }  
                    
                    usuarioSesion.compartirPartida(Usuarios.obtenerPartidaCompleta(Integer.parseInt(id)), uCs);
                }
                
                if ("".equals(mensaje1.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Ya ha compartido la partida con todos los amigos seleccionados.","ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else if ("".equals(mensaje2.toString())) {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Se ha compartido la partida con todos los amigos seleccionados correctamente.","INFO", JOptionPane.INFORMATION_MESSAGE);                    
                }
                else {
                    JOptionPane.showMessageDialog(SeleccionadorCompartirPartida,"Se ha compartido la partida con " + mensaje1 + "pero " + mensaje2 + "ya contaban con la crítica en su muro.","WARNING", JOptionPane.WARNING_MESSAGE);                    
                }
            }     
        }
    }//GEN-LAST:event_compartirSeleccionadosSCPartidaActionPerformed

    private void CompartirPartidaFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompartirPartidaFilmxActionPerformed
        //Configuración de la ventana SeleccionadorCompartirPartida.
        SeleccionadorCompartirPartida.setModal(true);
        SeleccionadorCompartirPartida.setLocationRelativeTo(null);
        SeleccionadorCompartirPartida.setTitle("Seleccionador Partida");
        SeleccionadorCompartirPartida.setVisible(true);
    }//GEN-LAST:event_CompartirPartidaFilmxActionPerformed

    private void clasificacionFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacionFilmxActionPerformed
        //Configuración de la ventana MenuClasificación.
        MenuClasificacion.setModal(true);
        MenuClasificacion.setLocationRelativeTo(null);
        MenuClasificacion.setTitle("Clasificación");
        MenuClasificacion.setVisible(true);
    }//GEN-LAST:event_clasificacionFilmxActionPerformed

    private void cancelarClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarClasificacionActionPerformed
        MenuClasificacion.dispose();
    }//GEN-LAST:event_cancelarClasificacionActionPerformed

    private void ordenarPuntosClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPuntosClasificacionActionPerformed
        Clasificacion c = new Clasificacion();
        
        dlmClasificacion.removeAllElements();
        listaClasificacion.setModel(dlmClasificacion);
        for (String s: c.ordenarPuntos()) {
            dlmClasificacion.addElement(s);
        }
        listaClasificacion.setModel(dlmClasificacion);
    }//GEN-LAST:event_ordenarPuntosClasificacionActionPerformed

    private void ordenarVictoriasClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarVictoriasClasificacionActionPerformed
        Clasificacion c = new Clasificacion();
        
        dlmClasificacion.removeAllElements();
        listaClasificacion.setModel(dlmClasificacion);
        for (String s: c.ordenarVictorias()) {
            dlmClasificacion.addElement(s);
        }
        listaClasificacion.setModel(dlmClasificacion);
    }//GEN-LAST:event_ordenarVictoriasClasificacionActionPerformed

    private void ordenarPorcentajeClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorcentajeClasificacionActionPerformed
        Clasificacion c = new Clasificacion();
        
        dlmClasificacion.removeAllElements();
        listaClasificacion.setModel(dlmClasificacion);
        for (String s: c.ordenarPorcentaje()) {
            dlmClasificacion.addElement(s);
        }
        listaClasificacion.setModel(dlmClasificacion);
    }//GEN-LAST:event_ordenarPorcentajeClasificacionActionPerformed

    private void txtClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClasificacionActionPerformed
        //Se abre un JOptionPane y el usuario escribe el nombre del archivo
        Clasificacion c = new Clasificacion();
        String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo.");                   
        
        if (nombreArchivo != null) {
            //Al nombre que el usuario ha escrito se le agrega el .txt
            c.volcarTXT(nombreArchivo + ".txt"); 
            JOptionPane.showMessageDialog(MenuClasificacion,"La clasificación se ha guardado en el archivo " + nombreArchivo + ".txt correctamente.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);            
        }
        else {
            JOptionPane.showMessageDialog(MenuClasificacion,"Se ha cancelado la operación.","CANCELAR", JOptionPane.ERROR_MESSAGE);            
        }           
    }//GEN-LAST:event_txtClasificacionActionPerformed

    private void cancelarDetallesClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDetallesClasificacionActionPerformed
        detallesC.setText(null);
        DetallesClasificacion.dispose();
    }//GEN-LAST:event_cancelarDetallesClasificacionActionPerformed

    private void mostrarDetallesClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDetallesClasificacionActionPerformed
        if (listaClasificacion.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(MenuClasificacion,"Seleccione el usuario del que quiere ver el detalle de sus partidas.","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else {
            //Algoritmo para extraer el nombre del usuario identificarlo mediante uso de Strings.
            int indexIni = listaClasificacion.getSelectedValue().indexOf(("Nombre: "));
            int indexFin = listaClasificacion.getSelectedValue().indexOf((" Jugadas: "));
            String nombre = listaClasificacion.getSelectedValue().substring(indexIni + 8, indexFin - 1);

            for (String s: Item.detallePartidas(nombre)) {
                detallesC.append(s);
            }

            //Configuración de la ventana DetallesClasificación.
            DetallesClasificacion.setModal(true);
            DetallesClasificacion.setLocationRelativeTo(null);
            DetallesClasificacion.setTitle("Detalles");
            DetallesClasificacion.setVisible(true);            
        }
    }//GEN-LAST:event_mostrarDetallesClasificacionActionPerformed

    private void ajustesFilmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesFilmxActionPerformed
        //Configuración de la ventana AjustesFilmx.
        AjustesFilmx.setModal(true);
        AjustesFilmx.setLocationRelativeTo(null);
        AjustesFilmx.setTitle("Ajustes");
        AjustesFilmx.setVisible(true);  
    }//GEN-LAST:event_ajustesFilmxActionPerformed

    private void cancelarAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAjustesActionPerformed
        AjustesFilmx.dispose();
    }//GEN-LAST:event_cancelarAjustesActionPerformed

    private void guardarUSerializadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUSerializadoActionPerformed
        //Se abre un JOptionPane y el usuario escribe el nombre del archivo
        ArrayList<Usuario> usuariosSistema = Usuarios.leer();
        String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo.");                   
        
        if (nombreArchivo != null) {
            //Al nombre que el usuario ha escrito se le agrega el .txt
            Usuarios.escribirNuevo(usuariosSistema, nombreArchivo + ".txt"); 
            JOptionPane.showMessageDialog(MenuClasificacion,"La información de los usuarios se han guardado en el archivo " + nombreArchivo + ".txt correctamente.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);            
        }
        else {
            JOptionPane.showMessageDialog(MenuClasificacion,"Se ha cancelado la operación.","CANCELAR", JOptionPane.ERROR_MESSAGE);            
        }    
    }//GEN-LAST:event_guardarUSerializadoActionPerformed

    private void guardarPSerializadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPSerializadoActionPerformed
        //Se abre un JOptionPane y el usuario escribe el nombre del archivo
        ArrayList<Pelicula> peliculasSistema = Peliculas.leer();
        String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo.");                   
        
        if (nombreArchivo != null) {
            //Al nombre que el usuario ha escrito se le agrega el .txt
            Peliculas.escribirNuevo(peliculasSistema, nombreArchivo + ".txt"); 
            JOptionPane.showMessageDialog(MenuClasificacion,"La información de las películas se ha guardado en el archivo " + nombreArchivo + ".txt correctamente.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);            
        }
        else {
            JOptionPane.showMessageDialog(MenuClasificacion,"Se ha cancelado la operación.","CANCELAR", JOptionPane.ERROR_MESSAGE);            
        }    
    }//GEN-LAST:event_guardarPSerializadoActionPerformed

    private void cargarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarUActionPerformed
        //Se abre un JOptionPane y el usuario escribe el nombre del archivo
        String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo.");                   
        
        if (nombreArchivo != null) {
            //Al nombre que el usuario ha escrito se le agrega el .txt
            Usuarios.cargarSerializado(nombreArchivo + ".txt"); 
            JOptionPane.showMessageDialog(MenuClasificacion,"La información de los usuarios se ha cargado en el sistema.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);            
        }
        else {
            JOptionPane.showMessageDialog(MenuClasificacion,"Se ha cancelado la operación.","CANCELAR", JOptionPane.ERROR_MESSAGE);            
        } 
    }//GEN-LAST:event_cargarUActionPerformed

    private void cargarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPActionPerformed
        //Se abre un JOptionPane y el usuario escribe el nombre del archivo
        String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo.");                   
        
        if (nombreArchivo != null) {
            //Al nombre que el usuario ha escrito se le agrega el .txt
            Peliculas.cargarSerializado(nombreArchivo + ".txt");
            JOptionPane.showMessageDialog(MenuClasificacion,"La información de las películas se ha cargado en el sistema.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);            
        }
        else {
            JOptionPane.showMessageDialog(MenuClasificacion,"Se ha cancelado la operación.","CANCELAR", JOptionPane.ERROR_MESSAGE);            
        } 
    }//GEN-LAST:event_cargarPActionPerformed

    
    //Redefino el metodo getIconImage de todas las ventanas para poder establecer el logo.
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
            getImage(ClassLoader.getSystemResource("logoFilmx/logoVentanas.png"));


        return retValue;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AjustesFilmx;
    private javax.swing.JDialog AltaPeliculas;
    private javax.swing.JButton CompartirCriticaFilmx;
    private javax.swing.JButton CompartirPartidaFilmx;
    private javax.swing.JButton CompartirTodoFilmx;
    private javax.swing.JDialog Critica;
    private javax.swing.JDialog DetallesClasificacion;
    private javax.swing.JFrame Filmx;
    private javax.swing.JDialog FilmxQuiz;
    private javax.swing.JDialog InvitarAmigos;
    private javax.swing.JDialog MenuClasificacion;
    private javax.swing.JDialog NotificacionesAmigos;
    private javax.swing.JDialog PartidasPendientes;
    private javax.swing.JDialog Registro;
    private javax.swing.JDialog SeleccionadorCompartirCritica;
    private javax.swing.JDialog SeleccionadorCompartirPartida;
    private javax.swing.JDialog SeleccionadorCompartirPelicula;
    private javax.swing.JDialog SeleccionadorCompartirTodo;
    private javax.swing.JDialog SeleccionadorPelicula;
    private javax.swing.JButton aceptarAlta;
    private javax.swing.JButton aceptarNotificacionesAmigos;
    private javax.swing.JTextField actorAlta;
    private javax.swing.JTextField actrizAlta;
    private javax.swing.JButton ajustesFilmx;
    private javax.swing.JButton altaPeliculaFilmx;
    private javax.swing.JList<String> amigosFilmx;
    private javax.swing.JTextField añoAlta;
    private javax.swing.JButton cancelarAjustes;
    private javax.swing.JButton cancelarAlta;
    private javax.swing.JButton cancelarClasificacion;
    private javax.swing.JButton cancelarCpartidaSCP;
    private javax.swing.JButton cancelarCritica;
    private javax.swing.JButton cancelarDetallesClasificacion;
    private javax.swing.JButton cancelarFilmxQuiz;
    private javax.swing.JButton cancelarInicio;
    private javax.swing.JButton cancelarInvitarAmigos;
    private javax.swing.JButton cancelarNotificacionesAmigos;
    private javax.swing.JButton cancelarPP;
    private javax.swing.JButton cancelarRegistro;
    private javax.swing.JButton cancelarSCC;
    private javax.swing.JButton cancelarSCP;
    private javax.swing.JButton cancelarSCT;
    private javax.swing.JButton cancelarSeleccionadorPelicula;
    private javax.swing.JButton cargarP;
    private javax.swing.JButton cargarU;
    private javax.swing.JButton cerrarSesionFilmx;
    private javax.swing.JButton clasificacionFilmx;
    private javax.swing.JButton compartirPeliculaFilmx;
    private javax.swing.JButton compartirSeleccionadosSCC;
    private javax.swing.JButton compartirSeleccionadosSCP;
    private javax.swing.JButton compartirSeleccionadosSCPartida;
    private javax.swing.JButton compartirSeleccionadosSCT;
    private javax.swing.JButton compartirTodosSCC;
    private javax.swing.JButton compartirTodosSCP;
    private javax.swing.JButton compartirTodosSCPartida;
    private javax.swing.JButton compartirTodosSCT;
    private javax.swing.JTextArea criticaCritica;
    private javax.swing.JList<String> criticaSeleccionadaSCC;
    private javax.swing.JButton criticarPeliculaFilmx;
    private javax.swing.JTextArea detallesC;
    private javax.swing.JTextField directorAlta;
    private javax.swing.JButton eliminarAmigoFILMX;
    private javax.swing.JTextField generoAlta;
    private javax.swing.JButton guardarPSerializado;
    private javax.swing.JButton guardarUSerializado;
    private javax.swing.JButton inicioSesionInicio;
    private javax.swing.JButton invitarAmigosFILMX;
    private javax.swing.JButton invitarInvitarAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jugador1FQ;
    private javax.swing.JLabel jugador1FilmxQuiz;
    private javax.swing.JLabel jugador2FQ;
    private javax.swing.JLabel jugador2FilmxQuiz;
    private javax.swing.JButton jugarPartidaFilmx;
    private javax.swing.JList<String> listaClasificacion;
    private javax.swing.JList<String> listaPendientesPP;
    private javax.swing.JButton mostrarDetallesClasificacion;
    private javax.swing.JTextArea muroFilmx;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JLabel nombreUsuarioSesion;
    private javax.swing.JButton notificacionesFILMX;
    private javax.swing.JLabel numeroPreguntaFilmxQuiz;
    private javax.swing.JButton ordenarPorcentajeClasificacion;
    private javax.swing.JButton ordenarPuntosClasificacion;
    private javax.swing.JButton ordenarVictoriasClasificacion;
    private javax.swing.JList<String> partidaSeleccionadaSCP;
    private javax.swing.JButton partidasPendientesFilmx;
    private javax.swing.JPasswordField passInicio;
    private javax.swing.JTextField passRegistro;
    private javax.swing.JComboBox<String> peliculaSelec;
    private javax.swing.JComboBox<String> peliculaSeleccionadaSCP;
    private javax.swing.JTextArea preguntaFilmxQuiz;
    private javax.swing.JButton publicarCritica;
    private javax.swing.JLabel puntosJ1FilmxQuiz;
    private javax.swing.JLabel puntosJ2FilmxQuiz;
    private javax.swing.JSpinner puntuacionCritica;
    private javax.swing.JButton rechazarNotificacionesAmigos;
    private javax.swing.JButton refrescarMuroFILMX;
    private javax.swing.JButton registrarRegistro;
    private javax.swing.JButton registrarseInicio;
    private javax.swing.JButton responderFilmxQuiz;
    private javax.swing.JButton responderPP;
    private javax.swing.JTextField respuestaFilmxQuiz;
    private javax.swing.JButton salirFilmx;
    private javax.swing.JButton selecPelicula;
    private javax.swing.JButton siguientePistaFilmxQuiz;
    private javax.swing.JComboBox<String> solEnviadasNotificacionesAmigos;
    private javax.swing.JComboBox<String> solRecibidasNotificacionesAmigos;
    private javax.swing.JTextField tituloAlta;
    private javax.swing.JLabel tituloApp;
    private javax.swing.JTextField tituloCritica;
    private javax.swing.JButton txtClasificacion;
    private javax.swing.JTextField usuInicio;
    private javax.swing.JTextField usuarioBusInvitarAmigos;
    // End of variables declaration//GEN-END:variables
}
