/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class ControlObrasArte {
    ControlConexion con=new ControlConexion();
    
    public void insertar(String nom, String fecha,String desc,int autor,int tipo){
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement("insert into obradearte (oa_nom,oa_fecha,oa_desc,aut_cod,tip_cod) values('"+nom+"','"+fecha+"','"+desc+"','"+autor+"','"+tipo+"')");
            sql.execute();
        } catch (SQLException e) {
        }finally{
        con.desconectar();
    }
    }
}