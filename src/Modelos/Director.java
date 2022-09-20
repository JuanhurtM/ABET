package Modelos;


import Controladores.InicioProfesorController;
import Vistas.IniciarSesion;
import Vistas.InicioDirector;
import Vistas.InicioProfesor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class Director {

    public String correo_institucional;
    public String Nombre;
    public String Contrasena;
    public String Programa;

    //CONSTRUCTOR

    public Director(String correo_institucional, String Nombre, String Contrasena, String Programa) {
        this.correo_institucional = correo_institucional;
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
        this.Programa = Programa;
    }
   

    public Director() {
        
    }
    
    
    // METODO VALIDAR DATOS DIRECTOR
    public void ValidarDatosDirector(String Correo, String Contrasena) {

        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        int resultado = 0;
        String SQL2 = "select * from directores where Correo_Institucional = '" + Correo + "' and contraseña = '" + Contrasena + "'";
        try {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(SQL2);

                    if (rs.next()) {

                        resultado = 1;

                        if (resultado == 1) {
                            
                            String CorreoInsti = rs.getString(1);
                            String Nombre = rs.getString(2);
                            String Contrasena2 = rs.getString(3);
                            String Programa = rs.getString(4);
                            Director dr = new Director(CorreoInsti,Nombre,Contrasena2,Programa);
                            
                            IniciarSesion sesion = new IniciarSesion();
                            InicioDirector director = new InicioDirector(dr);
                            director.setVisible(true);
                            sesion.setVisible(false);

                        } 

                    } else {

                        JOptionPane.showMessageDialog(null, "Error, Credenciales Invalidas");
                    }
                    con.close();

                } catch (Exception e) {

                }
    }// Fin Metodo
    
    
    
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

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

 

    // METODO TO STRING
    @Override
    public String toString() {
        return "Usuario{" + "correo_institucional=" + correo_institucional + ", Nombre=" + Nombre + ", Contrasena=" + Contrasena + ", Programa=" + Programa  + '}';
    }
    

    

}//NO BORRAR
