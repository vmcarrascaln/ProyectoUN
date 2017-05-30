package prroyectoun;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class opcionesAdmin extends javax.swing.JFrame {
    //Creo objeto de la conexion
    Conexion_BD conexion = new Conexion_BD();
    
    //Constructor de la clase opcionesAdmin, lo pone NetBeans
    public opcionesAdmin() {
        initComponents();
    }
    //Creacion interfaz lo pone Netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMaterias = new javax.swing.JList();
        btnVerTemas = new javax.swing.JButton();
        btnAgregarMateria = new javax.swing.JButton();
        btnEditarMateria = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setMaximumSize(new java.awt.Dimension(435, 300));
        setMinimumSize(new java.awt.Dimension(435, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listMaterias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listMaterias);

        btnVerTemas.setText("Ver temas");
        btnVerTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTemasActionPerformed(evt);
            }
        });

        btnAgregarMateria.setText("Agregar Materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        btnEditarMateria.setText("Editar Materia");
        btnEditarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMateriaActionPerformed(evt);
            }
        });

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
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerTemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Evento de cargar pagina, cuando la pagina se abre me carga la lista.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Creo objeto de la clase materia
        Materia materia = new Materia();
        //Guardo en una matriz el resultado de el metodo consultarMaterias de la clase Materia
        ResultSet datos = materia.consultarMaterias();
        //Esto es para editar el modelo de la lista, insertar los datos
        DefaultListModel modelo = new DefaultListModel();
        try {
            //Recorro los datos traidos del metodo consultarMaterias
            while(datos.next()){
                //En la variable valor guardo el dato de la columna dos que es la descripcion de la materia
                String valor = datos.getString(2);
                //Añado al modelo el texto de la materia, variable valo.
                modelo.addElement(valor); 
           }
            //Cargo los datos el la lista.
            listMaterias.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    //Metodo del evento cuando oprime el boton Ver Temas. 
    private void btnVerTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTemasActionPerformed
        //Valido si seleccion un valor de la lista
        if(listMaterias.getSelectedValue() == null){
            //Mostrar ventana adyacente notificandole que seleccion un materia de la lista.
           JOptionPane.showMessageDialog(null,"Seleccione una materia."); 
        }
        else{
        //Me oculta este formulario.
        this.setVisible(false);
        //Creo un objeto de el formulario formTemas.
        formTemas vent = new formTemas();
        //Le paso el valor que selecciono de la lista, a el campo txtMensaje del formulario formTemas
        vent.txtMensaje.setText((String)listMaterias.getSelectedValue());
        //Muestro formulario
        vent.show();
        }
    }//GEN-LAST:event_btnVerTemasActionPerformed

    //Metodo del evento cuando oprime el boton Agregar Materia.
    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        //Oculto este formulario
        this.setVisible(false);
        //Creo un objeto de la clase insertarMateria.
        insertarMateria vent = new insertarMateria();
        //Muestre este formulario.
        vent.show();
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    //Metodo del evento cuando oprime el boton Editar Materia
    private void btnEditarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMateriaActionPerformed
        //Valido si selecciono un valor de la lista.
        if(listMaterias.getSelectedValue() == null){
            //Si no selecciono,muestro ventana adyacente notificandole que seleccione una materia de la lista.
            JOptionPane.showMessageDialog(null,"Seleccione una materia.");
        }
        else
        {
            //Creo un objeto de la clase editarMateria.
            editarMateria vent = new editarMateria();
            //Le paso el valor que selecciono de la lista, a el campo txtEditar del formulario editarMateria
            vent.txtEditar.setText((String)listMaterias.getSelectedValue());
            //Oculteme este formulario (opcionesAdmin)
            this.setVisible(false);
            //Muestreme el formulario editarMateria.
            vent.show();
        }
    }//GEN-LAST:event_btnEditarMateriaActionPerformed

    //Metodo del evento cuando oprime el boton salir.
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Sintaxis para terminar la ejecucion del programa.
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Main, este codigo lo pone NetBeans necesario para ejecutar
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
            java.util.logging.Logger.getLogger(opcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opcionesAdmin().setVisible(true);
            }
        });
    }

    //Propiedades-atributos-interfaz
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnEditarMateria;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerTemas;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JList listMaterias;
    // End of variables declaration//GEN-END:variables
}
