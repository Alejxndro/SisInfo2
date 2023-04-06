/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IU;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class BuscadorSinonimos extends JFrame implements ActionListener {

    private final JTextField palabraTF;
    private final JTextArea resultadosTA;

    public BuscadorSinonimos() {
        // Configurar la ventana
        setTitle("Buscador de sinónimos en español");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Configurar los componentes
        palabraTF = new JTextField();
        JButton buscarBtn = new JButton("Buscar");
        buscarBtn.addActionListener((ActionListener) this);
        resultadosTA = new JTextArea();

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(palabraTF, BorderLayout.NORTH);
        panel.add(buscarBtn, BorderLayout.CENTER);
        panel.add(new JScrollPane(resultadosTA), BorderLayout.SOUTH);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Buscar")) {
            // Obtener la palabra ingresada por el usuario
            String palabra = palabraTF.getText().trim();

            // Enviar la solicitud a la API de Datamuse
            try {
                URL url = new URL("https://api.datamuse.com/words?rel_syn=" + palabra + "&lang=es");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                // Analizar la respuesta de la API
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                reader.close();
                conn.disconnect();

                // Mostrar los sinónimos en el JTextArea
                resultadosTA.setText("");
                String json = sb.toString();
                if (json.contains("{\"word\"")) {
                    String[] palabras = json.split("\\{");
                    for (String palabraJson : palabras) {
                        if (palabraJson.contains("\"word\"")) {
                            int start = palabraJson.indexOf("\"word\":\"") + 8;
                            int end = palabraJson.indexOf("\",");
                            String sinonimo = palabraJson.substring(start, end);
                            resultadosTA.append(sinonimo + "\n");
                        }
                    }
                } else {
                    resultadosTA.setText("No se encontraron sinónimos para esa palabra.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BuscadorSinonimos buscador = new BuscadorSinonimos();
        buscador.setVisible(true);
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
            java.util.logging.Logger.getLogger(BuscadorSinonimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscadorSinonimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscadorSinonimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscadorSinonimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscadorSinonimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
