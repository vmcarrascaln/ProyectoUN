package prroyectoun;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Temas {
    //Creo conexion con Base de datos.
    Conexion_BD conexion = new Conexion_BD();
    
    //Metodo para consulta los temas, recibe como parametro el nombre de la materia.
    public ResultSet consultarTemas(String materia){
        //En una matriz guardo el resultado de el metodo Consulta de la clase conexion_BD
        //Le paso la consulta SQL
        ResultSet datos = conexion.Consulta("SELECT * FROM temas WHERE idMateria = (SELECT idMateria FROM materias WHERE materia = '"+materia+"')");
        //Retorna la Matriz
        return datos;
    }
    //Metodo para llenar comboBox
    public ResultSet llenarCombo(){
        //En una matriz guardo los datos del metodo Consulta de la clase Conexion_BD
        ResultSet datos = conexion.Consulta("SELECT Materia FROM materias");
        //Retorna la matriz datos
        return datos;
    }
    //Metodo para editar temas, recibe nombre del tema editado(descripcion)
    //recibe el nombre de la materia(materia)
    //recibe el nombre del tema sin edita (ndescripcion)
    public void editarTemas(String descripcion, String materia,String ndescripcion){
        //Ejecuta el metodo operaciones de la clase Conexion_BD, manda la consulta SQL
        conexion.operaciones("UPDATE temas SET Descripcion = '"+descripcion+"',idMateria = (SELECT idMateria FROM materias WHERE Materia = '"+materia+"') WHERE Descripcion = '"+ndescripcion+"'");
        //Muestra ventana adyacente notificando que fueron editados los datos.
        JOptionPane.showMessageDialog(null,"Datos editados correctamente.");
    }
        
    //Metodo para inserta tema, parametro tema(nombre del tema) y materia(nombre materia)
    public void insertarTema(String tema,String materia){
        //Ejecuto el metodo Operaciones de la clase Conexion_BD le paso la consulta SQL
        conexion.operaciones("INSERT INTO temas(Descripcion,idMateria) VALUES('"+tema+"',(SELECT idMateria FROM materias WHERE Materia = '"+materia+"'))");
        //Muestro ventana adyacente notificando que se ha insertado el tema
        JOptionPane.showMessageDialog(null,"Se ha insertado el tema exitosamente");
    }
    
    //Metodo para eliminar temas, recibe el nombre del tema.
    public void eliminarTema(String tema){
        try {
            //En una matriz cargo los datos del metodo Consulta de la clase Conexion_BD
            ResultSet datos = conexion.Consulta("SELECT * FROM ejercicios WHERE idTema = (SELECT idTema FROM temas WHERE Descripcion = '"+tema+"')");
            //Valido que si no tiene ejercicios elimine el tema
            if(datos.next() == false){
                //Ejecuto el metodo Operaciones de la clase Conexion_BD le envio consulta SQL
                conexion.operaciones("DELETE FROM temas WHERE Descripcion = '"+tema+"'");
                //Muestra ventana adyacente notificando que se elimino el registro.
                JOptionPane.showMessageDialog(null,"Registro eliminado correctamente.");
            }
            else{
                //Si si hay ejercicio muestra ventada adyacente pidiendo que por favor elimine los ejercicios que
                //tenga este tema.
                JOptionPane.showMessageDialog(null,"Por favor elimine primero los ejercicio que tiene este tema.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Temas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
