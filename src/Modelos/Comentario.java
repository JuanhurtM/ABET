package Modelos;

import Vistas.DejarComentario;
import Vistas.InsertarCursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class Comentario {

    private int Contador;
    private String Correo_Director;
    private int Cod_Evidencia;
    private String Comentario;
    Director dr;

    //CONSTRUCTOR
    public Comentario(int Contador, String Correo_Director, int Cod_Evidencia, String Comentario) {
        this.Contador = Contador;
        this.Correo_Director = Correo_Director;
        this.Cod_Evidencia = Cod_Evidencia;
        this.Comentario = Comentario;
    }

    public Comentario(Director dr) {
        this.dr = dr;
    }

    public Comentario() {

    }

    // METODO DE INSERTAR COMENTARIO
    public void InsertarComentario(int NumeroEvidencia, String Comentario) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        String Correo = dr.getCorreo_institucional();

        try {
            String sql = "INSERT INTO comentarios VALUES (null,'" + Correo + "'," + NumeroEvidencia + ",'" + Comentario + "')";
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se inserto el comentario correctamente!");
            con.close();

        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        DejarComentario Insert = new DejarComentario();
        Insert.setVisible(false);

    }// FIN INSERTER COMENTARIO

    //METODO VER COMENTARIOS
    public void VerComentarios(int Codigo) {
        
    }// FIN VER COMENTARIO

    //GETTERS AND SETTERS
    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public String getCorreo_Director() {
        return Correo_Director;
    }

    public void setCorreo_Director(String Correo_Director) {
        this.Correo_Director = Correo_Director;
    }

    public int getCod_Evidencia() {
        return Cod_Evidencia;
    }

    public void setCod_Evidencia(int Cod_Evidencia) {
        this.Cod_Evidencia = Cod_Evidencia;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Comentario{" + "Contador=" + Contador + ", Correo_Director=" + Correo_Director + ", Cod_Evidencia=" + Cod_Evidencia + ", Comentario=" + Comentario + '}';
    }

}// NO BORRAR
