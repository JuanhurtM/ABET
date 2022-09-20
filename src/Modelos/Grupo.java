
package Modelos;

/**
 *
 * @author GORILA
 */
public class Grupo {
    
    public int Codigo;
    public String Correo_Profesor;
    public int Codigo_Curso;
    public int Numero;
    public String Perido;

    //CONSTRUCTOR
    public Grupo(int Codigo, String Correo_Profesor, int Codigo_Curso, int Numero, String Perido) {
        this.Codigo = Codigo;
        this.Correo_Profesor = Correo_Profesor;
        this.Codigo_Curso = Codigo_Curso;
        this.Numero = Numero;
        this.Perido = Perido;
    }

    public Grupo() {
    }

    //METODOS GETTERS AND SETTERS
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCorreo_Profesor() {
        return Correo_Profesor;
    }

    public void setCorreo_Profesor(String Correo_Profesor) {
        this.Correo_Profesor = Correo_Profesor;
    }

    public int getCodigo_Curso() {
        return Codigo_Curso;
    }

    public void setCodigo_Curso(int Codigo_Curso) {
        this.Codigo_Curso = Codigo_Curso;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getPerido() {
        return Perido;
    }

    public void setPerido(String Perido) {
        this.Perido = Perido;
    }

    // METODO TO STRING
    @Override
    public String toString() {
        return "Grupo{" + "Codigo=" + Codigo + ", Correo_Profesor=" + Correo_Profesor + ", Codigo_Curso=" + Codigo_Curso + ", Numero=" + Numero + ", Perido=" + Perido + '}';
    }
    
     
}// NO BORRAR
