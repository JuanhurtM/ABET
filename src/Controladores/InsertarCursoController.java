package Controladores;

import static Controladores.InicioDirectorController.ventanaDirector;
import Modelos.Conexion;
import Modelos.Curso;
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
public class InsertarCursoController {

    public static InsertarCursos insertarCursos = new InsertarCursos();

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    public static void mostrar() {
        insertarCursos.setVisible(true);
    }

    public static void ocultar() {
        insertarCursos.setVisible(false);

    }

    // METODOD INSERTAR GRUPOS
    public void InsertarGrupos(int Numero, String Periodo, String Correo, int CodigoCurso) {

        Curso cu = new Curso();
        cu.InsertarGrupos(Numero, Periodo, Correo, CodigoCurso);

    }// FIN GRUPOS

}// NO BORRAR
