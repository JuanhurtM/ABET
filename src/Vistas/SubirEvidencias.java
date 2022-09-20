/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.Sql;
import Modelos.Conexion;
import Tabla.Tabla_Evidencias;
import Modelos.Evidencia;
import Modelos.Profesor;
import Controladores.EvidenciasController;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class SubirEvidencias extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    Tabla_Evidencias tabla = new Tabla_Evidencias();
    String RutaArchivo = "";
    int id = -1;

    Profesor pr;

    public SubirEvidencias() {
        initComponents();
        tabla.visualizar_TablaEvidencias(jTable1, pr);
        activa_boton(false, false, false);
        this.setLocationRelativeTo(null);
    }

    public SubirEvidencias(Profesor pr) {
        initComponents();
        this.pr = pr;
        jLabelNombre1.setText(pr.getNombre().toUpperCase());
        tabla.visualizar_TablaEvidencias(jTable1, pr);
        activa_boton(false, false, false);
        this.setLocationRelativeTo(null);

    }

    public void guardar_Archivo(int CodigoGrupo, int codigo, String nombre, File ruta) {

        EvidenciasController pa = new EvidenciasController();
        Evidencia po = new Evidencia();
        po.setCodigo_Evidencias(codigo);
        po.setNombre_Evidencia(nombre);
        po.setCod_Grupo(CodigoGrupo);

        try {
            byte[] evidencia = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(evidencia);
            po.setArchivo(evidencia);

        } catch (Exception ex) {
            po.setArchivo(null);

        }// FIN TRY CATCH
        pa.Agregar_Evidencia(po);

    }// FIN METODO GUARDAR ARCHIVO

    public void modificar_Archivo(int codigo, String nombre, File ruta) {

        EvidenciasController pa = new EvidenciasController();
        Evidencia po = new Evidencia();
        po.setCodigo_Evidencias(codigo);
        po.setNombre_Evidencia(nombre);
        try {
            byte[] archivo = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(archivo);
            po.setArchivo(archivo);
        } catch (Exception ex) {
            po.setArchivo(null);

        }// FIN TRY CATCH
        pa.Modificar_Evidencias(po);

    }// FIN MODIFICAR EVIDENCIA

    public void modificar_Archivo2(int codigo, String nombre) {

        EvidenciasController pa = new EvidenciasController();
        Evidencia po = new Evidencia();
        po.setCodigo_Evidencias(codigo);
        po.setNombre_Evidencia(nombre);
        pa.Modificar_Evidencias2(po);

    }// FIN MODIFICAR EVIDENCIA 2

    public void eliminar_Archivo(int Codigo) {

        EvidenciasController pa = new EvidenciasController();
        Evidencia po = new Evidencia();
        pa.Emilinar_Evidencia(Codigo);

    }// FIN ELIMINAR

    public void seleccionar_Archivo() {

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter f1 = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(f1);
        int se = j.showOpenDialog(this);

        if (se == 0) {
            this.jButtonSeleccionar.setText("" + j.getSelectedFile().getName());
            RutaArchivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }// FIN SELECCIONAR ARCHIVO

    public void activa_boton(boolean a, boolean b, boolean c) {
        jButtonGuardar.setEnabled(a);
        jButtonModificar.setEnabled(b);
        jButtonEliminar.setEnabled(c);
        jTextFieldNombreArchivo.setText("");
        jButtonSeleccionar.setText("Seleccionar...");

    }// FIN ACTIVA BOTON

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre1 = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelNotify = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jLabelSelecionarArchivo = new javax.swing.JLabel();
        jTextFieldCodigoGrupo = new javax.swing.JTextField();
        jTextFieldNombreArchivo = new javax.swing.JTextField();
        jButtonSeleccionar = new javax.swing.JButton();
        jLabelCodigoCurso = new javax.swing.JLabel();
        jLabelNombreArchivo = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelVolver = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        jLabelNombre1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 60, 60));

        jLabelNotify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNotify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNotifyMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelNotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 60, 60));

        jLabelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelBarraMouseDragged(evt);
            }
        });
        jLabelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBarraMousePressed(evt);
            }
        });
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabelSelecionarArchivo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelSelecionarArchivo.setText("Seleccionar Archivo PDF:");
        jLabelSelecionarArchivo.setToolTipText("");
        getContentPane().add(jLabelSelecionarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        jTextFieldCodigoGrupo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldCodigoGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, -1));

        jTextFieldNombreArchivo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldNombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 480, -1));

        jButtonSeleccionar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonSeleccionar.setText("Seleccionar...");
        jButtonSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 480, 30));

        jLabelCodigoCurso.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCodigoCurso.setText("Codigo del curso:");
        getContentPane().add(jLabelCodigoCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, -1));

        jLabelNombreArchivo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombreArchivo.setText("Nombre archivo:");
        getContentPane().add(jLabelNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 20));

        jButtonGuardar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 140, 30));

        jButtonEliminar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 140, 30));

        jButtonCancelar1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonCancelar1.setText("Cancelar");
        jButtonCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 140, 30));

        jButtonModificar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 140, 30));

        jButtonNuevo.setBackground(new java.awt.Color(255, 51, 51));
        jButtonNuevo.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setText("+");
        jButtonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 70, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 680, 130));

        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 30, 60, 70));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EPA.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed

        Xmouse = evt.getX();
        Ymouse = evt.getY();

    }//GEN-LAST:event_jLabelBarraMousePressed

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged
        // TODO add your handling code here:

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - Xmouse, y - Ymouse);

    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        // TODO add your handling code here:
        IniciarSesion sesion = new IniciarSesion();
        sesion.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        activa_boton(true, false, false);
        RutaArchivo = "";

    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldNombreArchivo.getText();
        Sql s = new Sql();
        int CodigoGrupo = Integer.parseInt(jTextFieldCodigoGrupo.getText());
        int Codigo = s.auto_increment("select max(codigo_evidencias)from evidencias");
        File ruta = new File(RutaArchivo);
        if (nombre.trim().length() != 0 && RutaArchivo.trim().length() != 0) {
            guardar_Archivo(CodigoGrupo, Codigo, nombre, ruta);
            tabla.visualizar_TablaEvidencias(jTable1, pr);
            RutaArchivo = "";
            activa_boton(false, false, false);
            jTextFieldCodigoGrupo.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todos los campos");

        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de la evidencia: "));
        eliminar_Archivo(cod);
        tabla.visualizar_TablaEvidencias(jTable1, pr);
        activa_boton(false, false, false);
        jTextFieldNombreArchivo.setText("");
        jTextFieldCodigoGrupo.setText("");
        RutaArchivo = "";
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldNombreArchivo.getText();
        File ruta = new File(RutaArchivo);
        if (nombre.trim().length() != 0 && RutaArchivo.trim().length() != 0) {
            modificar_Archivo(id, nombre, ruta);
            tabla.visualizar_TablaEvidencias(jTable1, pr);
        } else if (RutaArchivo.trim().length() == 0) {

            modificar_Archivo2(id, nombre);
            tabla.visualizar_TablaEvidencias(jTable1, pr);

        }

        RutaArchivo = "";
        activa_boton(false, false, false);


    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTextFieldNombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreArchivoActionPerformed

    private void jTextFieldCodigoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoGrupoActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        seleccionar_Archivo();
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        // TODO add your handling code here:
        activa_boton(false, false, false);
        RutaArchivo = "";

    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int column = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTable1.getRowHeight();
        activa_boton(false, true, true);
        jTextFieldNombreArchivo.setEnabled(true);
        if (row < jTable1.getRowCount() && row >= 0 && column < jTable1.getColumnCount() && column >= 0) {
            id = (int) jTable1.getValueAt(row, 0);
            Object value = jTable1.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("vacio")) {
                    JOptionPane.showMessageDialog(null, "no hay evidencia subida");
                } else {
                    EvidenciasController pd = new EvidenciasController();
                    pd.Ejecutar_Archivo(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }// FIN TERCER IF
            } else {
                String name = "" + jTable1.getValueAt(row, 1);
                jTextFieldNombreArchivo.setText(name);

            }//FIN SEGUNDO IF
        }// FIN PRIMER IF


    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        // TODO add your handling code here:
        InicioProfesor pa = new InicioProfesor(pr);
        pa.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jLabelVolverMouseClicked

    private void jLabelNotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNotifyMouseClicked
        // TODO add your handling code here:

        VerComentarios vc = new VerComentarios();
        vc.setVisible(true);


    }//GEN-LAST:event_jLabelNotifyMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubirEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubirEvidencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelCodigoCurso;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombreArchivo;
    private javax.swing.JLabel jLabelNotify;
    private javax.swing.JLabel jLabelSelecionarArchivo;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodigoGrupo;
    private javax.swing.JTextField jTextFieldNombreArchivo;
    // End of variables declaration//GEN-END:variables

    public Object getjTable1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
