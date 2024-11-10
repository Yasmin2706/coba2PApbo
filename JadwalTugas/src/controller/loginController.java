/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.database;
import model.user;
import gui.*;

import javax.swing.*;

/**
 *
 * @author yasmi
 */
public class loginController {
    public static loginController getInstance() {
        return new loginController();
    }
    
    public static boolean loginButton(String id, String password){
        try {
            database.connect();
            if (id.equals("Masukkan namamu.") || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Silakan isi yang kosong!");
            } else {
                switch (id.charAt(0)) {
                    case '2' -> {
                        if (Mahasiswa.loginMahasiswa(id, password)) {
                            UserSession.getInstance().setUserId(id);
                            UserSession.getInstance().setUserName(Mahasiswa.getName(id));
                            MenuMahasiswa dashboardMahasiswa = new MenuMahasiswa();
                            dashboardMahasiswa.setVisible(true);
                            dashboardMahasiswa.pack();
                            dashboardMahasiswa.setLocationRelativeTo(null);
                            dashboardMahasiswa.setDefaultCloseOperation(MenuMahasiswa.EXIT_ON_CLOSE);
                            String name = UserSession.getInstance().getUserName();
                            JOptionPane.showMessageDialog(null, "Welcome back " + name);
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Login gagal!");
                            return false;
                        }
                    }
                    case '1' -> {
                        if (Dosen.loginDosen(id, password)) {
                            UserSession.getInstance().setUserId(id);
                            UserSession.getInstance().setUserName(Dosen.getName(id));
                            MenuDosen dashboardDosen = new MenuDosen();
                            dashboardDosen.setVisible(true);
                            dashboardDosen.pack();
                            dashboardDosen.setLocationRelativeTo(null);
                            dashboardDosen.setDefaultCloseOperation(MenuDosen.EXIT_ON_CLOSE);
                            String name = UserSession.getInstance().getUserName();
                            JOptionPane.showMessageDialog(null, "Welcome back " + name);
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Login gagal!");
                            return false;
                        }
                    }
                    default -> JOptionPane.showMessageDialog(null, "Invalid ID!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        }
        return false;
    }
}
