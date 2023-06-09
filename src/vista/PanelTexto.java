/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Otros.TextLineNumber;
import com.sun.java.accessibility.util.AWTEventMonitor;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;
import lexico.*;

/**
 *
 * @author jairi
 */
public class PanelTexto extends javax.swing.JPanel {

    private boolean mostrando = true;
    private Timer timerKeyReleased;
    private String palabras[] = new String[]{"auto","aspersor","activar","desactivar","horario","frecuencia","zona","temporizador",
        "humedad","temperatura","estado","potencia","falla","riego","numero","bool","cadena","constante","repetir","mientras","alerta",
        "mensaje","si","intentar","asignar","fecha","verdadero","falso","inc"};
    private ArrayList<TextColor> textsColor;
    private UndoManager undoManager;
    
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;
    
    private boolean guardado = true;
    private boolean canRedo = false;
    private boolean canUndo = false;
    private ArrayList<Integer> badCodes;
    private Main mclass;
    
    // Declaraciones para Análisis Semántico
    private ArrayList<Production> ArregloProducciones;
    private ArrayList<Production> InicializacionProducciones;
    private ArrayList<Production> AsignacionProducciones;
    private ArrayList<Production> CondicionProducciones;
    private ArrayList<Production> ERCProducciones;
    private ArrayList<Production> EECProducciones;
    private ArrayList<Production> LlamadaCompletaProducciones;
    private ArrayList<Production> LlamadaEspCompletaProducciones;
    private ArrayList<Production> FuncionReproducirProducciones;
    private ArrayList<Production> FuncionDescansoProducciones;
    private ArrayList<Production> FuncionElegirInstrumentoProducciones;
    private ArrayList<Production> EstructurasFuncionesProducciones;
    private ArrayList<ArrayList> CodigoCompletoProducciones;
    
    
    public PanelTexto(boolean ln, Main mclass) {
        initComponents();
        setBackground(UIManager.getColor("MyApp.colorBase"));
        mostrando = ln;
        mostrarTextLineNumber(ln);
        
        this.mclass = mclass;
        
        setUndoManager();
        initBadCodes();
        initComp();
    }
    
    private void initComp(){
         timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();
            colorAnalysis();
        });
        
        Functions.setAutocompleterJTextComponent(palabras, jTextPane1, () ->{
            timerKeyReleased.restart();
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        
        // Analizador Semántico
        InicializacionProducciones = new ArrayList<>();
        AsignacionProducciones = new ArrayList<>();
        CondicionProducciones = new ArrayList<>();
        ERCProducciones = new ArrayList<>();
        EECProducciones = new ArrayList<>();
        LlamadaCompletaProducciones = new ArrayList<>();
        LlamadaEspCompletaProducciones = new ArrayList<>();
        FuncionReproducirProducciones = new ArrayList<>();
        FuncionDescansoProducciones = new ArrayList<>();
        FuncionElegirInstrumentoProducciones = new ArrayList<>();
        EstructurasFuncionesProducciones = new ArrayList<>();
        CodigoCompletoProducciones = new ArrayList<>();
    }
    
    private void colorAnalysis() {
         LexerColor lex;
         textsColor.clear();
        
        try {
            File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jTextPane1.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF-8"));
            lex = new LexerColor(entrada);
            while(true){
                TextColor textColor = lex.yylex();
                if(textColor == null) break;
                textsColor.add(textColor);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        Functions.colorTextPane(textsColor, jTextPane1, jTextPane1.getForeground());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setLayout(new java.awt.BorderLayout());

        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextPane1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextPane1CaretUpdate(evt);
            }
        });
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyPressed
        
    }//GEN-LAST:event_jTextPane1KeyPressed

    private void jTextPane1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextPane1CaretUpdate
        if(undoManager.canRedo()){
            mclass.Redo(true);
        }else{
            mclass.Redo(false);
        }
        if(undoManager.canUndo()){
            mclass.Undo(true);
        }else{
            mclass.Undo(false);
        }
    }//GEN-LAST:event_jTextPane1CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void mostrarTextLineNumber(boolean numeracion){
        if(numeracion){
            jScrollPane1.setRowHeaderView(new TextLineNumber(jTextPane1));
        }else{
            jScrollPane1.setRowHeaderView(null);
        }
    }
    
    public void append(String s){
        try {
            Document doc = jTextPane1.getDocument();
            doc.insertString(doc.getLength(), s, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
    
    public void changeFont(Font fuente){
        jTextPane1.setFont(fuente);
    }

    public JTextPane getjTextPane1() {
        return jTextPane1;
    }
    
    public void redo(){
        undoManager.redo();
    }
    
    public void undo(){
        undoManager.undo();
    }

    public boolean isCanRedo() {
        canRedo = undoManager.canRedo();
        return canRedo;
    }

    public boolean isCanUndo() {
        canUndo = undoManager.canUndo();
        return canUndo;
    }
    
    public void cut(){
        AWTEventMonitor.addActionListener(new DefaultEditorKit.CutAction());
    }
    
    public void selectAll(){
        jTextPane1.selectAll();
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public ArrayList<TextColor> getTextsColor() {
        return textsColor;
    }

    public void setTextsColor(ArrayList<TextColor> textsColor) {
        this.textsColor = textsColor;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<Token> tokens) {
        this.tokens = tokens;
    }

    public ArrayList<ErrorLSSL> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<ErrorLSSL> errors) {
        this.errors = errors;
    }

    public ArrayList<Production> getIdentProd() {
        return identProd;
    }

    public void setIdentProd(ArrayList<Production> identProd) {
        this.identProd = identProd;
    }

    public HashMap<String, String> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(HashMap<String, String> identificadores) {
        this.identificadores = identificadores;
    }

    public boolean isCodeHasBeenCompiled() {
        return codeHasBeenCompiled;
    }

    public void setCodeHasBeenCompiled(boolean codeHasBeenCompiled) {
        this.codeHasBeenCompiled = codeHasBeenCompiled;
    }

    public boolean isGuardado() {
        return guardado;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }
    
    

    private void initBadCodes() {
        badCodes = new ArrayList<Integer>();
        badCodes.add(122);
        badCodes.add(123);
        badCodes.add(27);
        badCodes.add(112);
        badCodes.add(113);
        badCodes.add(114);
        badCodes.add(115);
        badCodes.add(116);
        badCodes.add(117);
        badCodes.add(119);
        badCodes.add(120);
        badCodes.add(121);
        badCodes.add(122);
        badCodes.add(123);
        badCodes.add(155);
        badCodes.add(35);
        badCodes.add(33);
        badCodes.add(34);
        badCodes.add(144);
        badCodes.add(38);
        badCodes.add(40);
        badCodes.add(37);
        badCodes.add(39);
        badCodes.add(20);
        badCodes.add(18);
        badCodes.add(16);
        badCodes.add(17);
        badCodes.add(524);
        
    }

    private void setUndoManager() {
        undoManager = new UndoManager();
        jTextPane1.getDocument().addUndoableEditListener(undoManager);
    }
    
    public void compile(){
        clearAll();
        lexicalAnalysis();
        fillTableTokens();
        syntacticAnalysis();
        semanticAnalysis();
        printConsole();
        codeHasBeenCompiled = true;
    }
    
    private void lexicalAnalysis(){
        Lexer lex;
        
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jTextPane1.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF-8"));
            lex = new Lexer(entrada);
            while(true){
                Token token = lex.yylex();
                if(token == null) break;
                tokens.add(token);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PanelTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void fillTableTokens() {
        tokens.forEach(token->{
            Object[] data = new Object[]{token.getLexicalComp(),token.getLexeme(),"["+token.getLine()+", "+token.getColumn()+"]"};
//            Object[] simb = null;
//            if(token.getLexicalComp().toString().equals("IDENTIFICADOR")){
//                simb = new Object[]{System.identityHashCode(token.getLexicalComp()),token.getLexeme(),"valor indefinido","["+token.getLine()+", "+token.getColumn()+"]"};
//            }
//            System.out.println("HOla: " + simb.toString());
            Functions.addRowDataInTable(mclass.getTblLexica(), data);
        });
    }

    private void syntacticAnalysis() {
        Grammar gramatica = new Grammar(tokens, errors);

        // Eliminar errores léxicos
        gramatica.delete(new String[]{"ERROR"}, 1, "Error Lexico {}: simbolo no perteneciente al lenguaje en la linea [#, %]");
        gramatica.delete(new String[]{"ERROR_2"}, 2, "Error Lexico {}: identificador mal definido en la linea [#, %]");
        gramatica.delete(new String[]{"ERROR_1"}, 3, "Error Lexico {}: numero mal definido en la linea [#, %]");
        
        // Operador Unario
        gramatica.group("OperadorUnario", "(INCREMENTO|DECREMENTO)");
        // Agrupar valores
        gramatica.group("Valor", "(NUMERO_REAL|CADENA_TEXTO|VALOR_AUTOMATICO|VALOR_BOOLEANO|DESACTIVAR|ACTIVAR)");
        //gramatica.group("Valor_ASP", "");

        // -----------------------------------------------------------------------------------------------
        // Valor de arrglo
        //gramatica.group("Valor_ARRE", "");
        // Estructura de datos tipo arreglo
        gramatica.group("Arreglo", "(CORCHETE_A (NUMERO_ENTERO|IDENTIFICADOR) (COMA (NUMERO_ENTERO|IDENTIFICADOR))* CORCHETE_C)", true);
        
        
        // Eliminacion de arreglos incompletos  
        gramatica.group("Arreglo", "CORCHETE_A (((NUMERO_ENTERO|IDENTIFICADOR) COMA)* (Valor) (COMA (Valor|(NUMERO_ENTERO|IDENTIFICADOR)))* (COMA (NUMERO_ENTERO|IDENTIFICADOR))*)+ CORCHETE_C", true, 1, "Error sintáctico [{}] en la línea #: Sólo pueden existir valores de tipo entero dentro de un arreglo");
        gramatica.group("Arreglo", "CORCHETE_A ((COMA)|(((NUMERO_ENTERO|IDENTIFICADOR) (COMA)+) | ((COMA)+ (NUMERO_ENTERO|IDENTIFICADOR)) | (((NUMERO_ENTERO|IDENTIFICADOR) COMA) (COMA)+ (NUMERO_ENTERO|IDENTIFICADOR)))+)+ CORCHETE_C", true, 1, "Error sintáctico [{}] en la línea #: valor indefinido despues de la una coma");
        gramatica.group("Arreglo", "CORCHETE_A  (NUMERO_ENTERO|IDENTIFICADOR) (COMA (NUMERO_ENTERO|IDENTIFICADOR))*", true, 2, "Error sintáctico [{}] en la línea #: No hay corchete de cierre en el arreglo");
        gramatica.group("Arreglo", "(NUMERO_ENTERO|IDENTIFICADOR) (COMA ((NUMERO_ENTERO|IDENTIFICADOR)))* CORCHETE_C", true, 3, "Error sintáctico [{}] en la línea #: No hay corchete de apertura en el arreglo");
        gramatica.group("Arreglo", "CORCHETE_A CORCHETE_C", true, 4, "Error sintáctico [{}] en la línea #: No es posible declarar un arreglo vacío");

        // Eliminación de corchetes
        gramatica.delete(new String[]{"CORCHETE_A", "CORCHETE_C"}, 5, "Error sintáctico [{}] en la línea #: El corchete [] debe seguir de un arreglo");
        //FUNCIONA^^
        // -----------------------------------------------------------------------------------------------
        // Agrupar valores
        gramatica.group("Valor", "(NUMERO_ENTERO)");
        
        // Operadores aritmeticos
        //gramatica.group("OpAritmetico", "OP_ARITMETICO");
        
        // Operadores aritmeticos
        //gramatica.group("TipoDato", "TIPO_DATO");
        
        // Operadores comparacion
        //gramatica.group("OperadorComparacion", "OP_RELACIONAL");
        
        // -----------------------------------------------------------------------------------------------
        // Expresion
        
        // Agrupación de operaciones aritméticas
        gramatica.group("Valor", "PARENTESIS_A (Valor|IDENTIFICADOR) PARENTESIS_C",true);
        gramatica.group("OperacionAritmetica", "((Valor|IDENTIFICADOR) (OP_ARITMETICO (Valor|IDENTIFICADOR))+) | PARENTESIS_A ((Valor|IDENTIFICADOR) (OP_ARITMETICO (Valor|IDENTIFICADOR))+) PARENTESIS_C");
        gramatica.group("OperacionAritmetica", "(OperacionAritmetica (OP_ARITMETICO (OperacionAritmetica|Valor))+)");
        
        
        // Eliminación de operaciones aritméticas con arreglos
        gramatica.group("OperacionAritmetica", "(((Valor|OperacionAritmetica)OpAritmetico)+ Arreglo(OpAritmetico(Valor|OperacionAritmetica))*|((Valor|OperacionAritmetica)OpAritmetico)* Arreglo(OpAritmetico(Valor|OperacionAritmetica))+)", true, 6, "Error sintáctico [{}] en la línea #: No se permite realizar operaciones con areglos");
        
        // Agrupar valores
        gramatica.group("Valor", "OperacionAritmetica");
        
        //cEliminacion de operador aritmetico
        gramatica.delete("OP_ARITMETICO",10,"Error sintáctico [{}] en la línea #, columna %: \nOperador aritmetico en posición erronea");

       
        // Inicializaciones de variables
        gramatica.group("Inicializar", "TIPO_DATO IDENTIFICADOR OP_ASIG Valor", true, InicializacionProducciones);
        
        // Inicializaciones incompletas
        gramatica.group("Inicializar", "TIPO_DATO OP_ASIG Valor", true, 11, "Error sintáctico [{}] en la línea #: Falta identificador en la asignación");
        gramatica.group("Inicializar", "TIPO_DATO IDENTIFICADOR OP_ASIG ", true, 13, "Error sintáctico [{}] en la línea #: Falta el valor de declaración o es erroneo");
        gramatica.group("Inicializar", "TIPO_DATO IDENTIFICADOR Valor", true, 14, "Error sintáctico [{}] en la línea #: Falta el operador de asignacion '='");
        //gramatica.group("Inicializar", "TIPO_DATO IDENTIFICADOR Err_OperadorIgual Valor", true, 15, "Error sintáctico [{}] en la línea #: El operador '=' es incorrecto, para inicializar utiliza '->'");

        // Asignaciones a variables
        gramatica.group("Asignar", "IDENTIFICADOR OP_ASIG (Valor|Arreglo|IDENTIFICADOR)", true, AsignacionProducciones);
        
        // Asignaciones incompletas
        gramatica.group("Asignar", "IDENTIFICADOR OP_ASIG", true, 16, "Error sintáctico [{}] en la línea #: Faltó asignar un valor");
        gramatica.group("Asignar", "IDENTIFICADOR (Valor|Arreglo|IDENTIFICADOR)", true, 17, "Error sintáctico [{}] en la línea #: Falta el operador de asignacion '='");

        // Eliminación de declaraciones de variables incompletas
        gramatica.delete("TIPO_DATO", 20, "Error sintáctico [{}] en la línea #: No se declaro correctamente");
        
        gramatica.group("Valor", "(Valor | IDENTIFICADOR)");
        
        // -----------------------------------------------------------------------------------------------
        // Agrupación de estructuras de control condicional
        gramatica.group("EstructuraCondicional", "ESTRUCTURA_SI");
        
        gramatica.group("Valor_Condicion", "Valor OP_RELACIONAL Valor");
        gramatica.group("Valor_Condicion", "Valor OP_ASIG Valor", 51, "Error confundio '=' con '=='");
        gramatica.group("Valor_Condicion", "PARENTESIS_A Valor_Condicion PARENTESIS_C");
        gramatica.group("Valor_Condicion", "PARENTESIS_A OP_ASIG PARENTESIS_C", 51, "Error confundio '=' con '=='");
        
        gramatica.group("Condicion", "Valor_Condicion (OP_LOGICO Valor_Condicion)*");
        
        gramatica.group("EstructuraCondicionalCompleta", "EstructuraCondicional PARENTESIS_A Condicion PARENTESIS_C");
        
        //gramatica.delete("OP_ASIG", 19, "Error sintáctico [{}] en la línea #: No se esperaba encontrar '=' o No se declaro correctamente");

        
        gramatica.show();
    }
    
        
//        //Agrupacion de operaciones aritmeticas
//        gramatica.group("OpAritmetica", "VALOR OpAritmetico VALOR", true);
//
//        //Concatenacion de variables
//        gramatica.group("Concat", "IDENTIFICADOR OP_ASIG OpAritmetica", true);
//
//        //Declaracion de variables
//        gramatica.group("Variable", "TIPO_DATO IDENTIFICADOR OP_ASIG Valor", true);
//
//        //Gramaticas de errores
//        gramatica.group("Variable", "TIPO_DATO OP_ASIG (Valor | IDENTIFICADOR)", true, 4, "Error sintáctico {}: No hay identificador  en la declaración [#, %]");
//        gramatica.group("Variable", "TIPO_DATO OP_ASIG ", true, 5, "Error sintáctico {}: Sentencia de decalración incompleta, falta identificador y valor [#, %]");
//        gramatica.group("Variable", "TIPO_DATO", true, 6, "Error sintáctico {}: en [#, %]  Sentencia de decalración incompleta, sintaxis correcta deberia ser: Tipo_dato id = valor ");
//        gramatica.finalLineColumn();
//        gramatica.group("Variable", "TIPO_DATO IDENTIFICADOR OP_ASIG", true, 3, "Error sintáctico {}: No hay valor en la declaración [#, %]");
//        gramatica.group("Variable", "TIPO_DATO IDENTIFICADOR", true, 5, "Error sintáctico {}: Sentencia de decalración incompleta, falta \"=\" y valor [#, %]");
//        gramatica.group("Variable", "OP_ASIG", true, 6, "Error sintáctico {}: en [#, %]  No se esperaba encontrar el simbolo \"=\" ");
//        gramatica.group("Variable", "TIPO_DATO IDENTIFICADOR (Valor | IDENTIFICADOR) ", true, 7, "Error sintáctico {}: No hay operador de asignación en la declaración [#, %]");
//        gramatica.group("Variable", " IDENTIFICADOR OP_ASIG (Valor | IDENTIFICADOR) ", true, 8, "Error sintáctico {}: No hay tipo de dato de asignación en la declaración [#, %]");
//        gramatica.initialLineColumn();
//        
//        /* EXPRECION RELACIONAL */
//        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
//            gramatica.group("EXP_RELACIONAL", "Valor OP_RELACIONAL");
//        });
//        
//        /* EXPRECION LOGICA */
//        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
//            gramatica.group("EXP_LOGICA", "(Valor) (OP)");
//        });
//        
//        /* AGRUPACIÓN DE ESTRUCTURAS DE CONTROL */
//        gramatica.group("EST_CONTROL", "(ESTRUCTURA_SI)");

        /* Mostrar gramáticas */
        // gramatica.show();
    

    private void semanticAnalysis() {
        
    }
    
    private void printConsole(){
        int sizeErrors = errors.size();
        if(sizeErrors>0){
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for(ErrorLSSL error: errors){
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            mclass.writeConsole("Compilacion con errores... \n"+strErrors);
        }else{
            mclass.writeConsole("Compilacion terminada sin errores");
        }
        
    }

    private void clearAll() {
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        codeHasBeenCompiled = false;
    }
}
