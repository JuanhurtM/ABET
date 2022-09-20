package Vistas;

import Controladores.EvidenciasController;
import Modelos.Conexion;
import Modelos.Director;
import Tabla.Tabla_Evidencias2;
import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author GORILA
 */
public class ConsultarEvidencias extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Conexion cc = new Conexion();
    Connection con = cc.conexion();
    Tabla_Evidencias2 tabla = new Tabla_Evidencias2();
    int id = -1;

    Director dr;

    public ConsultarEvidencias() {
        initComponents();
        tabla.visualizar_TablaEvidencias2(jTable1);
        this.setLocationRelativeTo(null);

    }

    public ConsultarEvidencias(Director dr) {
        initComponents();
        this.dr = dr;
        jLabelNombre1.setText(dr.getNombre().toUpperCase());
        tabla.visualizar_TablaEvidencias2(jTable1);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSalir = new javax.swing.JLabel();
        jLabelVolver = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelBienvenidos = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jButtonDejarComentario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 60, 60));

        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 60, 60));

        jLabelNombre1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 320, 30));

        jLabelBienvenidos.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabelBienvenidos.setText("BIENVENIDO DIRECTOR");
        getContentPane().add(jLabelBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

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
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 50));

        jButtonDejarComentario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonDejarComentario.setText("Dejar comentario");
        jButtonDejarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDejarComentarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDejarComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 230, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 640, 140));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ep.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed
        // TODO add your handling code here:
        Xmouse = evt.getX();
        Ymouse = evt.getY();

    }//GEN-LAST:event_jLabelBarraMousePressed

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - Xmouse, y - Ymouse);

    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        // TODO add your handling code here:
        IniciarSesion sesion = new IniciarSesion();
        sesion.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        // TODO add your handling code here:
        InicioDirector pd = new InicioDirector(dr);
        pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelVolverMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int column = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTable1.getRowHeight();
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

            }//FIN SEGUNDO IF
        }// FIN PRIMER IF


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDejarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDejarComentarioActionPerformed
        // TODO add your handling code here:
        DejarComentario dc = new DejarComentario(dr);
        dc.setVisible(true);


    }//GEN-LAST:event_jButtonDejarComentarioActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEvidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEvidencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDejarComentario;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBienvenidos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
