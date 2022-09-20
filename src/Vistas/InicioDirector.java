package Vistas;

import Modelos.Conexion;
import Modelos.Director;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORILA
 */
public class InicioDirector extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Conexion cc = new Conexion();
    Connection con = cc.conexion();
    Director dr;

    public InicioDirector() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nombre del Curso");
        model.addColumn("Periodo Academico");
        model.addColumn("Numero de Grupo");
        model.addColumn("Correo Profesor Asignado");

        jTable1.setModel(model);
    }

    public InicioDirector(Director dr) {

        
        initComponents();
        this.dr = dr;
        jLabelNombre1.setText(dr.getNombre().toUpperCase());
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

        jLabelBienvenidos = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelBarra = new javax.swing.JLabel();
        jButtonConsultarEvidencias = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenidos.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabelBienvenidos.setText("BIENVENIDO DIRECTOR");
        getContentPane().add(jLabelBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabelNombre1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 260, 30));

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
        getContentPane().add(jLabelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        jButtonConsultarEvidencias.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonConsultarEvidencias.setText("Consultar evidencias");
        jButtonConsultarEvidencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultarEvidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarEvidenciasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultarEvidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 220, 30));

        jButtonInsertar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonInsertar.setText("Insertar");
        jButtonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 160, 30));

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonConsultar.setText("Consultar Cursos");
        jButtonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 660, 170));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/custom.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 640));

        jButton2.setText("jButton1");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

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

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        InsertarCursos IntCursos = new InsertarCursos();
        IntCursos.setVisible(true);


    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        Director dc = new Director();
        Conexion cc = new Conexion();
        Connection con = cc.conexion();
        String correo = dr.getCorreo_institucional();
        String SQL = "select Nombre_Curso, Periodo, numero, Correo_Profesor from cursos a, grupos b where correo_Director = '" + correo + "'and a.Codigo_curso = b.Codigo_curso";

        Statement st;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nombre del Curso");
        model.addColumn("Periodo Academico");
        model.addColumn("Numero de Grupo");
        model.addColumn("Correo Profesor Asignado");

        jTable1.setModel(model);

        String[] dato = new String[4];

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                dato[0] = rs.getString("Nombre_Curso");
                dato[1] = rs.getString("Periodo");
                dato[2] = rs.getString("numero");
                dato[3] = rs.getString("Correo_Profesor");

                model.addRow(dato);
            }//Fin While

            con.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonConsultarEvidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarEvidenciasActionPerformed
        // TODO add your handling code here:
        ConsultarEvidencias cu = new ConsultarEvidencias(dr);
        cu.setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_jButtonConsultarEvidenciasActionPerformed

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

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
            java.util.logging.Logger.getLogger(InicioDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InicioDirector().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarEvidencias;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelBienvenidos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
