/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author yasmi
 */
public class formMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public formMenuAdmin() {
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

        btnBuattugas = new javax.swing.JButton();
        btnLihattugasAdmin = new javax.swing.JButton();
        btnEdittugas = new javax.swing.JButton();
        btnHapustugas = new javax.swing.JButton();
        btnKeluaradmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuattugas.setBackground(new java.awt.Color(100, 90, 65));
        btnBuattugas.setBorder(null);
        btnBuattugas.setBorderPainted(false);
        btnBuattugas.setContentAreaFilled(false);
        getContentPane().add(btnBuattugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 170, 50));

        btnLihattugasAdmin.setBackground(new java.awt.Color(100, 90, 65));
        btnLihattugasAdmin.setBorder(null);
        btnLihattugasAdmin.setBorderPainted(false);
        btnLihattugasAdmin.setContentAreaFilled(false);
        getContentPane().add(btnLihattugasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 180, 50));

        btnEdittugas.setBackground(new java.awt.Color(100, 90, 65));
        btnEdittugas.setBorder(null);
        btnEdittugas.setBorderPainted(false);
        btnEdittugas.setContentAreaFilled(false);
        getContentPane().add(btnEdittugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 170, 50));

        btnHapustugas.setBackground(new java.awt.Color(100, 90, 65));
        btnHapustugas.setBorder(null);
        btnHapustugas.setContentAreaFilled(false);
        btnHapustugas.setDefaultCapable(false);
        getContentPane().add(btnHapustugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 160, 50));

        btnKeluaradmin.setBorderPainted(false);
        btnKeluaradmin.setContentAreaFilled(false);
        getContentPane().add(btnKeluaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 33, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/4.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(formMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuattugas;
    private javax.swing.JButton btnEdittugas;
    private javax.swing.JButton btnHapustugas;
    private javax.swing.JButton btnKeluaradmin;
    private javax.swing.JButton btnLihattugasAdmin;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
