package vista;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jairi
 */
public class FontChooser extends javax.swing.JFrame {

    DefaultListModel modeloListaNames;
    
    private String fontNombre;
    private int fontSyle;
    private int fontInt;
    
    private Font currentFont;
    
    private static Main mClass;
    /**
     * Creates new form FontChooser
     */
    public FontChooser(Main clase) {
        initComponents();
        mClass = clase;
        
        currentFont = mClass.getFont();
        txttest.setFont(currentFont);
        
        fontNombre = currentFont.getName();
        fontSyle = currentFont.getStyle();
        fontInt = currentFont.getSize();
        
        txtName.setText(fontNombre);
        txtStyle.setText(getStyleName());
        txtSize.setText(String.valueOf(fontInt));
        
        
        modeloListaNames = new DefaultListModel();
        
        getFonts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtStyle = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNombres = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEstilos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTam = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txttest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selector de fuente");
        setResizable(false);

        jLabel1.setText("Nombre de Fuente");

        jLabel2.setText("Estilo de fuente");

        jLabel3.setText("Tamaño de funete");

        jLabel4.setText("Previsualizacion:");

        txtName.setText("consolas");
        txtName.setEnabled(false);

        txtStyle.setText("Plain");
        txtStyle.setEnabled(false);

        txtSize.setText("14");
        txtSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSizeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSizeKeyTyped(evt);
            }
        });

        listNombres.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listNombres.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listNombresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listNombres);

        listEstilos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Plain", "Bold", "Italic", "Bold Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEstilos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listEstilos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEstilosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listEstilos);

        listTam.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "3", "5", "8", "10", "12", "14", "18", "24", "36", "48" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTam.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listTam.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTamValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listTam);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txttest.setText("Hello world ! 012345. (text);  ");
        jScrollPane4.setViewportView(txttest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStyle, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSize)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        updateFont();
        JOptionPane.showMessageDialog(null, "Fuente cambiada exitosamente!");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void listNombresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listNombresValueChanged
        String nombre = listNombres.getSelectedValue().toString();
        txtName.setText(nombre);
        fontNombre = nombre;
        updatePreviewFont();
    }//GEN-LAST:event_listNombresValueChanged

    private void listEstilosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEstilosValueChanged
        int style = listEstilos.getSelectedIndex();
        fontSyle = style;
        txtStyle.setText(getStyleName());
        updatePreviewFont();
    }//GEN-LAST:event_listEstilosValueChanged

    private void listTamValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTamValueChanged
        int size = Integer.parseInt(listTam.getSelectedValue());
        txtSize.setText(String.valueOf(size));
        fontInt = Integer.parseInt(txtSize.getText());
        updatePreviewFont();
    }//GEN-LAST:event_listTamValueChanged

    private void txtSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSizeKeyTyped
        
    }//GEN-LAST:event_txtSizeKeyTyped

    private void txtSizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSizeKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER){
            fontInt = Integer.parseInt(txtSize.getText());
            updatePreviewFont();
        }
    }//GEN-LAST:event_txtSizeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontChooser(mClass).setVisible(true);
            }
        });
    }
    
    private void getFonts(){
        String fuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println("Fuentes: ");
        for (String fuente : fuentes) {
            modeloListaNames.addElement(fuente);
        }
        
        listNombres.setModel(modeloListaNames);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listEstilos;
    private javax.swing.JList<String> listNombres;
    private javax.swing.JList<String> listTam;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtStyle;
    private javax.swing.JLabel txttest;
    // End of variables declaration//GEN-END:variables

    private void updatePreviewFont() {
        currentFont = new Font(fontNombre, fontSyle, fontInt);
        txttest.setFont(currentFont);
    }
    
    private void updateFont() {
        mClass.changeFont(currentFont);
    }

    private String getStyleName() {
        switch (fontSyle) {
            case 0:
                return "Plain";
            case 1:
                return "Bold";
            case 2:
                return "Italic";
            case 3:
                return "Bold-Italic";
            default:
                return "";
        }
    }
}
