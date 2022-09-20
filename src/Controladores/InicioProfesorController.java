package Controladores;

import Modelos.Conexion;
import Modelos.Profesor;
import Vistas.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class InicioProfesorController {

    public static InicioProfesor ventanaProfesor = new InicioProfesor();

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    public static void mostrar() {
        ventanaProfesor.setVisible(true);
    }

    public static void ocultar() {
        ventanaProfesor.setVisible(false);

    }

    //CONSULTAR CURSOS
    public void consultarCursos(String Correo) {
        Profesor pr = new Profesor();
        String correo = Correo;
        pr.ConsultarCursos(correo);
    }

}//NO BORRAR
