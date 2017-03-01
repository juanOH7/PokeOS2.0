/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan O'Hara
 */
public class PokeDx extends javax.swing.JFrame {

    ArrayList<Perfil> usuarios = new ArrayList();

    /**
     * Creates new form PokeDx
     */
    public PokeDx() {
        initComponents();
        fondo_frame.setIcon(new ImageIcon(new ImageIcon("./src/Images/other.jpg").getImage().getScaledInstance(fondo_frame.getWidth(), fondo_frame.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarusuario = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_contrasena_agregarusuario = new javax.swing.JTextField();
        tf_usuario_agregarpersona = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        fondo_agregarusuario = new javax.swing.JLabel();
        eliminarusuario = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        cb_eliminarusuario = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        fondo_eliminarusuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pf_contrasena = new javax.swing.JPasswordField();
        fondo_frame = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        agregarusuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jLabel2.setText("Usuario");
        agregarusuario.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jLabel4.setText("Contrasena");
        agregarusuario.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        agregarusuario.getContentPane().add(tf_contrasena_agregarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, -1));
        agregarusuario.getContentPane().add(tf_usuario_agregarpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 110, -1));

        jButton2.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        agregarusuario.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        agregarusuario.getContentPane().add(fondo_agregarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        eliminarusuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jLabel6.setText("Nombre");
        eliminarusuario.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        cb_eliminarusuario.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        eliminarusuario.getContentPane().add(cb_eliminarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 30));

        jButton3.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        eliminarusuario.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        eliminarusuario.getContentPane().add(fondo_eliminarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jLabel1.setText("Contrasena");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        jLabel3.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 40));

        tf_usuario.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        tf_usuario.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 30));

        jButton1.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        pf_contrasena.setFont(new java.awt.Font("Pocket Monk", 0, 24)); // NOI18N
        getContentPane().add(pf_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 30));
        getContentPane().add(fondo_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 340));

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Agregar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        agregarusuario.pack();
        fondo_agregarusuario.setIcon(new ImageIcon(new ImageIcon("./src/Images/agregar.jpg").getImage().getScaledInstance(fondo_agregarusuario.getWidth(), fondo_agregarusuario.getHeight(), Image.SCALE_SMOOTH)));
        agregarusuario.setModal(true);
        agregarusuario.setLocationRelativeTo(this);
        agregarusuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String usuario = this.tf_usuario_agregarpersona.getText();
        String contrasena = this.tf_usuario_agregarpersona.getText();
        usuarios.add(new Perfil(usuario,contrasena));
        tf_usuario_agregarpersona.setText(null);
        this.tf_contrasena_agregarusuario.setText(null);
        agregarusuario.setModal(false);
        agregarusuario.setVisible(false);
        JOptionPane.showMessageDialog(this, usuario + " Se ha agregado exitosamente");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usuario = this.tf_usuario.getText();
        String contrasena = this.pf_contrasena.getPassword().toString();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(usuarios.get(i).getNombre()) && contrasena.equals(usuarios.get(i).getPassword())) {
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel cb = new DefaultComboBoxModel();
        for (int i = 0; i < usuarios.size(); i++) {
            cb.addElement(usuarios.get(i).getNombre());
        }
        this.cb_eliminarusuario.setModel(cb);
        eliminarusuario.pack();
        fondo_eliminarusuario.setIcon(new ImageIcon(new ImageIcon("./src/Images/eliminar.jpg").getImage().getScaledInstance(fondo_eliminarusuario.getWidth(), fondo_eliminarusuario.getHeight(), Image.SCALE_SMOOTH)));
        eliminarusuario.setModal(true);
        eliminarusuario.setLocationRelativeTo(this);
        eliminarusuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String usuario = this.cb_eliminarusuario.getSelectedItem().toString();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equals(usuario)) {
                usuarios.remove(i);
                break;
            }
        }
        DefaultComboBoxModel cb = new DefaultComboBoxModel();
        for (int i = 0; i < usuarios.size(); i++) {
            cb.addElement(usuarios.get(i).getNombre());
        }
        this.cb_eliminarusuario.setModel(cb);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PokeDx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokeDx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokeDx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokeDx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeDx().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog agregarusuario;
    private javax.swing.JComboBox cb_eliminarusuario;
    private javax.swing.JDialog eliminarusuario;
    private javax.swing.JLabel fondo_agregarusuario;
    private javax.swing.JLabel fondo_eliminarusuario;
    private javax.swing.JLabel fondo_frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField pf_contrasena;
    private javax.swing.JTextField tf_contrasena_agregarusuario;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuario_agregarpersona;
    // End of variables declaration//GEN-END:variables
}
