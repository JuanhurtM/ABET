package Controladores;

import Modelos.Conexion;
import Vistas.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class InicioDirectorController {

    public static InicioDirector ventanaDirector = new InicioDirector();

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    public static void mostrar() {
        ventanaDirector.setVisible(true);
    }

    public static void ocultar() {
        ventanaDirector.setVisible(false);

    }



    public void ConsultarCursos() {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String correo = JOptionPane.showInputDialog("Digite su Correo Institucional: ");
        String SQL = "select nombre_so, nombre_curso,grupo_curso,correo_profesor from cursos join sos on cursos.codigo_so=SOS.codigo_sos and correo_director = '" + correo + "'";

        Statement st;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nombre del SO");
        model.addColumn("Nombre del curso");
        model.addColumn("Grupo del Curso");
        model.addColumn("Correo Profesor Asignado");

        ventanaDirector.getjTable1();

        String[] dato = new String[4];

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                dato[0] = rs.getString("nombre_so");
                dato[1] = rs.getString("nombre_curso");
                dato[2] = rs.getString("grupo_curso");
                dato[3] = rs.getString("correo_profesor");

                model.addRow(dato);
            }//Fin While

            con.close();

        } catch (Exception e) {
        }

    }

}//NO BORRAR
