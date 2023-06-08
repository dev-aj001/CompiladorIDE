package vista;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author jairi
 */
public class Main extends javax.swing.JFrame {

    //Variables para el funcionamiento del compilador
    
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;
    
    //Variables para el funcionamiento de la interfaz
    private DefaultMutableTreeNode root;
    private DefaultTreeModel modelo;
    private boolean numeracion = true;
    private ArrayList<PanelTexto> listAreaTexto;
    private ArrayList<File> listFile;
    private int contPanel = 0;
    private boolean existPanel = false;
    
    private File currentFile;
    private Font currentFont;
    
    private String exten = ".asperlang";
    
    Image desktopIcon = Toolkit.getDefaultToolkit().getImage("src\\style\\compilar.png").getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    //
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setIconImage(desktopIcon);
        setTitle("AsperLang IDE 0.0.1");
        init();
        //initCompiler();
    }

    private void init(){
        txtOutput.setEditable(false);
        listFile = new ArrayList<File>();
        listAreaTexto = new ArrayList<PanelTexto>();
        currentFile = new File("C:/Users/jairi/Documents/Compilador normal/Compilador/Programas prueba");
        actualizarFile(currentFile);
        
        File a = new File(currentFile, "b.asperlang");
        System.out.println("Parent: "+ currentFile.getPath());
        System.out.println("Current: "+ a.getPath());
        
        currentFont = new Font("consolas", Font.PLAIN, 14);
       
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //programar un evento que verifique si hay archivos no guardados
                System.exit(0);//salir
            }
        });
        
        desactivarBotones();
        //programar un metodo para guardar archivos .asp
        //programar un metodo para guardar como
        //Programar un metodo que cada que editemos el archivo agregue un asterisco
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        pnlToolBar = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        btnEjecutar = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        btnTLexica = new javax.swing.JButton();
        btnTsimbolos = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        spnl1 = new javax.swing.JSplitPane();
        spnl2 = new javax.swing.JSplitPane();
        pnlEditor = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        pnlOutput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextPane();
        pnlNavegador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        pnlTabla = new javax.swing.JPanel();
        btnCerrarTabla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnlTabla2 = new javax.swing.JPanel();
        scrlTablaLexica = new javax.swing.JScrollPane();
        tblLexica = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        imGuardar = new javax.swing.JMenuItem();
        imGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        imCerrar = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miDeshacer = new javax.swing.JMenuItem();
        miRehacer = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miSelectAll = new javax.swing.JMenuItem();
        miSelectLine = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        miDeleteSelected = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        mEjecutar = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();

        jFileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 400));

        pnlToolBar.setBackground(UIManager.getColor("MyApp.color1"));
        pnlToolBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlToolBar.setMaximumSize(new java.awt.Dimension(32767, 28));
        pnlToolBar.setLayout(new javax.swing.BoxLayout(pnlToolBar, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar3.setFloatable(true);
        jToolBar3.setRollover(true);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar3.add(btnNuevo);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar3.add(btnGuardar);

        btnAbrir.setText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar3.add(btnAbrir);

        pnlToolBar.add(jToolBar3);

        jToolBar2.setFloatable(true);
        jToolBar2.setRollover(true);

        btnDeshacer.setText("Deshacer");
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDeshacer);

        btnRehacer.setText("Rehacer");
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacerActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRehacer);

        pnlToolBar.add(jToolBar2);

        jToolBar4.setFloatable(true);
        jToolBar4.setRollover(true);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setFocusable(false);
        btnEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEjecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        jToolBar4.add(btnEjecutar);

        btnCompilar.setText("Compilar");
        btnCompilar.setFocusable(false);
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        jToolBar4.add(btnCompilar);

        pnlToolBar.add(jToolBar4);

        jToolBar5.setFloatable(true);
        jToolBar5.setRollover(true);

        btnTLexica.setText("Tabla Lexica");
        btnTLexica.setFocusable(false);
        btnTLexica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTLexica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTLexica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLexicaActionPerformed(evt);
            }
        });
        jToolBar5.add(btnTLexica);

        btnTsimbolos.setText("Tabla de simbolos");
        btnTsimbolos.setFocusable(false);
        btnTsimbolos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTsimbolos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTsimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTsimbolosActionPerformed(evt);
            }
        });
        jToolBar5.add(btnTsimbolos);

        pnlToolBar.add(jToolBar5);

        pnlPrincipal.setBackground(UIManager.getColor( "MyApp.color1" ));

        spnl1.setDividerLocation(250);

        spnl2.setDividerLocation(400);
        spnl2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTabbedPane.setAutoscrolls(true);
        jTabbedPane.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPaneComponentAdded(evt);
            }
        });
        jTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlEditorLayout = new javax.swing.GroupLayout(pnlEditor);
        pnlEditor.setLayout(pnlEditorLayout);
        pnlEditorLayout.setHorizontalGroup(
            pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        pnlEditorLayout.setVerticalGroup(
            pnlEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        spnl2.setTopComponent(pnlEditor);

        jLabel1.setText("Output");

        jScrollPane2.setViewportView(txtOutput);

        javax.swing.GroupLayout pnlOutputLayout = new javax.swing.GroupLayout(pnlOutput);
        pnlOutput.setLayout(pnlOutputLayout);
        pnlOutputLayout.setHorizontalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOutputLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOutputLayout.setVerticalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        spnl2.setRightComponent(pnlOutput);

        spnl1.setBottomComponent(spnl2);

        pnlNavegador.setBackground(UIManager.getColor( "MyApp.colorBase" ));

        jLabel2.setText("Navegador");

        jTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        pnlTabla.setBackground(UIManager.getColor( "MyApp.colorBase" ));

        btnCerrarTabla.setText("Cerrar");
        btnCerrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTablaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tabla lexica");

        pnlTabla2.setLayout(new java.awt.BorderLayout());

        tblLexica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Componente Lex.", "Lexema", "Numero de linea"
            }
        ));
        scrlTablaLexica.setViewportView(tblLexica);

        pnlTabla2.add(scrlTablaLexica, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarTabla))
            .addComponent(pnlTabla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarTabla)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabla2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNavegadorLayout = new javax.swing.GroupLayout(pnlNavegador);
        pnlNavegador.setLayout(pnlNavegadorLayout);
        pnlNavegadorLayout.setHorizontalGroup(
            pnlNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlNavegadorLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNavegadorLayout.setVerticalGroup(
            pnlNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        spnl1.setLeftComponent(pnlNavegador);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnl1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnl1)
                .addContainerGap())
        );

        jMenuBar1.setBorder(null);

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Nuevo archivo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Abrir archivo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem25.setText("Abrir carpeta");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem25);
        jMenu1.add(jSeparator6);

        imGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        imGuardar.setText("Guardar archivo");
        imGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(imGuardar);

        imGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        imGuardarComo.setText("Guardar como...");
        imGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(imGuardarComo);
        jMenu1.add(jSeparator1);

        imCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        imCerrar.setText("Cerrar archivo");
        imCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(imCerrar);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        miDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miDeshacer.setText("Deshacer");
        miDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeshacerActionPerformed(evt);
            }
        });
        jMenu2.add(miDeshacer);

        miRehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miRehacer.setText("Rehacer");
        miRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRehacerActionPerformed(evt);
            }
        });
        jMenu2.add(miRehacer);
        jMenu2.add(jSeparator2);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem11.setText("Cortar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem12.setText("Copiar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem13.setText("Pegar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Selección");

        miSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSelectAll.setText("Seleccionar todo");
        miSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllActionPerformed(evt);
            }
        });
        jMenu3.add(miSelectAll);

        miSelectLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSelectLine.setText("Seleccionar linea");
        miSelectLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectLineActionPerformed(evt);
            }
        });
        jMenu3.add(miSelectLine);
        jMenu3.add(jSeparator4);

        miDeleteSelected.setText("Eliminar selección");
        miDeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteSelectedActionPerformed(evt);
            }
        });
        jMenu3.add(miDeleteSelected);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ver");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Numero de linea");
        jCheckBoxMenuItem1.setEnabled(false);
        jCheckBoxMenuItem1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItem1StateChanged(evt);
            }
        });
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem1);

        jMenuItem2.setText("Fuente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);
        jMenu4.add(jSeparator5);

        jMenu7.setText("Seleccionar tema");

        jMenuItem26.setText("Principal");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem26);

        jMenuItem27.setText("Claro");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem27);

        jMenuItem28.setText("Oscuro");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem28);

        jMenu4.add(jMenu7);
        jMenu4.add(jSeparator3);

        jMenuItem20.setText("Tabla lexica");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("Tabla de simbolos lexicos");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        mEjecutar.setText("Ejecutar");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem15.setText("Ejecutar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        mEjecutar.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem16.setText("Compilar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        mEjecutar.add(jMenuItem16);

        jMenuBar1.add(mEjecutar);

        jMenu5.setText("Ayuda");

        jMenuItem17.setText("acerca de");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Documentación");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Buscar actualizaciónes");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        //hola
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        crearPanel("nuevo*");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void miDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeshacerActionPerformed
        btnDeshacer.doClick();
    }//GEN-LAST:event_miDeshacerActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        crearPanel("nuevo*");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        int selection = jFileChooser.showOpenDialog(this);
        if(selection == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser.getSelectedFile();
            currentFile = fichero;
            actualizarFile(fichero);
        }else{
            JOptionPane.showMessageDialog(null, "no se selecciono ningun directorio");
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        FlatLaf.updateUI();
        actualizarColores();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        try {
            UIManager.setLookAndFeel( new FlatIntelliJLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        FlatLaf.updateUI();
        actualizarColores();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        pnlTabla2.add(scrlTablaLexica);
        pnlTabla2.revalidate();
        pnlTabla2.repaint();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        FlatLaf.updateUI();
        actualizarColores();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void btnCerrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTablaActionPerformed
        pnlTabla2.remove(scrlTablaLexica);
        pnlTabla2.revalidate();
        pnlTabla2.repaint();
    }//GEN-LAST:event_btnCerrarTablaActionPerformed

    private void btnTLexicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLexicaActionPerformed
        pnlTabla2.add(scrlTablaLexica);
        pnlTabla2.revalidate();
        pnlTabla2.repaint();
    }//GEN-LAST:event_btnTLexicaActionPerformed

    private void jCheckBoxMenuItem1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1StateChanged
        actualizarNumeracion();
    }//GEN-LAST:event_jCheckBoxMenuItem1StateChanged

    private void imCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCerrarActionPerformed
        listAreaTexto.remove(jTabbedPane.getSelectedIndex());
        listFile.remove(jTabbedPane.getSelectedIndex());
        jTabbedPane.remove(jTabbedPane.getSelectedIndex());
        System.out.println(jTabbedPane.getSelectedIndex());
        contPanel--;
        if(contPanel<=0) desactivarBotones();
    }//GEN-LAST:event_imCerrarActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirArchivo();        
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMouseClicked
        if(evt.getButton() == 3){
           JOptionPane.showMessageDialog(null, "click izquierdo");
        }
        if(evt.getButton() == 1 && evt.getClickCount() == 2){
            String name = jTree.getLastSelectedPathComponent().toString();
            File selectedFile = new File(currentFile, name);
            abrirDesdeTree(selectedFile);
        }
    }//GEN-LAST:event_jTreeMouseClicked

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        //JOptionPane.showMessageDialog(null, "Deshacer");
        listAreaTexto.get(jTabbedPane.getSelectedIndex()).undo();
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FontChooser f = new FontChooser(this);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //JOptionPane.showMessageDialog(null, "guardar");
        //guardar como si no existe el archivo
        if(listFile.get(jTabbedPane.getSelectedIndex()).getPath().equals("")){
            guardarComo();
        }else{
            guardar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacerActionPerformed
        //JOptionPane.showMessageDialog(null, "Rehacer");
        listAreaTexto.get(jTabbedPane.getSelectedIndex()).redo();
    }//GEN-LAST:event_btnRehacerActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        JOptionPane.showMessageDialog(null, "ejecutar");
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        btnGuardar.doClick();
        compilar();
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnTsimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTsimbolosActionPerformed
        JOptionPane.showMessageDialog(null, "simbolos");
    }//GEN-LAST:event_btnTsimbolosActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        btnTsimbolos.doClick();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        JOptionPane.showMessageDialog(null, "actualizado");
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        JOptionPane.showMessageDialog(null, "abrir pagina de documentacion");
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        JOptionPane.showMessageDialog(null, "abrir paguina acerca de");
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        btnCompilar.doClick();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        btnEjecutar.doClick();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void miSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllActionPerformed
        listAreaTexto.get(jTabbedPane.getSelectedIndex()).selectAll();
    }//GEN-LAST:event_miSelectAllActionPerformed

    private void miSelectLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectLineActionPerformed
        JOptionPane.showMessageDialog(null, "seleccionar una linea");
    }//GEN-LAST:event_miSelectLineActionPerformed

    private void miDeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteSelectedActionPerformed
        JOptionPane.showMessageDialog(null, "eliminar seleccion");
    }//GEN-LAST:event_miDeleteSelectedActionPerformed

    private void miRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRehacerActionPerformed
        btnRehacer.doClick();
    }//GEN-LAST:event_miRehacerActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
                
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JOptionPane.showMessageDialog(null, "copiar");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JOptionPane.showMessageDialog(null, "pegar");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void imGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imGuardarActionPerformed
        btnGuardar.doClick();
    }//GEN-LAST:event_imGuardarActionPerformed

    private void imGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_imGuardarComoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        salir();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneStateChanged
        int selectedIndex = jTabbedPane.getSelectedIndex();
        
        if(selectedIndex >= 0 && selectedIndex < listFile.size()){
            String file = listFile.get(selectedIndex).getPath();
            
            if(file.endsWith(exten)){
                compileBoton(true);
            }else{
                compileBoton(false);
            }
            
            Undo(listAreaTexto.get(selectedIndex).isCanUndo());
            Redo(listAreaTexto.get(selectedIndex).isCanRedo());
        }else{
            System.out.println("Indixe selecionado no valido");
        }
            
    }//GEN-LAST:event_jTabbedPaneStateChanged

    private void jTabbedPaneComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPaneComponentAdded
        
    }//GEN-LAST:event_jTabbedPaneComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //LookAndFeel FlatLaf
        //Propiedades
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        try {
            UIManager.setLookAndFeel( new FlatIntelliJLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCerrarTabla;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnTLexica;
    private javax.swing.JButton btnTsimbolos;
    private javax.swing.JMenuItem imCerrar;
    private javax.swing.JMenuItem imGuardar;
    private javax.swing.JMenuItem imGuardarComo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JTree jTree;
    private javax.swing.JMenu mEjecutar;
    private javax.swing.JMenuItem miDeleteSelected;
    private javax.swing.JMenuItem miDeshacer;
    private javax.swing.JMenuItem miRehacer;
    private javax.swing.JMenuItem miSelectAll;
    private javax.swing.JMenuItem miSelectLine;
    private javax.swing.JPanel pnlEditor;
    private javax.swing.JPanel pnlNavegador;
    private javax.swing.JPanel pnlOutput;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTabla2;
    private javax.swing.JPanel pnlToolBar;
    private javax.swing.JScrollPane scrlTablaLexica;
    private javax.swing.JSplitPane spnl1;
    private javax.swing.JSplitPane spnl2;
    private javax.swing.JTable tblLexica;
    private javax.swing.JTextPane txtOutput;
    // End of variables declaration//GEN-END:variables

    private void actualizarFile(File fichero) {
        root = new DefaultMutableTreeNode(fichero.getName());
        modelo = new DefaultTreeModel(root);
        
        crea(root,fichero);
        jTree.setModel(modelo);
        
    }

    private void crea(DefaultMutableTreeNode nodo, File carpeta) {
        File[] archivos = carpeta.listFiles();
        
        if(archivos!=null){
            int contador=0;
            for (File archivo : archivos) {
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(archivo.getName());
                modelo.insertNodeInto(hijo, nodo, contador);
                contador++;
                if(archivo.isDirectory()){
                    crea(hijo,archivo);
                }
            }
        }else{
            
        }
    }

    private void crearPanel(String titulo) {
        listFile.add(new File(""));
        listAreaTexto.add(new PanelTexto(numeracion, this));
        jTabbedPane.add(titulo, listAreaTexto.get(contPanel));
        jTabbedPane.setSelectedIndex(contPanel);
        contPanel++;
        changeFont(currentFont);
        existPanel=true;
        activarBotones();
    }

    private void actualizarColores() {
        pnlNavegador.setBackground(UIManager.getColor( "MyApp.colorBase" ));
        pnlPrincipal.setBackground(UIManager.getColor( "MyApp.color1" ));
        pnlToolBar.setBackground(UIManager.getColor( "MyApp.color1" ));
        
    }
    

    private void actualizarNumeracion() {
        numeracion = !numeracion;
        for (int i = 0; i < contPanel; i++) {
            listAreaTexto.get(i).mostrarTextLineNumber(numeracion);
        }
    }

    private void abrirArchivo() {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = selectorArchivo.showOpenDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            try {
                boolean existePath = false;
                int exisCont = -1;
                if(jTabbedPane.getTabCount()>0)
                for (int i = 0; i < jTabbedPane.getTabCount(); i++) {
                    File archivo = selectorArchivo.getSelectedFile();
                    if(listFile.get(i).getPath().equals(archivo.getPath())){
                        existePath = true;
                        exisCont = i;
                    }
                }
                
                if(!existePath){
                    File archivo = selectorArchivo.getSelectedFile();
                    String titulo = archivo.getName();
                    crearPanel(titulo);
                    listFile.set(jTabbedPane.getSelectedIndex(), archivo);
                    FileReader leer = new FileReader(archivo);
                    
                    BufferedReader bLeer = new BufferedReader(leer);
                    String linea = "";
                    
                    txtOutput.setText("se abrío con exito: " + archivo.getPath());
                    
                    if(archivo.getPath().endsWith(exten)){
                        compileBoton(true);
                    }else{
                        compileBoton(false);
                    }
                    
                    //jTabbedPane.setTitleAt(jTabbedPane.getSelectedIndex(), titulo); // no necesario
                    
                    while(linea!=null){
                        linea = bLeer.readLine();
                        if(linea!=null){
                            listAreaTexto.get(jTabbedPane.getSelectedIndex()).append(linea+"\n");
                        }
                    }
                }else{
                    jTabbedPane.setSelectedIndex(exisCont);
                    txtOutput.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
                e.getMessage();
            }
        }
    }
    
    private void abrirDesdeTree(File file){
        try {
                boolean existePath = false;
                int exisCont = -1;
                if(jTabbedPane.getTabCount()>0)
                for (int i = 0; i < jTabbedPane.getTabCount(); i++) {
                    File archivo = file;
                    if(listFile.get(i).getPath().equals(archivo.getPath())){
                        existePath = true;
                        exisCont = i;
                    }
                }
                
                if(!existePath){
                    File archivo = archivo = file;
                    String titulo = archivo.getName();
                    crearPanel(titulo);
                    listFile.set(jTabbedPane.getSelectedIndex(), archivo);
                    FileReader leer = new FileReader(archivo);
                    
                    BufferedReader bLeer = new BufferedReader(leer);
                    String linea = "";
                    
                    txtOutput.setText("se abrío con exito: " + archivo.getPath());
                    
                    if(archivo.getPath().endsWith(exten)){
                        compileBoton(true);
                    }else{
                        compileBoton(false);
                    }
                    
                    //jTabbedPane.setTitleAt(jTabbedPane.getSelectedIndex(), titulo); // no necesario
                    
                    while(linea!=null){
                        linea = bLeer.readLine();
                        if(linea!=null){
                            listAreaTexto.get(jTabbedPane.getSelectedIndex()).append(linea+"\n");
                        }
                    }
                }else{
                    jTabbedPane.setSelectedIndex(exisCont);
                    txtOutput.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
                e.getMessage();
            }
    }
    
    public void changeFont(Font fuente){
        currentFont = fuente;
        txtOutput.setFont(fuente);
        
        for (PanelTexto panelTexto : listAreaTexto) {
            panelTexto.changeFont(fuente);
        }
    }
    
    public Font getFont(){
        return currentFont;
    }
    
    private void guardar(){
        try {
                //Leer textpane y escribir en archivo
                FileWriter fw = new FileWriter(listFile.get(jTabbedPane.getSelectedIndex()));
                //obtener texto del txtPane
                String texto = listAreaTexto.get(jTabbedPane.getSelectedIndex()).getjTextPane1().getText();
                
                for (int i = 0; i < texto.length(); i++) {
                    fw.write(texto.charAt(i));
                }
                
                fw.close();
                actualizarFile(currentFile);
                txtOutput.setText("Se guardo el archivo exitosamente!");
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private void guardarComo() {
        JFileChooser guardarArchivo = new JFileChooser();
        int opc = guardarArchivo.showSaveDialog(null);
        
        if(opc==JFileChooser.APPROVE_OPTION){
            File f = guardarArchivo.getSelectedFile();
            listFile.set(jTabbedPane.getSelectedIndex(), f);
            jTabbedPane.setTitleAt(jTabbedPane.getSelectedIndex(), f.getName());
            
            try {
                //Leer textpane y escribir en archivo
                FileWriter fw = new FileWriter(listFile.get(jTabbedPane.getSelectedIndex()));
                //obtener texto del txtPane
                String texto = listAreaTexto.get(jTabbedPane.getSelectedIndex()).getjTextPane1().getText();
                
                for (int i = 0; i < texto.length(); i++) {
                    fw.write(texto.charAt(i));
                }
                
                fw.close();
                actualizarFile(currentFile);
                txtOutput.setText("Se guardo el archivo exitosamente!");
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void activarBotones() {
        imCerrar.setEnabled(true);
        imGuardar.setEnabled(true);
        imGuardarComo.setEnabled(true);
        btnGuardar.setEnabled(true);
        miSelectAll.setEnabled(true);
    }

    private void desactivarBotones() {
        imCerrar.setEnabled(false);
        imGuardar.setEnabled(false);
        imGuardarComo.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnDeshacer.setEnabled(false);
        btnRehacer.setEnabled(false);
        btnEjecutar.setEnabled(false);
        btnCompilar.setEnabled(false);
        mEjecutar.setEnabled(false);
        miDeleteSelected.setEnabled(false);
        miSelectAll.setEnabled(false);
        miSelectLine.setEnabled(false);
        
    }

    private void compileBoton(boolean v) {
        btnEjecutar.setEnabled(v);
        btnCompilar.setEnabled(v);
        mEjecutar.setEnabled(v);
    }
    
    public void Redo(boolean v){
        btnRehacer.setEnabled(v);
        miRehacer.setEnabled(v);
    }
    
    public void Undo(boolean v){
        btnDeshacer.setEnabled(v);
        miDeshacer.setEnabled(v);
    }

    private void compilar() {
        txtOutput.setText("");
        Functions.clearDataInTable(tblLexica);
        listAreaTexto.get(jTabbedPane.getSelectedIndex()).compile();
    }
    
    public void writeConsole(String cadena){
        txtOutput.setText(cadena);
    }

    public JTable getTblLexica() {
        return tblLexica;
    }

    public void setTblLexica(JTable tblLexica) {
        this.tblLexica = tblLexica;
    }
    
    
}