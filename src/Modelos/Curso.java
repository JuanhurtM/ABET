package Modelos;

import Vistas.InsertarCursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class Curso {

    public int Codigo_Curso;
    public String Correo_Director;
    public int Codigo_Asignacion;
    public String Nombre;
    

    // CONSTRUCTOR
    public Curso(int Codigo_Curso, String Correo_Director, int Codigo_Asignacion, String Nombre) {
        this.Codigo_Curso = Codigo_Curso;
        this.Correo_Director = Correo_Director;
        this.Codigo_Asignacion = Codigo_Asignacion;
        this.Nombre = Nombre;
    }

    public Curso() {
    }

    // METODOD INSERTAR GRUPOS
    public void InsertarGrupos(int Numero, String Periodo, String Correo, int CodigoCurso) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        try {
            String sql = "Insert into   grupos  values (null," + Numero + ",'" + Periodo + "','" + Correo + "'," + CodigoCurso + ")";
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se le asigno el grupo: " + Numero + " al Profesor: " + Correo + " correctamente.");

            con.close();

        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        InsertarCursos Insert = new InsertarCursos();
        Insert.setVisible(false);

    }// FIN GRUPOS
    
    // METODOS GETTERS Y SETTERS
    public int getCodigo_Curso() {
        return Codigo_Curso;
    }

    public void setCodigo_Curso(int Codigo_Curso) {
        this.Codigo_Curso = Codigo_Curso;
    }

    public String getCorreo_Director() {
        return Correo_Director;
    }

    public void setCorreo_Director(String Correo_Director) {
        this.Correo_Director = Correo_Director;
    }

    public int getCodigo_Asignacion() {
        return Codigo_Asignacion;
    }

    public void setCodigo_Asignacion(int Codigo_Asignacion) {
        this.Codigo_Asignacion = Codigo_Asignacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    // METODO TO STRING
    @Override
    public String toString() {
        return "Curso{" + "Codigo_Curso=" + Codigo_Curso + ", Correo_Director=" + Correo_Director + ", Codigo_Asignacion=" + Codigo_Asignacion + ", Nombre=" + Nombre + '}';
    }

    
}// NO BORRAR
