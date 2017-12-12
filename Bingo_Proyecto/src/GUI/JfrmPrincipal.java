/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BusinessLogic.Anfitrion;
import BusinessLogic.Carton;
import DataAccess.FileAdmin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BusinessLogic.Anfitrion;
import BusinessLogic.Jugador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Usuario1
 */
public class JfrmPrincipal extends javax.swing.JFrame {
    Calendar fecha = Calendar.getInstance();
        int anno = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        String fecha1 = Integer.toString(anno)+Integer.toString(mes)+Integer.toString(dia);
        String hora1 = Integer.toString(hora)+Integer.toString(minuto)+Integer.toString(segundo);
   // Direccion y nombre del archivo.
    public String archivoFuente = "CBD"+fecha1+hora1+".cbd";
    // Administrador de Archivos;
    FileAdmin fa=null;
    private DefaultTableModel model;//Modelo para tabla
    private DefaultListModel numLista;
    Anfitrion anf = new Anfitrion();
    Carton miCarton = new Carton();
   
    /**
     * Creates new form JfrmPrincipal
     */
    public JfrmPrincipal() {
        initComponents();
        numLista = new DefaultListModel();
        model = new DefaultTableModel();
        ///definir las columnas del modelo
        model.addColumn("B");
        model.addColumn("I");
        model.addColumn("N");
        model.addColumn("G");
        model.addColumn("O");
        jtblBingo.setModel(model);
        jbtnCantar.setEnabled(false);
        
    }
protected void cargarDatos(){
        try{
            // Se extraen los datos del carton.
            Integer[][] num=miCarton.getCarton(fa).getCarton1();
           
            for (int i = 0; i < 5; i++) { 
                 Object[] obj=new Object[5];
                for(int j = 0; j < 5; j++){
                  obj[j]=  num[i][j];
                }
                model.addRow(obj);
            }
             jtblBingo.setModel(model);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage(),"Error al cargar los datos del archivo",JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnfilaUno = new javax.swing.ButtonGroup();
        jPlnArribas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPnlArribaCentro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblBingo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPlnAbajo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstCantados = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jbtnSalir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPlnCentro = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jbtnCargar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jbtnGenerar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jbtnCantar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BINGO");
        setResizable(false);

        jPlnArribas.setLayout(new java.awt.BorderLayout());
        jPlnArribas.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPnlArribaCentro.setLayout(new java.awt.BorderLayout());

        jtblBingo.setBackground(new java.awt.Color(153, 153, 0));
        jtblBingo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtblBingo.setPreferredSize(new java.awt.Dimension(100, 80));
        jScrollPane2.setViewportView(jtblBingo);

        jPnlArribaCentro.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPlnArribas.add(jPnlArribaCentro, java.awt.BorderLayout.CENTER);
        jPlnArribas.add(jPanel3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPlnArribas, java.awt.BorderLayout.NORTH);

        jPlnAbajo.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jlstCantados);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPlnAbajo.add(jPanel2, java.awt.BorderLayout.CENTER);
        jPlnAbajo.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnSalir);

        jPlnAbajo.add(jPanel7, java.awt.BorderLayout.PAGE_END);
        jPlnAbajo.add(jPanel8, java.awt.BorderLayout.LINE_END);
        jPlnAbajo.add(jPanel9, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPlnAbajo, java.awt.BorderLayout.SOUTH);

        jPlnCentro.setLayout(new java.awt.BorderLayout());

        jbtnCargar.setText("Cargar Bingo");
        jbtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCargarActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnCargar);

        jPlnCentro.add(jPanel10, java.awt.BorderLayout.CENTER);

        jbtnGenerar.setText("Generar Bingo");
        jbtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnGenerar);

        jPlnCentro.add(jPanel11, java.awt.BorderLayout.WEST);

        jbtnCantar.setText("Cantar");
        jbtnCantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCantarActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnCantar);

        jPlnCentro.add(jPanel12, java.awt.BorderLayout.EAST);

        getContentPane().add(jPlnCentro, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarActionPerformed
        try {
            fa= new FileAdmin(archivoFuente);
            miCarton.insertar(fa, miCarton);
        } catch (Exception ex) {
            Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGenerarActionPerformed

    private void jbtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCargarActionPerformed
            JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Indique el archivo fuente");
                    int returnVal = chooser.showOpenDialog(this);
                    if(returnVal == JFileChooser.APPROVE_OPTION) {
                        archivoFuente=chooser.getSelectedFile().getName();
                        jbtnCantar.setEnabled(true);
                try {
                    fa=new FileAdmin(archivoFuente);
                    fa.extraerRegistros();
                    cargarDatos();
                } catch (Exception ex) {
                    Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
    }//GEN-LAST:event_jbtnCargarActionPerformed

    private void jbtnCantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCantarActionPerformed
//        jlstCantados
        try {
            Integer numGanador=anf.cantarNumero();
            JOptionPane.showMessageDialog(null,numGanador, "El número es",JOptionPane.INFORMATION_MESSAGE);
            numLista.addElement(numGanador);
            jlstCantados.setModel(numLista);
//            existe();
     for(int i = 0; i < model.getRowCount();i++){
        for(int j = 0;j < model.getColumnCount();j++){
            Object value =jtblBingo.getModel().getValueAt(i,j);
            TableCellRenderer renderer = jtblBingo.getCellRenderer(i, j);
            
//            num1= (Integer) model.getValueAt(i,j);
         if(value==numGanador){
             
             Component component = jtblBingo.prepareRenderer(renderer, 0, 0);
             component.setBackground(Color.yellow);
         }
       }
     }
        } catch (Exception ex) {
            Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCantarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(null, "¿En realidad desea dejar de jugar?", "Importante!", JOptionPane.OK_CANCEL_OPTION);
        if(respuesta == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPlnAbajo;
    private javax.swing.JPanel jPlnArribas;
    private javax.swing.JPanel jPlnCentro;
    private javax.swing.JPanel jPnlArribaCentro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCantar;
    private javax.swing.JButton jbtnCargar;
    private javax.swing.JButton jbtnGenerar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.ButtonGroup jbtnfilaUno;
    private javax.swing.JList<String> jlstCantados;
    private javax.swing.JTable jtblBingo;
    // End of variables declaration//GEN-END:variables
}
