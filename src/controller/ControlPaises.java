/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Paises;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class ControlPaises extends Paises{
    
    List<Paises> lista =new ArrayList<>();
    
    //instancia control coneccion    
    ControlConexion con= new ControlConexion();
    
//  create
    public void create(String pais){
        try {
            con.conectar();
            PreparedStatement sql= con.estado().prepareStatement("INSERT INTO Paises(pais_nom) VALUES('"+pais+"')");
            sql.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            con.desconectar();
        }
    }
//  read
    public List mostrar(String nombre){
        lista.clear();
        try {
            con.conectar();
            PreparedStatement sql= con.estado().prepareStatement("SELECT * FROM paises WHERE pais_nom LIKE '%"+nombre+"%'");// % para todos menos fecha, # para fechas 
            ResultSet res=sql.executeQuery();
            while (res.next()) {                
                lista.add(new Paises(res.getInt("pais_cod"),res.getString("pais_nom")));
            }
        } catch (Exception e) {
        }
        return lista;
    }
//  update
    public void update(int codigo, String nombre){
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement("UPDATE paises SET pais_nom='"+nombre+"' WHERE pais_cod='"+codigo+"'");
            sql.execute();
        } catch (SQLException e) {
            System.out.println("error: "+e);
        }finally{
            con.desconectar();
        }
    }
//  delete
    public void delete(int codigo) {
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement("DELETE FROM paises WHERE pais_cod='"+codigo+"'");
            sql.execute();//execute es para modificar el disco
        } catch (SQLException e) {
            System.out.println("error: "+e);
        }finally{
            con.desconectar();
        }
    }
}
