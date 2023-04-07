/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IU;

import dba.MySQL;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class Begin extends javax.swing.JFrame {

    private String user;
    private int palabras;
    private boolean correcto;
    
    JFileChooser seleccionar = new JFileChooser();
        File historia;
        FileInputStream entrada;
        FileOutputStream salida;
    
    public Begin() {
        initComponents();
        
    }

    public static MySQL conexion = new MySQL();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JToggleButton();
        guardar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lista = new javax.swing.JButton();
        yo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requiero = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        talque = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ca = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        docs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Yo como");

        lista.setText("Lista de User Stories");
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        yo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoActionPerformed(evt);
            }
        });

        jLabel2.setText("requiero");

        requiero.setColumns(20);
        requiero.setRows(5);
        jScrollPane2.setViewportView(requiero);

        jLabel3.setText("tal que");

        talque.setColumns(20);
        talque.setRows(5);
        jScrollPane3.setViewportView(talque);

        jLabel4.setText("Condiciones de Utilizacion");

        ca.setColumns(20);
        ca.setRows(5);
        jScrollPane4.setViewportView(ca);

        docs.setColumns(20);
        docs.setRows(5);
        jScrollPane5.setViewportView(docs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addGap(87, 87, 87)
                        .addComponent(mostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lista)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(lista))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(mostrar))
                .addGap(0, 97, Short.MAX_VALUE))
        );

        yo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
     if(yo.getText().isEmpty() || requiero.getText().isEmpty() || talque.getText().isEmpty() || ca.getText().isEmpty()){
     
         JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS");
     }else{
                String x = "Yo Como " + yo.getText() + '\n';
                String y = "Requiero " + requiero.getText() + '\n';
                String z = "tal que  " + talque.getText() + '\n';
                 String m = "Condiciones de aceptación: " + '\n' + ca.getText();
    docs.setText(x+ '\n'+ y +'\n' + z + '\n' + m);
     }
        

//boolean result = metodos.buscarUsuario(txtUser.getText(), txtPassword.getText());
    //if(result == true){
        /*Connection conexion = TBD.getConnection();
        String consulta = "SELECT pg_backend_pid();";
        Statement st;
        ResultSet rs;
        try {
                st = conexion.createStatement();
                rs = st.executeQuery(consulta);
                rs.next();
                //txtPID.setText(""+rs.getInt("pg_backend_pid"));
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }else{
        JOptionPane.showMessageDialog(this, "No esta registrado");
    }*/
    }//GEN-LAST:event_mostrarActionPerformed
   
       
        public String abrirArchivo(File archivo){
            String doc= "";
        
        try{
        entrada = new FileInputStream(historia);
        int ascci;
        while( (ascci = entrada.read()) != -1){
            char caracter = (char) ascci;
            doc+=caracter;
        }
        
    } catch(Exception e){
    
    }
        return doc;
        
        } 
    
    public String guardarArchivo(File archivo,String documento ){
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo guardado ahora puedes compartirlo en la red social de tu preferencia";
        } catch(Exception e){
        }
        return mensaje;
    }
        
        
        
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        if(yo.getText().isEmpty() || requiero.getText().isEmpty() || talque.getText().isEmpty() || ca.getText().isEmpty()){
     
         JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS");
     }else{
             if(seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
            historia=seleccionar.getSelectedFile();
            if(historia.getName().endsWith("txt")){
                String doc = docs.getText();
                String cont = guardarArchivo(historia, doc);
                if(cont != null){
                    JOptionPane.showMessageDialog(null, cont);
                }else{
                    JOptionPane.showMessageDialog(null, "archivo no compatible");
                }
            
                
                docs.setText(doc);
            }else{
                JOptionPane.showMessageDialog(null, "Guardar Documento de texto");
            }
        }
        
        }
            
    }//GEN-LAST:event_guardarActionPerformed
    
    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here://lista
        Lista newframe= new Lista();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaActionPerformed

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
            java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Begin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ca;
    private javax.swing.JTextArea docs;
    private javax.swing.JToggleButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton lista;
    private javax.swing.JToggleButton mostrar;
    private javax.swing.JTextArea requiero;
    private javax.swing.JTextArea talque;
    private javax.swing.JTextField yo;
    // End of variables declaration//GEN-END:variables
}
