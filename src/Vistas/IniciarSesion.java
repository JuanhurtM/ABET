package Vistas;

import Controladores.IniciarSesionController;
import Controladores.InicioProfesorController;
import Modelos.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author GORILA
 */
public class IniciarSesion extends javax.swing.JFrame {

    public static IniciarSesionController Controller = new IniciarSesionController();

    int Xmouse, Ymouse;

    //METODO CONEXION
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIniciarSesion = new javax.swing.JButton();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelBarraMover = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIniciarSesion.setBackground(new java.awt.Color(255, 51, 51));
        jButtonIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setText("Iniciar Sesión");
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 160, 40));

        jTextFieldCorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreo.setText("Correo Electrónico");
        jTextFieldCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCorreoMousePressed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 360, 40));

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("********");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 360, 40));

        jComboBoxRol.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxRol.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jComboBoxRol.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Director", "Profesor" }));
        getContentPane().add(jComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione Rol");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, 30));

        jLabelBarraMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelBarraMoverMouseDragged(evt);
            }
        });
        jLabelBarraMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBarraMoverMousePressed(evt);
            }
        });
        getContentPane().add(jLabelBarraMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 920, 70));

        jLabelSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(255, 51, 51));
        jLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalir.setText("X");
        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 50, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed

        String Rol = jComboBoxRol.getSelectedItem().toString();
        String Correo = jTextFieldCorreo.getText();
        String Contrasena = String.valueOf(jPasswordField1.getPassword());
        IniciarSesionController pa = new IniciarSesionController();
        pa.ValidarDatos(Correo, Contrasena, Rol);

    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelBarraMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMoverMousePressed

        Xmouse = evt.getX();
        Ymouse = evt.getY();

    }//GEN-LAST:event_jLabelBarraMoverMousePressed

    private void jLabelBarraMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMoverMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - Xmouse, y - Ymouse);


    }//GEN-LAST:event_jLabelBarraMoverMouseDragged

    private void jTextFieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCorreoMousePressed
        // TODO add your handling code here:
        if (jTextFieldCorreo.getText().equals("Correo Electrónico")) {
            jTextFieldCorreo.setText("");
            jTextFieldCorreo.setForeground(Color.black);
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            jPasswordField1.setText("********");
            jPasswordField1.setForeground(Color.gray);

        }


    }//GEN-LAST:event_jTextFieldCorreoMousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        // TODO add your handling code here:

        if (String.valueOf(jPasswordField1.getPassword()).equals("********")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);

        }
        if (jTextFieldCorreo.getText().isEmpty()) {
            jTextFieldCorreo.setText("Correo Electrónico");
            jTextFieldCorreo.setForeground(Color.black);
        }


    }//GEN-LAST:event_jPasswordField1MousePressed

    // GETS DE LOS TEXTFIELD
    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public JTextField getjTextFieldCorreo() {
        return jTextFieldCorreo;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBarraMover;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}// NO BORRAR
