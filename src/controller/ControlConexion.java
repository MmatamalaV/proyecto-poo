/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class ControlConexion {
    private String url;
    private String usuario;
    private String pasword;
    private Connection con;

    public ControlConexion() {
        this.url="jdbc:mysql://127.0.0.1/ElMuseo";
        this.usuario="root";
        this.pasword="";
    }
//    metodo para conectar
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usuario,pasword);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error conectar: "+ ex);
        }
    }
//    metodo desconectar
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("error desconectar: "+ ex);
        }
    }
//    estatus
    public Connection estado(){
        return con;
    }
}
