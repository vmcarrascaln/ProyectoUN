package prroyectoun;

import java.io.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;


public class Conexion_BD {
 
    Connection conexion = Conectar_BD();
    private static final String url = "jdbc:mysql://localhost:3306/proyectoun";
    
    //Metodo para conectar con la base de datos
    public Connection Conectar_BD(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url,"root","root");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al conectar."+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    
    //Metodo para hacer solo consultas
    public ResultSet Consulta(String consulta){
        
        Statement declara;
        try {
            declara = conexion.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (Exception e) {
            
        }
        return null;
    }
    
    //Metodo para hacer operaciones que no sean consulta
    public void operaciones(String query){
        try {
            Statement declara2;
            declara2 = conexion.createStatement();
            declara2.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para guardar imagenes, recibe dos rutas y un nombre de tema
    public  void guardar_imagen(String ruta,String rutaSolucion,String Tema){
        //Guardo la consulta en la variable insert
        String insert = "insert into ejercicios (urlEjercicio,urlSolucion,idTema) values(?,?,(SELECT idTema FROM temas WHERE Descripcion = '"+Tema+"'))";
        
    FileInputStream fi = null;
    FileInputStream fi2=null;
    PreparedStatement ps = null;
    try{
        //Lee la ruta de la imagen
        File file = new File(ruta);
        File file2 = new File(rutaSolucion);
            
        
        //Leer la imagen en bytes
        fi = new FileInputStream(file);
        fi2 = new FileInputStream(file2);
        
        //Prepara la consulta
        ps = conexion.prepareStatement(insert);
        
        //Asigna los valores a la consulta
        ps.setBinaryStream(1, fi);
        ps.setBinaryStream(2, fi2);

        
        //Ejecuta consulta
        ps.executeUpdate();
        }catch(Exception ex){
        System.out.println("Error al guardar"+ex);
        }
    }
    
    }

