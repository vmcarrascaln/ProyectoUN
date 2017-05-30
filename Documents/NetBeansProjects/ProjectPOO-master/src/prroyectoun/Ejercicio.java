package prroyectoun;

import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Ejercicio {
    //Creo objeto de la conexion
    Conexion_BD conexion = new Conexion_BD();
    //Metodo para listarEjercicios, recibe el nombre del tema
    public ResultSet listarEjercicios(String tema){
        //Guardo en matriz el resultado de el metodo consulta de la clase Conexion_BD
        ResultSet datos = conexion.Consulta("SELECT * FROM ejercicios WHERE idTema = (SELECT idTema FROM temas WHERE Descripcion = '"+tema+"')");
        //Retorno la matriz datos
        return datos;
    }
    
    public ResultSet llenarCombo(){
        ResultSet datos = conexion.Consulta("SELECT Descripcion FROM temas");
        return datos;
    }
    
    
    //Metodo para cargar foto, recibe el idEjercicio
    Statement st = null;
    Connection con = conexion.Conectar_BD();
    ResultSet rs;
    public ImageIcon getFoto(int idEjercicio){
        //Guardo la consulta en una variable
        String sql = "SELECT urlEjercicio FROM ejercicios WHERE idEjercicio = "+idEjercicio;
        ImageIcon ii = null;
        InputStream is = null;
        try {
            //Creo objeto de la clase verEjercicio
            verEjercicio obj = new verEjercicio();
            //Preparo Statement para ejecutar la consulta
            st=con.createStatement();
            //Guardo en la matriz el resultado de la consulta
            rs =st.executeQuery(sql);
            //Valido si la matriz trae datos
            if(rs.next()){
                //Obtengo en la variable is el valor de la columna 1, valor binario
                is = rs.getBinaryStream(1);
                //Convierto el valor binario en foto y lo guardo en la variable bi
                BufferedImage bi = ImageIO.read(is);
                //En la variable ii, crea un icono
                ii = new ImageIcon(bi.getScaledInstance(obj.lblImagen.getWidth(), obj.lblImagen.getHeight(), bi.SCALE_DEFAULT));
            }
        } catch (Exception e) {
        }
        //Returnamos el icono
        return ii;
    }
    
    //Metodo para traer la foto de la solucion, recibe el idEjercicio
    public ImageIcon getFotoSolucion(int idEjercicio){
        //Guardo la consulta en una variable
        String sql = "SELECT urlSolucion FROM ejercicios WHERE idEjercicio = "+idEjercicio;
        ImageIcon ii = null;
        InputStream is = null;
        try {
            verSolucion obj = new verSolucion();
            st=con.createStatement();
            rs =st.executeQuery(sql);
            if(rs.next() == true){
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                ii = new ImageIcon(bi.getScaledInstance(obj.lblImagenSol.getWidth(), obj.lblImagenSol.getHeight(), bi.SCALE_DEFAULT));
            }
            
        } catch (Exception e) {
        }
        return ii;
    }
    
    //Metodo para eliminar Ejercicio, recibe el id
    public void eliminarEjercicio(int idEjercicio){
        //Ejecuto el metodo operacion de la clase Conexion_BD
        conexion.operaciones("DELETE FROM ejercicios WHERE idEjercicio = "+idEjercicio);
        //Muestro ventana adyacente notificando que se ha eliminado
        JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
    }
}
