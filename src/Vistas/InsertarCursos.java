/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.InicioDirectorController;
import Controladores.IniciarSesionController;
import Controladores.InsertarCursoController;
import Modelos.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class InsertarCursos extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Conexion cc = new Conexion();
    Connection con = cc.conexion();

    public InsertarCursos() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBarra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodCurso = new javax.swing.JTextField();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jTextFieldCorreoProfesor = new javax.swing.JTextField();
        jTextFieldCodigoCurso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelCrearCurso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Creación de grupos");

        jTextFieldCodCurso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextFieldCodCurso.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCodCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodCurso.setText("Numero del grupo");
        jTextFieldCodCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCodCursoMousePressed(evt);
            }
        });
        jTextFieldCodCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodCursoActionPerformed(evt);
            }
        });

        jTextFieldPeriodo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextFieldPeriodo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPeriodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeriodo.setText("Periodo academico");
        jTextFieldPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldPeriodoMousePressed(evt);
            }
        });

        jTextFieldCorreoProfesor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextFieldCorreoProfesor.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCorreoProfesor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreoProfesor.setText("Correo del profesor");
        jTextFieldCorreoProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCorreoProfesorMousePressed(evt);
            }
        });
        jTextFieldCorreoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoProfesorActionPerformed(evt);
            }
        });

        jTextFieldCodigoCurso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextFieldCodigoCurso.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCodigoCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigoCurso.setText("Codigo del curso");
        jTextFieldCodigoCurso.setToolTipText("");
        jTextFieldCodigoCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCodigoCursoMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCrearCurso.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCrearCurso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearCurso.setText("Crear");
        jLabelCrearCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCrearCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearCursoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCrearCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCorreoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelBarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jTextFieldCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextFieldCorreoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextFieldCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCorreoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoProfesorActionPerformed

    private void jLabelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMousePressed

        Xmouse = evt.getX();
        Ymouse = evt.getY();

    }//GEN-LAST:event_jLabelBarraMousePressed

    private void jLabelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - Xmouse, y - Ymouse);

    }//GEN-LAST:event_jLabelBarraMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        //System.exit(0);
        this.setVisible(false);


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextFieldCodCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodCursoMousePressed
        // TODO add your handling code here:

        if (jTextFieldCodCurso.getText().equals("Codigo del Curso")) {
            jTextFieldCodCurso.setText("");
            jTextFieldCodCurso.setForeground(Color.black);
        }

    }//GEN-LAST:event_jTextFieldCodCursoMousePressed

    private void jTextFieldPeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPeriodoMousePressed
        // TODO add your handling code here:

        if (jTextFieldPeriodo.getText().equals("Nombre del Curso")) {
            jTextFieldPeriodo.setText("");
            jTextFieldPeriodo.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextFieldPeriodoMousePressed

    private void jTextFieldCorreoProfesorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCorreoProfesorMousePressed
        // TODO add your handling code here:

        if (jTextFieldCorreoProfesor.getText().equals("Correo del Profesor")) {
            jTextFieldCorreoProfesor.setText("");
            jTextFieldCorreoProfesor.setForeground(Color.black);
        }

    }//GEN-LAST:event_jTextFieldCorreoProfesorMousePressed

    private void jTextFieldCodigoCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCursoMousePressed
        // TODO add your handling code here:

        if (jTextFieldCodigoCurso.getText().equals("Grupo del Curso")) {
            jTextFieldCodigoCurso.setText("");
            jTextFieldCodigoCurso.setForeground(Color.black);
        }


    }//GEN-LAST:event_jTextFieldCodigoCursoMousePressed

    private void jLabelCrearCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearCursoMouseClicked
        // TODO add your handling code here:
        Conexion cc = new Conexion();
        Connection con = cc.conexion();

        int Numero = Integer.parseInt(jTextFieldCodCurso.getText());
        String Periodo = jTextFieldPeriodo.getText();
        String Correo = jTextFieldCorreoProfesor.getText();
        int CodigoCurso = Integer.parseInt(jTextFieldCodigoCurso.getText());
        InsertarCursoController pa = new InsertarCursoController();
        pa.InsertarGrupos(Numero, Periodo, Correo, CodigoCurso);


    }//GEN-LAST:event_jLabelCrearCursoMouseClicked

    private void jTextFieldCodCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodCursoActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelCrearCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodCurso;
    private javax.swing.JTextField jTextFieldCodigoCurso;
    private javax.swing.JTextField jTextFieldCorreoProfesor;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}
