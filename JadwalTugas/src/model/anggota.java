/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author yasmi
 */
public class anggota extends user{
    private final String role = "Mahasiswa";
            public anggota(String nama, String password){
                super(nama, password);
            }
            @Override
            public final String getRole(){
                return this.role;
            }
            
            public final static boolean loginAnggota(String nama, String password){
                try{
                    String query = "SELECT * FROM anggota WHERE nama = ? AND password = ?";
                    database.preparedStatement = database.connection.prepareStatement(query);
                    database.preparedStatement.setString(1, nama);
                    database.preparedStatement.setString(2, password);
                    database.resultSet = database.preparedStatement.executeQuery();

                    if (database.resultSet.next()) {
                        return true;
                    } else {
                        return false;
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Login gagal! ");
                    return false;
                }
            }
            
            public static final String getNama(String nama){
                try{
                    String query = "SELECT nama_anggota FROM anggota WHERE nama = ?";
                    database.preparedStatement = database.connection.prepareStatement(query);
                    database.preparedStatement.setString(1, nama);
                    database.resultSet = database.preparedStatement.executeQuery();

                    if (database.resultSet.next()) {
                        return database.resultSet.getString("nama_anggota");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan!");
                }
                return null;
            }
}
