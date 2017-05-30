/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prroyectoun;

import javax.swing.ImageIcon;

public class verEjercicio extends javax.swing.JFrame {

    //LO pone NetBeans
    public verEjercicio() {
        initComponents();
    }
    //Lo pone netBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        lblImagen = new javax.swing.JLabel();
        btnVerSolucion = new javax.swing.JButton();
        txtEjercicio = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnVerSolucion.setText("Ver solucion");
        btnVerSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSolucionActionPerformed(evt);
            }
        });

        txtEjercicio.setEnabled(false);

        txtTema.setToolTipText("");
        txtTema.setEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVerSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Crea objeto de la clase Conexion_BD
    Conexion_BD conexion = new Conexion_BD();
    //Metodo para ele evento que carga pagina
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Creamos objeto de la clase Ejercicio
        Ejercicio objEjerc = new Ejercicio();
        //En una variable imagen guardamos el resultado del metodo getFoto de la clase Ejercicio
        //Le pasamos el valor de txtEjercicio convertido en entero que es el idEjercicio
        ImageIcon foto = objEjerc.getFoto(Integer.parseInt(txtEjercicio.getText()));
        //Valida si existe la foto
        if(foto != null){
            //Mete la imagen en el label
            lblImagen.setIcon(foto);
        }
        else{
            //No mete nada
            lblImagen.setIcon(null);
        }        
    }//GEN-LAST:event_formWindowOpened

    //Metodo para el evento cuando oprime el boton ver solucion
    private void btnVerSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSolucionActionPerformed
        //Oculta el formulario actual(verEjercicio)
        this.setVisible(false);
        //En una variable int guardo el valor de txtEjercicio convertida en int
        int ejercicio = Integer.parseInt(txtEjercicio.getText());
        //Creo objeto de la clase verSolucion
        verSolucion obj = new verSolucion();
        //Le paso las valor del txtEjercicio y del txtTema a los campos
        //txtEjercicio y txtTema del formulario verSolucion
        obj.txtEjercicio.setText(txtEjercicio.getText());
        obj.txtTema.setText(this.txtTema.getText());
        //Creo objeto de la clase ejercicio
        Ejercicio objEjerc = new Ejercicio();
        //Ejecuto el metodo getFotoSolucion de la clase Ejercicio
        ImageIcon foto = objEjerc.getFotoSolucion(ejercicio);
        //Valida si existe la imagen
        if(foto != null){
            //Carga la imagen en el label del formulario verSolucion
            obj.lblImagenSol.setIcon(foto);
        }
        else{
            //No carga nada
            obj.lblImagenSol.setIcon(null);
        }
        //Mostrar formulario verSolucion
        obj.show();
    
    }//GEN-LAST:event_btnVerSolucionActionPerformed
    
    //Metodo para el evento cuando oprime el boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(verEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verEjercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerSolucion;
    private javax.swing.JScrollBar jScrollBar1;
    public javax.swing.JLabel lblImagen;
    public javax.swing.JTextField txtEjercicio;
    public javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
}
