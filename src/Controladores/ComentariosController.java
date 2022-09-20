package Controladores;

import Modelos.Comentario;
import Modelos.Director;

/**
 *
 * @author GORILA
 */
public class ComentariosController {

    Director dr;

    //CONSTRUCTOR
    public ComentariosController(Director dr) {
        this.dr = dr;

    }

    // METODO COMENTAR
    public void Comentar(int Codigo, String Comen) {

        Comentario co = new Comentario(dr);
        co.InsertarComentario(Codigo, Comen);

    }// FIN COMENTAR
    
    // METODO VER COMENTARIOS
    public void VerComentarios(int Codigo){
    
        Comentario co = new Comentario();
        co.VerComentarios(Codigo);
    
    }// FIN VER COMENTARIOS

}// NO BORRAR
