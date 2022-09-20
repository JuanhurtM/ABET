package Modelos;

import Vistas.IniciarSesion;
import Vistas.InicioDirector;
import Vistas.InicioProfesor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class Profesor {

    public String correo_institucional;
    public String Nombre;
    public String Contrasena;
    public String Departamento;

    //CONSTRUCTOR
    public Profesor(String correo_institucional, String Nombre, String Contrasena, String Departamento) {
        this.correo_institucional = correo_institucional;
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
        this.Departamento = Departamento;
    }

    public Profesor() {

    }

    // METODO VALIDAR DATOS PROFESOR
    public void ValidarDatosProfesor(String Correo, String Contrasena) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        int resultado = 0;
        String SQL1 = "select * from profesores where Correo_Institucional = '" + Correo + "' and contraseña = '" + Contrasena + "'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL1);

            if (rs.next()) {

                resultado = 1;

                if (resultado == 1) {

                    String CorreoInsti = rs.getString(1);
                    String Nombre = rs.getString(2);
                    String Contrasena2 = rs.getString(3);
                    String Departamento = rs.getString(4);
                    Profesor pr = new Profesor(CorreoInsti, Nombre, Contrasena2, Departamento);
                    IniciarSesion sesion = new IniciarSesion();
                    InicioProfesor profesor = new InicioProfesor(pr);
                    profesor.setVisible(true);
                    sesion.setVisible(false);

                }

            } else {

                JOptionPane.showMessageDialog(null, "Error, Credenciales Invalidas");
            }
            con.close();

        } catch (Exception e) {

        }

    }// FIN METODO

    //METODO CONSULTAR CURSOS ----------> revisar como mandar esa tabla aqui :v
    public void ConsultarCursos(String Correo) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        Profesor pr = new Profesor();

        String correo = Correo;
        String SQL = "select Codigo_Grupo, Nombre_Curso, Periodo, numero from cursos a, grupos b  where correo_Profesor = '" + correo + "' and a.Codigo_curso = b.Codigo_curso;";

        Statement st;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo del Curso");
        model.addColumn("Nombre del curso");
        model.addColumn("Grupo del curso");
        model.addColumn("PerÍodo");

//        jTable1.setModel(model);

        String[] dato = new String[4];

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                dato[0] = rs.getString("Codigo_Grupo");
                dato[1] = rs.getString("Nombre_Curso");
                dato[2] = rs.getString("Numero");
                dato[3] = rs.getString("Periodo");

                model.addRow(dato);
            }//Fin While

            con.close();

        } catch (Exception e) {
        }

    }// FIN CONSULTAR CURSOS

    //METODOS GETTERS AND SETTERS
    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    // METODO TO STRING
    @Override
    public String toString() {
        return "Profesor{" + "correo_institucional=" + correo_institucional + ", Nombre=" + Nombre + ", Contrasena=" + Contrasena + ", Departamento=" + Departamento + '}';
    }

}// NO BORRAR
