/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Autores;
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
public class controlAutores {
    ControlConexion con=new ControlConexion();
    
    public List listar(){
        List<Autores> lista = new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement sql= con.estado().prepareStatement("SELECT aut_cod,aut_nom,aut_pseu FROM autores");
            ResultSet res=sql.executeQuery();
            while (res.next()) {
                lista.add(new Autores(res.getInt("aut_cod"),res.getString("aut_nom"), res.getString("aut_pseu")));
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
