/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.TipoObra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class controlTipoObra {
    ControlConexion con=new ControlConexion();
    
    public List listar(){
        List<TipoObra> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql= con.estado().prepareStatement("SELECT * FROM TiposObras");
            ResultSet res=sql.executeQuery();
            while (res.next()) {                
                lista.add(new TipoObra(res.getInt("tip_cod"),res.getString("tip_nom") ));
            }
        } catch (SQLException e) {
            System.out.println("error: "+e);
        }
        finally{
            con.desconectar();
        }
        return lista;
    }
}
