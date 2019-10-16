/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Administrador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ControlAdmin {
    ArrayList<Administrador> lista=new ArrayList<>();
    
    public ArrayList mostrar(){
        leerArrchivo();
        return lista;
    }
    
    public void leerArrchivo(){
        lista.clear();
        FileReader fr=null;
        BufferedReader br=null;
        
        try{
            fr=new FileReader("src/Archivos/Administrador.txt");
            br=new BufferedReader(fr);
            String linea=null;
            String[] array=null;
            Administrador Usuario=null;
            while ((linea=br.readLine())!=null) {
                array=linea.split(",");
                Usuario=new Administrador(Integer.parseInt(array[1].trim()),array[0].trim());
                lista.add(Usuario);
            }
        }catch(Exception ex){
            System.out.println("error admin1: "+ex);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (Exception ex) {
                System.out.println("error admin2: "+ex);
            }
        }
    }
    public boolean login(int usu, String mail){
        lista=mostrar();
        for (Administrador us : lista) {
            if (us.getClaveSeguridad()==usu && us.getEmailAdministrador().equals(mail)) {
                return true;
            }
        }
        return (false);
    } 
}
