/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lombardim
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    File ARCHIVOA;
    
    public Formulario() {
        ARCHIVOA = null;
        initComponents();
    }
    int n = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUSCADORDEARCHIVO = new javax.swing.JFileChooser();
        AGREGARCOMP = new javax.swing.JFrame();
        CODIGOA = new javax.swing.JLabel();
        NOMBREA = new javax.swing.JLabel();
        PROMEDIOA = new javax.swing.JLabel();
        CODIGOT = new javax.swing.JTextField();
        NOMBRET = new javax.swing.JTextField();
        PROMEDIOT = new javax.swing.JTextField();
        AGREGARN = new javax.swing.JButton();
        CANCELAR2 = new javax.swing.JButton();
        BARRAA = new javax.swing.JMenuBar();
        SC2 = new javax.swing.JMenu();
        AGREGARCT = new javax.swing.JMenuItem();
        CANCELARA = new javax.swing.JMenuItem();
        NOMBRE = new javax.swing.JLabel();
        RUTAARCHIVO = new javax.swing.JTextField();
        BABRIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        NARCHIVO = new javax.swing.JTextField();
        RUTA = new javax.swing.JLabel();
        AGREGAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        ORDENARC = new javax.swing.JComboBox<>();
        ORDENARB = new javax.swing.JButton();
        ABRIRARC = new javax.swing.JMenuBar();

        AGREGARCOMP.setMinimumSize(new java.awt.Dimension(340, 310));
        AGREGARCOMP.setSize(new java.awt.Dimension(340, 310));

        CODIGOA.setText("CODIGO: ");

        NOMBREA.setText("NOMBRE: ");

        PROMEDIOA.setText("PROMEDIO: ");

        AGREGARN.setText("AGREGAR");
        AGREGARN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARNActionPerformed(evt);
            }
        });

        CANCELAR2.setText("CANCELAR");
        CANCELAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR2ActionPerformed(evt);
            }
        });

        SC2.setText("SHORTCUT");

        AGREGARCT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        AGREGARCT.setText("AGREGAR NUEVO");
        AGREGARCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARCTActionPerformed(evt);
            }
        });
        SC2.add(AGREGARCT);

        CANCELARA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        CANCELARA.setText("CANCELAR");
        CANCELARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARAActionPerformed(evt);
            }
        });
        SC2.add(CANCELARA);

        BARRAA.add(SC2);

        AGREGARCOMP.setJMenuBar(BARRAA);

        javax.swing.GroupLayout AGREGARCOMPLayout = new javax.swing.GroupLayout(AGREGARCOMP.getContentPane());
        AGREGARCOMP.getContentPane().setLayout(AGREGARCOMPLayout);
        AGREGARCOMPLayout.setHorizontalGroup(
            AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AGREGARCOMPLayout.createSequentialGroup()
                .addGroup(AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AGREGARCOMPLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CODIGOT)
                            .addComponent(NOMBRET)
                            .addComponent(PROMEDIOT)
                            .addGroup(AGREGARCOMPLayout.createSequentialGroup()
                                .addGroup(AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOMBREA)
                                    .addComponent(CODIGOA)
                                    .addComponent(PROMEDIOA))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(AGREGARCOMPLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(CANCELAR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(AGREGARN)
                        .addGap(13, 13, 13)))
                .addGap(26, 26, 26))
        );
        AGREGARCOMPLayout.setVerticalGroup(
            AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AGREGARCOMPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CODIGOA)
                .addGap(5, 5, 5)
                .addComponent(CODIGOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOMBREA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOMBRET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PROMEDIOA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROMEDIOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AGREGARCOMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGREGARN)
                    .addComponent(CANCELAR2))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NOMBRE.setText("NOMBRE ARCHIVO: ");

        RUTAARCHIVO.setEnabled(false);
        RUTAARCHIVO.setFocusable(false);
        RUTAARCHIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUTAARCHIVOActionPerformed(evt);
            }
        });

        BABRIR.setText("ABRIR");
        BABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BABRIRActionPerformed(evt);
            }
        });

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PROMEDIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABLA);

        NARCHIVO.setEnabled(false);
        NARCHIVO.setFocusable(false);
        NARCHIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NARCHIVOActionPerformed(evt);
            }
        });

        RUTA.setText("RUTA ARCHIVO: ");

        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        ORDENARC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "PROMEDIO" }));
        ORDENARC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARCActionPerformed(evt);
            }
        });

        ORDENARB.setText("ORDENAR");
        ORDENARB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARBActionPerformed(evt);
            }
        });
        setJMenuBar(ABRIRARC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NOMBRE)
                            .addComponent(RUTA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NARCHIVO, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RUTAARCHIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BABRIR))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ORDENARB)
                            .addComponent(ORDENARC, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AGREGAR)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE)
                    .addComponent(RUTAARCHIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BABRIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NARCHIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RUTA))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AGREGAR)
                            .addComponent(ELIMINAR))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ORDENARC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ORDENARB)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RUTAARCHIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUTAARCHIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RUTAARCHIVOActionPerformed

    private void BABRIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BABRIRActionPerformed
        
        FileNameExtensionFilter FILTRO = new FileNameExtensionFilter("Archivo.TXT", "txt", "csv", "texto");
        BUSCADORDEARCHIVO.setFileFilter(FILTRO);
        
        int OPCION = BUSCADORDEARCHIVO.showOpenDialog(this);
        
        if(OPCION == JFileChooser.APPROVE_OPTION){
            ARCHIVOA = BUSCADORDEARCHIVO.getSelectedFile();
            
            try {
                
                Scanner scan = new Scanner(ARCHIVOA);
                String NAME = ARCHIVOA.getName();
                NARCHIVO.setText(ARCHIVOA.getPath());
                RUTAARCHIVO.setText(NAME);
                DefaultTableModel MODEL = (DefaultTableModel)TABLA.getModel();
                
                while(scan.hasNext()){
                    
                    String LINEA = scan.nextLine();
                    
                    String[] VLINEAS = LINEA.split(",");
                    
                    long CODIGO = Long.parseLong(VLINEAS[0]);
                    String Nombre = VLINEAS[1];
                    double PROMEDIO = Double.parseDouble(VLINEAS[2]);
                    
                    MODEL.addRow(new Object[]{CODIGO, Nombre, PROMEDIO});
                    n++;
                    
                }
                
                scan.close();
            } catch (FileNotFoundException ex) {
                
            }
            
        }else{
            if(OPCION == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "NINGUN ARCHIVO SELECCIONADO", "ERROR", ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_BABRIRActionPerformed

    private void NARCHIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NARCHIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NARCHIVOActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        
        AGREGARCOMP.setVisible(true);
        PROMEDIOT.setText("");
        NOMBRET.setText("");
        CODIGOT.setText("");
        
    }//GEN-LAST:event_AGREGARActionPerformed

    private void AGREGARNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARNActionPerformed
        
        DefaultTableModel MODEL = (DefaultTableModel)TABLA.getModel();
        
        try{
            long codigo = Long.parseLong(CODIGOT.getText());
            String nombre = NOMBRET.getText();
            double promedio = Double.parseDouble(PROMEDIOT.getText());
            MODEL.addRow(new Object[]{codigo, nombre, promedio});
            GUARDAR();
            n++;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL AGREGAR LOS DATOS./nIntente nuevamente.", "ERROR", ERROR_MESSAGE);
        }
        
        AGREGARCOMP.setVisible(false);
        
    }//GEN-LAST:event_AGREGARNActionPerformed

    private void CANCELAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR2ActionPerformed
        AGREGARCOMP.setVisible(false);
    }//GEN-LAST:event_CANCELAR2ActionPerformed

    private void AGREGARCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARCTActionPerformed
        AGREGARNActionPerformed(evt);
    }//GEN-LAST:event_AGREGARCTActionPerformed

    private void CANCELARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARAActionPerformed
        CANCELAR2ActionPerformed(evt);
    }//GEN-LAST:event_CANCELARAActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        
        DefaultTableModel table = (DefaultTableModel)TABLA.getModel();
        int indiceTabla = TABLA.getSelectedRow();
        if (indiceTabla != -1) {
            table.removeRow(indiceTabla);
        }
        GUARDAR();
        
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void ORDENARCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORDENARCActionPerformed

    private void ORDENARBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARBActionPerformed

        int TIPO = ORDENARC.getSelectedIndex(), conor = 0;
        double[] ORDP = new double[n];
        long[] ORDC = new long[n];
        String[] ORDN = new String[n];
            
        try {
            Scanner scan = new Scanner(ARCHIVOA);

            while(scan.hasNext()){

                String LINEA = scan.nextLine();
                String[] VLINEAS = LINEA.split(",");
                ORDC[conor] = Long.parseLong(VLINEAS[0]);           
                ORDN[conor] = VLINEAS[1];
                ORDP[conor] = Double.parseDouble(VLINEAS[2]);

                conor++;

            }

            scan.close();
        } catch (FileNotFoundException ex) {

        }
        if(TIPO == 0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i != j){
                        if(ORDC[i] < ORDC[j]){
                            long templ = ORDC[i];
                            ORDC[i] = ORDC[j];
                            ORDC[j] = templ;
                            String temps = ORDN[i];
                            ORDN[i] = ORDN[j];
                            ORDN[j] = temps;
                            double tempp = ORDP[i];
                            ORDP[i] = ORDP[j];
                            ORDP[j] = tempp;
                        }
                    }
                }
            }

        }else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i != j){
                        if(ORDP[i] < ORDP[j]){
                            long templ = ORDC[i];
                            ORDC[i] = ORDC[j];
                            ORDC[j] = templ;
                            String temps = ORDN[i];
                            ORDN[i] = ORDN[j];
                            ORDN[j] = temps;
                            double tempp = ORDP[i];
                            ORDP[i] = ORDP[j];
                            ORDP[j] = tempp;
                        }
                    }
                }
            }
        }
        try {
            DefaultTableModel MODEL = (DefaultTableModel)TABLA.getModel();
            for (int i = 0; i < n; i++) {

                long CODIGO = ORDC[i];
                String Nombre = ORDN[i];
                double PROMEDIO = ORDP[i];
                MODEL.setValueAt(CODIGO, i, 0);
                MODEL.setValueAt(Nombre, i, 1);
                MODEL.setValueAt(PROMEDIO, i, 2);

            }

        }catch(Exception e){

        }
        GUARDAR();
    }//GEN-LAST:event_ORDENARBActionPerformed

    public void GUARDAR(){
        
        if(ARCHIVOA != null){
            try{
                BufferedWriter BW = new BufferedWriter(new FileWriter(ARCHIVOA));
                
                DefaultTableModel MODEL = (DefaultTableModel)TABLA.getModel();
                
                int NFilas = MODEL.getRowCount();
                
                for (int i = 0; i < NFilas; i++) {
                    String LINE = MODEL.getValueAt(i, 0) + "," + MODEL.getValueAt(i, 1) + "," + MODEL.getValueAt(i, 2);
                    BW.write(LINE);
                    BW.newLine();
                }
                BW.close();
            } catch(Exception e){
            
            }
        }
        
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar ABRIRARC;
    private javax.swing.JButton AGREGAR;
    private javax.swing.JFrame AGREGARCOMP;
    private javax.swing.JMenuItem AGREGARCT;
    private javax.swing.JButton AGREGARN;
    private javax.swing.JButton BABRIR;
    private javax.swing.JMenuBar BARRAA;
    private javax.swing.JFileChooser BUSCADORDEARCHIVO;
    private javax.swing.JButton CANCELAR2;
    private javax.swing.JMenuItem CANCELARA;
    private javax.swing.JLabel CODIGOA;
    private javax.swing.JTextField CODIGOT;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField NARCHIVO;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel NOMBREA;
    private javax.swing.JTextField NOMBRET;
    private javax.swing.JButton ORDENARB;
    private javax.swing.JComboBox<String> ORDENARC;
    private javax.swing.JLabel PROMEDIOA;
    private javax.swing.JTextField PROMEDIOT;
    private javax.swing.JLabel RUTA;
    private javax.swing.JTextField RUTAARCHIVO;
    private javax.swing.JMenu SC2;
    private javax.swing.JTable TABLA;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
