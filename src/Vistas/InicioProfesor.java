
package Vistas;

import Controladores.InicioProfesorController;
import Modelos.Conexion;
import Modelos.Profesor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class InicioProfesor extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Conexion cc = new Conexion();
    Connection con = cc.conexion();
    Profesor pr;

    public InicioProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo del Curso");
        model.addColumn("Nombre del curso");
        model.addColumn("Grupo del curso");
        model.addColumn("Período");

        jTable1.setModel(model);
    }
    
    public InicioProfesor(Profesor pr) {

        
        initComponents();
        this.pr = pr;
        jLabelNombre1.setText(pr.getNombre().toUpperCase());
        this.setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nombre del Curso");
        model.addColumn("Periodo Academico");
        model.addColumn("Numero de Grupo");
        model.addColumn("Correo Profesor Asignado");

        jTable1.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre1 = new javax.swing.JLabel();
        jLabelBienvenidos = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jButtonSubirEvidencia = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 320, 30));

        jLabelBienvenidos.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabelBienvenidos.setText("BIENVENIDO PROFESOR");
        getContentPane().add(jLabelBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 60, 60));

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
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        jButtonSubirEvidencia.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonSubirEvidencia.setText("Subir Evidencia");
        jButtonSubirEvidencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSubirEvidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubirEvidenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubirEvidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 160, 30));

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonConsultar.setText("Consultar cursos");
        jButtonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, 30));

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 660, 250));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/custom.jpg"))); // NOI18N
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

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        
//        InicioProfesorController InPr = new InicioProfesorController();
//        String Correo = pr.getCorreo_institucional();
//        InPr.consultarCursos(Correo);
        
        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        String correo = pr.getCorreo_institucional();
        String SQL = "select Codigo_Grupo, Nombre_Curso, Periodo, numero from cursos a, grupos b  where correo_Profesor = '" + correo + "' and a.Codigo_curso = b.Codigo_curso;";

        Statement st;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Codigo del Curso");
        model.addColumn("Nombre del curso");
        model.addColumn("Grupo del curso");
        model.addColumn("PerÍodo");

        jTable1.setModel(model);

        String[] dato = new String[4];

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                dato[0] = rs.getString("Codigo_Grupo");
                dato[1] = rs.getString("Nombre_Curso");
                dato[2] = rs.getString("Numero");
                dato[3] = rs.getString("Periodo");

                model.addRow(dato);
            }//Fin While

            con.close();

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonSubirEvidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubirEvidenciaActionPerformed
        // TODO add your handling code here:

        SubirEvidencias subir = new SubirEvidencias(pr);
        subir.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButtonSubirEvidenciaActionPerformed

    
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
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSubirEvidencia;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBienvenidos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public Object getjTable1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
