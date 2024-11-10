/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yasmi
 */
public abstract class user {
    private final String nama;
    private final String password;

    public user(String nama, String password){
        this.nama = nama;
        this.password = password;
    }

    public abstract String getRole();
}
