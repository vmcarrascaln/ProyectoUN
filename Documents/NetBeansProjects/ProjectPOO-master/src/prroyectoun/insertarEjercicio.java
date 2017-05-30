package prroyectoun;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class insertarEjercicio extends javax.swing.JFrame {

    
    //Pone NetBeans
    public insertarEjercicio() {
        initComponents();
    }
    //Pone NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUrl = new javax.swing.JTextField();
        btnAbrirEjercicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        txtTema = new javax.swing.JTextField();
        txtSolucion = new javax.swing.JTextField();
        btnAbrirSolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtUrl.setEnabled(false);

        btnAbrirEjercicio.setText("Abrir ejercicio");
        btnAbrirEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirEjercicioActionPerformed(evt);
            }
        });

        jLabel1.setText("Tema:");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        txtTema.setEnabled(false);

        txtSolucion.setEnabled(false);

        btnAbrirSolucion.setText("Abrir solucion");
        btnAbrirSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirSolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSolucion)
                            .addComponent(txtUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAbrirEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(btnAbrirSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirEjercicio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirSolucion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para el evento cuando oprime el boton abrir ejercicio
    String ruta = null;
    private void btnAbrirEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirEjercicioActionPerformed
        JFileChooser j = new JFileChooser();
        
        int ap = j.showOpenDialog(this);
        //Si le da abrir, si selecciona
        if(ap == JFileChooser.APPROVE_OPTION){
            //Guarda la ruta de la imagen
            ruta = j.getSelectedFile().getAbsolutePath();
            //Pone valor de la ruta en el campo txtUrl
            txtUrl.setText(ruta);
        }
    }//GEN-LAST:event_btnAbrirEjercicioActionPerformed

    //Metodo para el evento cuando oprime el boton insertar
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        //Creo objeto de la clase Conexion_BD
        Conexion_BD conexion = new Conexion_BD();
        //Guardo los valores de las rutas de las imagenes en variables
        String url = txtUrl.getText();
        String urlSolucion = txtSolucion.getText();
        //Creo objeto de la clase ejercicio
        Ejercicio obj = new Ejercicio();
        //Valido que no esten en blanco la url Ejercicio
        if(url.trim().length() != 0 && urlSolucion.trim().length() !=0){
            //Ejecuto el metodo guardar_imagen de la clase Conexion_BD
            //Le paso las urls de las imagenes
            //Le paso el valor del nombre del tema
            conexion.guardar_imagen(url,urlSolucion,(String)txtTema.getText());
        }else{
            JOptionPane.showMessageDialog(null,"Por favor cargar las dos imagenes.");
        }
        //Oculteme este formulario (insertarEjercicio)
        this.setVisible(false);
        //Creamos objeto de la clase opcionesAdmin
        opcionesAdmin vent = new opcionesAdmin();
        //Mosramos formulario
        vent.show();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    
    //Metodo para el evento cuando oprime el boton abrir solucion
    private void btnAbrirSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirSolucionActionPerformed
        JFileChooser j = new JFileChooser();
        
        int ap = j.showOpenDialog(this);
        //Si le da abrir, si selecciona
        if(ap == JFileChooser.APPROVE_OPTION){
            //Guarda la ruta de la imagen
            ruta = j.getSelectedFile().getAbsolutePath();
            //Pone valor de la ruta en el campo txtSolucion
            txtSolucion.setText(ruta);
        }
    }//GEN-LAST:event_btnAbrirSolucionActionPerformed

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
            java.util.logging.Logger.getLogger(insertarEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertarEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertarEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertarEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertarEjercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirEjercicio;
    private javax.swing.JButton btnAbrirSolucion;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSolucion;
    public javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
