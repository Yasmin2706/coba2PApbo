/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author yasmi
 */
public class formDaftarTugasUser extends javax.swing.JFrame {

    /**
     * Creates new form DaftarTugasUser
     */
    public formDaftarTugasUser() {
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

        btnTenggat = new javax.swing.ButtonGroup();
        cbNamamatkuluser = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftartugasuser = new javax.swing.JTable();
        btnKeluarUser = new javax.swing.JButton();
        btnRefreshuser = new javax.swing.JButton();
        rbTenggatawal = new javax.swing.JRadioButton();
        rbTenggatakhir = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbNamamatkuluser.setBackground(new java.awt.Color(100, 90, 65));
        cbNamamatkuluser.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        cbNamamatkuluser.setForeground(new java.awt.Color(255, 249, 234));
        cbNamamatkuluser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemrograman Berbasis Objek", "Desain Manajemen Jaringan Komputer", "Desain Manajemen Proses Bisnis", "Riset Operasi", "Interaksi Manusia dan Komputer", "Desain Basis Data", "Dasar-Dasar Pengembangan Perangkat Lunak" }));
        cbNamamatkuluser.setBorder(null);
        getContentPane().add(cbNamamatkuluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 320, 40));

        tabelDaftartugasuser.setBackground(new java.awt.Color(228, 198, 122));
        tabelDaftartugasuser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelDaftartugasuser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 1120, 350));

        btnKeluarUser.setBackground(new java.awt.Color(228, 198, 122));
        btnKeluarUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnKeluarUser.setForeground(new java.awt.Color(100, 90, 65));
        btnKeluarUser.setBorder(null);
        btnKeluarUser.setBorderPainted(false);
        btnKeluarUser.setContentAreaFilled(false);
        btnKeluarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 110, 40));

        btnRefreshuser.setBackground(new java.awt.Color(228, 198, 122));
        btnRefreshuser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnRefreshuser.setForeground(new java.awt.Color(100, 90, 65));
        btnRefreshuser.setBorder(null);
        btnRefreshuser.setBorderPainted(false);
        btnRefreshuser.setContentAreaFilled(false);
        getContentPane().add(btnRefreshuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 140, 30));

        btnTenggat.add(rbTenggatawal);
        rbTenggatawal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rbTenggatawal.setText("Awal");
        getContentPane().add(rbTenggatawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        btnTenggat.add(rbTenggatakhir);
        rbTenggatakhir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rbTenggatakhir.setText("Akhir");
        rbTenggatakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTenggatakhirActionPerformed(evt);
            }
        });
        getContentPane().add(rbTenggatakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/LOGIN (8).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarUserActionPerformed

    private void rbTenggatakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTenggatakhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTenggatakhirActionPerformed

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
            java.util.logging.Logger.getLogger(formDaftarTugasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDaftarTugasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDaftarTugasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDaftarTugasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDaftarTugasUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluarUser;
    private javax.swing.JButton btnRefreshuser;
    private javax.swing.ButtonGroup btnTenggat;
    private javax.swing.JComboBox<String> cbNamamatkuluser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbTenggatakhir;
    private javax.swing.JRadioButton rbTenggatawal;
    private javax.swing.JTable tabelDaftartugasuser;
    // End of variables declaration//GEN-END:variables
}