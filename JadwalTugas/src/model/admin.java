/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class admin extends user{
    private final String role = "Admin";
    
    public admin(String nama, String password){
        super(nama, password);
    }
    
    @Override
    public final String getRole(){
        return this.role;
    }
    
    public static final boolean loginAdmin(String nama, String password){
        try{
            String query = "SELECT * FROM admin WHERE nama = ? AND password = ?";
            database.preparedStatement = database.connection.prepareStatement(query);
            database.preparedStatement.setString(1, nama);
            database.preparedStatement.setString(2, password);
            database.resultSet = database.preparedStatement.executeQuery();

            if (database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login gagal! " + e.getMessage());
        }
        return false;
        }
    
    public static final String getNama(String nama) {
        try {
            String query = "SELECT nama_admin FROM admin WHERE nama = ?";
            database.preparedStatement = database.connection.prepareStatement(query);
            database.preparedStatement.setString(1, nama);
            database.resultSet = database.preparedStatement.executeQuery();

            if (database.resultSet.next()) {
                return database.resultSet.getString("nama_admin");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Login gagal! " + e.getMessage());
        }
        return null;
    }
}
