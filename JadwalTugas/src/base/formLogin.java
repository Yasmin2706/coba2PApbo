/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class formLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public formLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLoginnama = new javax.swing.JTextField();
        passLogin = new javax.swing.JPasswordField();
        btnXlogin = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnDaftardilogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLoginnama.setBackground(new java.awt.Color(187, 147, 48));
        txtLoginnama.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtLoginnama.setBorder(null);
        getContentPane().add(txtLoginnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 560, 60));

        passLogin.setBackground(new java.awt.Color(187, 147, 48));
        passLogin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passLogin.setBorder(null);
        passLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passLoginActionPerformed(evt);
            }
        });
        getContentPane().add(passLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 560, 60));

        btnXlogin.setBackground(new java.awt.Color(255, 249, 234));
        btnXlogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnXlogin.setForeground(new java.awt.Color(100, 90, 65));
        btnXlogin.setText("X");
        btnXlogin.setBorder(null);
        btnXlogin.setBorderPainted(false);
        btnXlogin.setContentAreaFilled(false);
        getContentPane().add(btnXlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        btnLogin.setContentAreaFilled(false);
        btnLogin.setBackground(new java.awt.Color(228, 198, 122));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(100, 90, 65));
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 220, 60));

        btnDaftardilogin.setBackground(new java.awt.Color(255, 249, 234));
        btnDaftardilogin.setBorder(null);
        btnDaftardilogin.setBorderPainted(false);
        btnDaftardilogin.setContentAreaFilled(false);
        getContentPane().add(btnDaftardilogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 120, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Berhasil login atas nama " + this.txtLoginnama.getText());
    }//GEN-LAST:event_btnLoginActionPerformed

    private void passLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passLoginActionPerformed
        JOptionPane.showMessageDialog(null, "Berhasil Login Atas Nama = " + this.txtLoginnama.getText());// TODO add your handling code here:
    }//GEN-LAST:event_passLoginActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftardilogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnXlogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passLogin;
    private javax.swing.JTextField txtLoginnama;
    // End of variables declaration//GEN-END:variables
}