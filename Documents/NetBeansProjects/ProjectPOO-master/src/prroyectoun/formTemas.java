package prroyectoun;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class formTemas extends javax.swing.JFrame {

    //Constructo de la clase formTemas, lo pone NetBeans
    public formTemas() {
        initComponents();
    }

    //Codigo para crear la interfaz, lo pone NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listTemas = new javax.swing.JList();
        txtMensaje = new javax.swing.JTextField();
        btnVerEjercicios = new javax.swing.JButton();
        btnEditarTema = new javax.swing.JButton();
        btnInsertarTemas = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEliminarTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listTemas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTemas);
        listTemas.getAccessibleContext().setAccessibleName("");
        listTemas.getAccessibleContext().setAccessibleDescription("");

        txtMensaje.setEditable(false);

        btnVerEjercicios.setText("Ver ejercicios");
        btnVerEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjerciciosActionPerformed(evt);
            }
        });

        btnEditarTema.setText("Editar temas");
        btnEditarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTemaActionPerformed(evt);
            }
        });

        btnInsertarTemas.setText("Insertar temas");
        btnInsertarTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarTemasActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminarTema.setText("Eliminar tema");
        btnEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerEjercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertarTemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnVerEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertarTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo del evento cuando se abre el formulario
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Creo objeto de la clase temas.
        Temas temas = new Temas();
        //En una matriz guardo el resultado del metodo consultarTemas de la clase Temas;
        //le paso el parametro del atributo txtMensaje
        ResultSet datos =temas.consultarTemas(txtMensaje.getText());
        //Creo modelo para list
        DefaultListModel modelo = new DefaultListModel();
        try {
            //Recorro la matriz datos
            while(datos.next()){
                //En la variable valor guardo las valor de la columna dos, nombre de los temas.
                String valor = datos.getString(2);
                //Le agrego al model el nombre de los temas, osea la variable valor.
                modelo.addElement(valor); 
           }
            //Meto el modelo a la lista
            listTemas.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened
    
    Conexion_BD conexion = new Conexion_BD();
    
    //Metodo del evento cuando oprime el boton editar tema
    private void btnEditarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTemaActionPerformed
        try {
            //Valida si escogio algun valor de la lista
            if(listTemas.getSelectedValue() == null){
                //Si no selecciono muestro ventana adyacente notificandole que seleccones
                JOptionPane.showMessageDialog(null,"Seleccione un tema");
            }
            else{
                //Creo objeto de la clase editarTemas
                editarTemas temas = new editarTemas();
                //Le paso el valor de el item que selecciono de la lista
                temas.txtTema.setText((String)listTemas.getSelectedValue());
                //Creo objeto de la clase Temas
                Temas tem = new Temas();
                //En una matriz recibo los datos del metodo llenarCombo de la clase Temas
                ResultSet datos = tem.llenarCombo();
                //Recorro la matriz datos
                while(datos.next()){
                    //Lleno el comboBox de el formulario editarTemas
                    temas.cmbMateria.addItem((String)datos.getString("Materia"));
                }
                //Oculto el formulario actual(formTemas)
                this.setVisible(false);
                //Muestro el formular editarMaterias
                temas.show();
            }
        } catch (SQLException ex) {
            Logger.getLogger(formTemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarTemaActionPerformed
    
    //Metodo del evento oprimir boton Volver
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Oculto el formulario actual(formTemas)
        this.setVisible(false);
        //Creo objeto de la clase opcionesAdmin
        opcionesAdmin vent = new opcionesAdmin();
        //Muestro el formulario opcionesAdmin
        vent.show();
    }//GEN-LAST:event_btnVolverActionPerformed

    //Metodo para el evento cuando oprime InsertarTemas
    private void btnInsertarTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarTemasActionPerformed
        //Oculto la ventana actual(formTemas)
        this.setVisible(false);
        //Creo objeto de la clase insertarTema
        insertarTema vent = new insertarTema();
        //Le paso el valor de el campo txtMensaje de este formulario(formTemas), a el campo 
        //txtMateria del formulario insertarTema
        vent.txtMateria.setText(txtMensaje.getText());
        //Muestreme el formulario insertarTema
        vent.show();
    }//GEN-LAST:event_btnInsertarTemasActionPerformed

    //Metodo del evento cuando oprime el boton EliminarTema
    private void btnEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTemaActionPerformed
        //Valido que haya seleccionado un valor de lista
        if(listTemas.getSelectedValue() == null){
            //Si no selecciono, mostrar ventana adyacente que notifique que tiene que seleccionar un tema.
            JOptionPane.showMessageDialog(null,"Seleccione un tema");
        }
        else{
            //Creo objeto de la clase eliminarTema.
            eliminarTema vent = new eliminarTema();
            //Le paso el valor que selecciono de la lista, a el campo txtTema del formulario eliminarTema
            vent.txtTema.setText((String)listTemas.getSelectedValue());
            //Le paso el valor del campo txtMensaje de este formulario(formTemas) a el campo txtMateria 
            //del formulario eliminarMateria
            vent.txtMateria.setText(txtMensaje.getText());
            //Oculteme este formulario(formTemas)
            this.setVisible(false);
            //Muestre el formulario eliminarMaterias
            vent.show();
        }

    }//GEN-LAST:event_btnEliminarTemaActionPerformed
    //Metodo para el evento cuando oprime el boton ver ejercicio
    private void btnVerEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEjerciciosActionPerformed
        //Valido que selecciono un valor de la lista
        if(listTemas.getSelectedValue() == null)
        {
            //Si no selecciono ventana adyacente pidiendole seleccione
            JOptionPane.showMessageDialog(null,"Seleccione un tema");
        }    
        else{
            //Oculto formulario actual(formTemas)
            this.setVisible(false);
            //Creo objeto de la clase formEjercicios
            formEjercicios vent = new formEjercicios();
            //Le paso el valor que selecciono en la lista al atributo txtTema del formulario formEjercicios
            vent.txtTema.setText((String)listTemas.getSelectedValue());
            //Muestro formulario formEjercicios
            vent.show();
        }
    }//GEN-LAST:event_btnVerEjerciciosActionPerformed

    //Codigo que pone NetBeans
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
            java.util.logging.Logger.getLogger(formTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTemas().setVisible(true);
            }
        });
    }
    //Atributos
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarTema;
    private javax.swing.JButton btnEliminarTema;
    private javax.swing.JButton btnInsertarTemas;
    private javax.swing.JButton btnVerEjercicios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listTemas;
    public javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
