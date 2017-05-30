package prroyectoun;

import java.sql.*;
import javax.swing.JOptionPane;

public class Materia {
    //Creo objeto de la clase conexion_BD
    Conexion_BD conexion = new Conexion_BD();
    
    //Metodo para consulta Materias, retorna matriz ResultSet
    public ResultSet consultarMaterias(){
        //Guardo en una matriz las datos de el metodo Consulta de la clase Conexion_BD y le envio la consulta.
        ResultSet datos = conexion.Consulta("SELECT * FROM materias");
        return datos;
    }
    
    //Metodo para AgregarMaterias, recibe un parametro que es la nombre de la materia
    public void AgregarMaterias(String materia){
        //Ejecuto el metodo Operaciones de la clase Conexion_BD y le envio la consulta.
        conexion.operaciones("INSERT INTO materias(Materia) VALUES('"+materia+"')");
        //Muestro ventana adyacente notificando que los datos fueron insertados.
        JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");
    }
    
    //Metodo para Editar Materias, recibe dos parametros que son el nombre de la materia editada(materia) y
    //el nombre de la materia al principio, sin editar (nMateria)
    public void EditarMateria(String materia,String nMateria){
        //Ejecuto el metodo operaciones de la clase Conexion_BD y le paso consulta.
        conexion.operaciones("UPDATE materias SET materia = '"+materia+"' WHERE materia = '"+nMateria+"'");
        //Muestro ventana adyacente notificandole que los datos fueron editados
        JOptionPane.showMessageDialog(null, "Datos editados correctamente.");
    }
    
}
