package controller;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlUsuario extends Usuario {

    ControlConexion con =new ControlConexion();
    
    public boolean login(String usu, String pass) {
        
        try {
            con.conectar();
            PreparedStatement sql =con.estado().prepareStatement("SELECT usu_nom FROM usuarios WHERE usu_nom='"+usu+"' AND usu_pass='"+pass+"'");
            ResultSet res=sql.executeQuery();
            if(res.next()){
                this.setNombreUsuario(res.getString("usu_nom"));
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error :"+ ex);
        }finally{
            con.desconectar();
        }
        return false;
    }
}
