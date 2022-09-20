package Controladores;

import Modelos.Conexion;
import Modelos.Director;
import Modelos.Profesor;
import Vistas.IniciarSesion;
import Vistas.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class IniciarSesionController {

    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    //METODO VALIDAR
    public void ValidarDatos(String Correo, String Contrasena, String Rol) {

        switch (Rol) {
            case "Director":
                Director dr = new Director();
                dr.ValidarDatosDirector(Correo, Contrasena);
                
                break;

            case "Profesor":

                Profesor pr = new Profesor();
                pr.ValidarDatosProfesor(Correo, Contrasena);

                break;
        } //Fin swich
        
    }// Fin Metodo

    
}//NO BORRAR
