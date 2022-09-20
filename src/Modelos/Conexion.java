package Modelos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class Conexion {

    Connection conectar = null;
    String url = "url/bd";
    String usuario = "user";
    String Contraseña = "password";

    public Connection conexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url, usuario, Contraseña);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return conectar;

    }

}
