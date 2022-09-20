package Tabla;

import Controladores.EvidenciasController;
import Modelos.Evidencia;
import Modelos.Profesor;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author GORILA
 */
public class Tabla_Evidencias {

    EvidenciasController dao = null;

    public void visualizar_TablaEvidencias(JTable tabla, Profesor pr ) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Codigo Evidencia");
        dt.addColumn("Nombre Evidencia");
        dt.addColumn("Arcivo");

        ImageIcon icono = null;
        if (get_Image("/Imagenes/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/Imagenes/32pdf.png"));
        }

//        dao = new SubirEvidenciasController();
        Evidencia vo = new Evidencia(pr);
        ArrayList<Evidencia> list = vo.listar_Evidencias();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodigo_Evidencias();
                fila[1] = vo.getNombre_Evidencia();
                if (vo.getArchivo() != null) {
                    fila[2] = new JButton(icono);
                } else {
                    fila[2] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}// NO BORRAR
