package Modelos;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class Evidencia {

    int Codigo_Evidencias;
    int Cod_Grupo;
    String Nombre_Evidencia;
    byte[] Archivo;
    Profesor pr;
    Director dr;

    //CONSTRUCTOR
    public Evidencia(int Codigo_Evidencias, int Cod_Grupo, String Nombre_Evidencia, byte[] Archivo) {
        this.Codigo_Evidencias = Codigo_Evidencias;
        this.Cod_Grupo = Cod_Grupo;
        this.Nombre_Evidencia = Nombre_Evidencia;
        this.Archivo = Archivo;
    }

    public Evidencia() {

    }

    public Evidencia(Profesor pr) {
        this.pr = pr;
    }

    public Evidencia(Director dr) {
        this.dr = dr;

    }

    //METODO LISTAR EVIDENCIAS ----> Este metodo lo que hace es hacer una consulta de evidencias.
    public ArrayList<Evidencia> listar_Evidencias() {

        ArrayList<Evidencia> list = new ArrayList<Evidencia>();
        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String correo = pr.getCorreo_institucional();
        String sql = "Select codigo_evidencias, nombre_evidencias, tipo_archivo from evidencias a, grupos b where b.Correo_Profesor ='" + correo + "' and a.codigo_Grupo = b.Codigo_Grupo;"; //SENTENCIA SQL PARA CONSULATAR Y LISTAR LAS EVIDENCIAS
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

                Evidencia ev = new Evidencia();
                ev.setCodigo_Evidencias(rs.getInt(1));
                ev.setNombre_Evidencia(rs.getString(2));
                ev.setArchivo(rs.getBytes(3));
                list.add(ev);

            }//Fin while

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

            try {
                st.close();
                rs.close();

            } catch (Exception ex) {

            }

        }
        return list;

    }// FIN LISTAR PROFESOR

    //METODO LISTAR EVIDENCIAS DIRECTOR ----> Este metodo lo que hace es hacer una consulta de evidencias.
    public ArrayList<Evidencia> listar_EvidenciasDirector() {

        ArrayList<Evidencia> list = new ArrayList<Evidencia>();
        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String correo = JOptionPane.showInputDialog("Digite el Correo del profesor al cual desea revisar las evidencias: ");
        String sql = "Select codigo_evidencias, nombre_evidencias, tipo_archivo from evidencias a, grupos b where b.Correo_Profesor ='" + correo + "' and a.codigo_Grupo = b.Codigo_Grupo;"; //SENTENCIA SQL PARA CONSULATAR Y LISTAR LAS EVIDENCIAS
        ResultSet rs = null;
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

                Evidencia ev = new Evidencia();
                ev.setCodigo_Evidencias(rs.getInt(1));
                ev.setNombre_Evidencia(rs.getString(2));
                ev.setArchivo(rs.getBytes(3));
                list.add(ev);

            }//Fin while

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

            try {
                st.close();
                rs.close();

            } catch (Exception ex) {

            }

        }
        return list;

    }// FIN LISTAR DIRECTOR

    // METODO AGREGAR EVIDENCIA
    public void Agregar_Evidencia(Evidencia vo) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String sql = "insert into evidencias (codigo_evidencias,nombre_evidencias,tipo_archivo,codigo_grupo) values (?,?,?,?);";// SENTNCIA SQL INSERT PARA INSERATAR EVIDENCIAS
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, vo.getCodigo_Evidencias());
            ps.setString(2, vo.getNombre_Evidencia());
            ps.setBytes(3, vo.getArchivo());
            ps.setInt(4, vo.getCod_Grupo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }

        }// Fin try catch

    }// FIN AGREGAR

    //METODO MODIFICAR EVIDENCIAS
    public void Modificar_Evidencias(Evidencia vo) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String sql = "Update evidencias set nombre_evidencias = ?, tipo_archivo = ? WHERE codigo_evidencias = ?;";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getNombre_Evidencia());
            ps.setBytes(2, vo.getArchivo());
            ps.setInt(3, vo.getCodigo_Evidencias());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }// Fin try catch

    }// FIN MODIFICAR

    //MODIFICAR EVIDENCIAS 2
    public void Modificar_Evidencias2(Evidencia vo) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String sql = "Update evidencias set nombre_evidencias = ? WHERE codigo_evidencias = ?;";
        PreparedStatement ps = null;
        try {
            ps.setString(1, vo.getNombre_Evidencia());
            ps.setInt(2, vo.getCod_Grupo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }

        }// fin try catch

    }// FIN MODIFICAR 2

    //METODO ELIMINAR 
    public void Emilinar_Evidencia(int cod) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String sql = "DELETE FROM EVIDENCIAS WHERE codigo_evidencias = " + cod;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }// try catch

    }// FIN ELIMINAR

    //METODO EJECUTAR ARCHIVO
    public void Ejecutar_Archivo(int id) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {

            ps = con.prepareStatement("SELECT tipo_archivo FROM evidencias WHERE codigo_evidencias = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }// FIN WHILE
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datoPDF = new byte[tamanoInput];
            bos.read(datoPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datoPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            con.close();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("ERROR AL ABRIR EL ARCHIVO" + ex.getMessage());

        }

    }// FIN EJECUTAR ARCHIVO

    //GETTERS AND SETTERS
    public int getCodigo_Evidencias() {
        return Codigo_Evidencias;
    }

    public void setCodigo_Evidencias(int Codigo_Evidencias) {
        this.Codigo_Evidencias = Codigo_Evidencias;
    }

    public int getCod_Grupo() {
        return Cod_Grupo;
    }

    public void setCod_Grupo(int Cod_Grupo) {
        this.Cod_Grupo = Cod_Grupo;
    }

    public String getNombre_Evidencia() {
        return Nombre_Evidencia;
    }

    public void setNombre_Evidencia(String Nombre_Evidencia) {
        this.Nombre_Evidencia = Nombre_Evidencia;
    }

    public byte[] getArchivo() {
        return Archivo;
    }

    public void setArchivo(byte[] Archivo) {
        this.Archivo = Archivo;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Evidencia{" + "Codigo_Evidencias=" + Codigo_Evidencias + ", Cod_Curso=" + Cod_Grupo + ", Nombre_Evidencia=" + Nombre_Evidencia + '}';
    }

}//No borrar
