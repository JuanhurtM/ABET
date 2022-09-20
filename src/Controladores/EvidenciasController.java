package Controladores;

import Modelos.Conexion;
import Modelos.Evidencia;
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
public class EvidenciasController {

    //LISTAR
    public void ListarEvidencias() {

        Evidencia ev = new Evidencia();
        ev.listar_Evidencias();

    }
    // FIN LISTAR

    //AGREGAR
    public void Agregar_Evidencia(Evidencia vo) {

        Evidencia ev = new Evidencia();
        ev.Agregar_Evidencia(vo);

    }// FIN AGREGAR

    //MODIFICAR 1
    public void Modificar_Evidencias(Evidencia vo) {

        Evidencia ev = new Evidencia();
        ev.Modificar_Evidencias(vo);

    }// FIN MODIFICAR

    //MODIFICAR 2
    public void Modificar_Evidencias2(Evidencia vo) {

        Evidencia ev = new Evidencia();
        ev.Modificar_Evidencias2(vo);

    }// FIN MODIFICAR 2

    //ELIMINAR
    public void Emilinar_Evidencia(int cod) {

        Evidencia ev = new Evidencia();
        ev.Emilinar_Evidencia(cod);

    }// FIN ELIMINAR

    // EJECUTAR
    public void Ejecutar_Archivo(int id) {

        Evidencia ev = new Evidencia();
        ev.Ejecutar_Archivo(id);

    }// FIN EJECUTAR ARCHIVO

}//No Borrar final clase

