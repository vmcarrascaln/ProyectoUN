package prroyectoun;

import java.sql.*;
import javax.swing.*;

public class formEjercicios extends javax.swing.JFrame {

    //Constructo
    public formEjercicios() {
        initComponents();
    }
    //Codigo para interfaz
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listEjercicios = new javax.swing.JList();
        btnVerEjercicio = new javax.swing.JButton();
        btnInsertarEjercicios = new javax.swing.JButton();
        btnEliminarEjercicio = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtTema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listEjercicios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listEjercicios);

        btnVerEjercicio.setText("Ver Ejercicio");
        btnVerEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjercicioActionPerformed(evt);
            }
        });

        btnInsertarEjercicios.setText("Insertar Ejercicio");
        btnInsertarEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEjerciciosActionPerformed(evt);
            }
        });

        btnEliminarEjercicio.setText("Eliminar Ejercicio");
        btnEliminarEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEjercicioActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtTema.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarEjercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTema)
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnVerEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertarEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo del evento cuando carga la pagina
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Creo objeto de la clase Ejercicio
        Ejercicio obj = new Ejercicio();
        //Guardo en una matriz el resultado del metodo listarEjercicios de la clase Ejercicio
        //Le paso el valor del campo txtTema
        ResultSet datos = obj.listarEjercicios(txtTema.getText());
        //Creo modelo de la lista
        DefaultListModel modelo = new DefaultListModel();
        try {
            //Recorro la matriz
            while(datos.next()){
                //En la variable valor guardo la columna uno(idEjercicio)
                String valor = datos.getString(1);
                //Añado los id de los ejercicios en el modelo
                modelo.addElement(valor); 
           }
            //Añado el modelo a la lista
            listEjercicios.setModel(modelo);
        } catch(Exception e){}
        
    }//GEN-LAST:event_formWindowOpened

    //Metodo cuando oprime el boton ver ejercicio
    private void btnVerEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEjercicioActionPerformed
        //Validamos que seleccione un ejercicio de la lista
        if(listEjercicios.getSelectedValue() == null){
            JOptionPane.showMessageDialog(null,"Seleccione un ejercicio");
        }
        else{
        //Ocultamos el formulario actual(formEjercicios)
        this.setVisible(false);
        //Creamos objeto de la clase verEjercicio
        verEjercicio obj = new verEjercicio();
        //Le pasamos el valor que selecciono en la lista a el campo txtEjercicio
        //Le pasamos el valot del txtTema a el campo txtTema del formulario(verEjercicio)
        obj.txtEjercicio.setText((String)listEjercicios.getSelectedValue());
        obj.txtTema.setText(this.txtTema.getText());
        //Mostramos formulario(verEjercicio)
        obj.show();
        }
    }//GEN-LAST:event_btnVerEjercicioActionPerformed

    //Metodo para el evento cuando el boton insertar Ejercicio
    private void btnInsertarEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEjerciciosActionPerformed
        //Ocultamos el formulario actual(formEjecicios)
        this.setVisible(false);
        //Creamos objetos de la clase insertarEjercicio
        insertarEjercicio vent = new insertarEjercicio();
        //Le pasamos el valor del campo txtTema que es nombre del tema a
        //el campo txtTema del formulario insertarEjercicio
        vent.txtTema.setText(this.txtTema.getText());
        //Mostramos el ejercicio
        vent.show();
    }//GEN-LAST:event_btnInsertarEjerciciosActionPerformed
    
    //Metodo del evento cuando oprime volver
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Oculto el formulario actual(formEjercicios)
        this.setVisible(false);
        //Creo objeto de la clase opcionesAdmin
        opcionesAdmin obj = new opcionesAdmin();
        //muestro formulario opcionesAdmin
        obj.show();
    }//GEN-LAST:event_btnVolverActionPerformed

    //Metodo para el evento cuando oprime EliminarEjercicio
    private void btnEliminarEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEjercicioActionPerformed
        //Creo objeto de la clase eliminarEjericio
        eliminarEjercicio vent = new eliminarEjercicio();
        //Le paso el valor que selecciono en la lista al campo txtEjercicio del formulario eliminarEjercicio
        vent.txtEjercicio.setText((String)listEjercicios.getSelectedValue());
        //Muestro el formulario eliminarEjercicio
        vent.show();
    }//GEN-LAST:event_btnEliminarEjercicioActionPerformed

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
            java.util.logging.Logger.getLogger(formEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEjercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarEjercicio;
    private javax.swing.JButton btnInsertarEjercicios;
    private javax.swing.JButton btnVerEjercicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listEjercicios;
    public javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
}
