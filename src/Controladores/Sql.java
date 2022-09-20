
package Controladores;

import Modelos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author GORILA
 */
public class Sql {
    
    public int auto_increment(String sql){
    int id = 1;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion cc = new Conexion();
        try {
            ps = cc.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt(1) + 1;
            
            }//FIN WHILE
        } catch (Exception ex) {
            System.out.println("idmaximo"+ex.getMessage());
            id = 1;
        }finally {
            try {
                ps.close();
                rs.close();
                cc.conexion().close();
            } catch (Exception ex) {
            }
        
        }// FIN TRY CATCH
    return id;
    
    }
    
    
    
}// NO BORRAR
