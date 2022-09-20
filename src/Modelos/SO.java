
package Modelos;

/**
 *
 * @author GORILA
 */
public class SO {
    
    private int Codigo;
    private String Nombre_SO;

    //CONSTRUCTOR
    public SO(int Codigo, String Nombre_SO) {
        this.Codigo = Codigo;
        this.Nombre_SO = Nombre_SO;
    }

    //GETTERS AND SETTERS
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre_SO() {
        return Nombre_SO;
    }

    public void setNombre_SO(String Nombre_SO) {
        this.Nombre_SO = Nombre_SO;
    }

    //TO STRING
    @Override
    public String toString() {
        return "SO{" + "Codigo=" + Codigo + ", Nombre_SO=" + Nombre_SO + '}';
    }
      
    
}// No Borrar
