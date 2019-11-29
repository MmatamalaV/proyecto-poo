/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ObrasDeArte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class ControlObrasArte {
    ControlConexion con=new ControlConexion();
    
    public List listar(){
        List<ObrasDeArte> lista =new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement("SELECT oa_cod ,oa_nom, aut_nom, tip_nom FROM obradearte "
                    + "INNER JOIN autores ON (obradearte.aut_cod = autores.aut_cod) "
                    + "INNER JOIN tiposobras ON (obradearte.tip_cod = tiposobras.tip_cod)");
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                lista.add(new ObrasDeArte(res.getInt("oa_cod"), res.getString("oa_nom"), res.getString("aut_nom"), res.getString("tip_nom")));
            }
        } catch (SQLException e) {
        }finally{
        con.desconectar();
        }
        return lista;
    }
    
    
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
