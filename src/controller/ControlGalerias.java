/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Galerias;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ControlGalerias {
    ArrayList<Galerias> lista=new ArrayList<>();
    
    public ArrayList mostrar(){
        leerArrchivo();
        return lista;
    }
    
     public void eliminarGaleria(String nombreGaleria){
        try{
            leerArrchivo();
            for (Galerias g : lista) {
                if (g.getNombreGaleria().equals(nombreGaleria)) {
                    lista.remove(lista.indexOf(g));
                    break;
                }
            }
            grabarArchivo();
        }catch(Exception e){
            
        }
    }
    
    private void grabarArchivo(){
        FileWriter fr=null;
        PrintWriter pw=null;
        try{
            fr=new FileWriter("src/Archivos/Galerias.txt");
            pw= new PrintWriter(fr);
            for (Galerias g : lista) {
                pw.println(g.getNombreGaleria()+","+g.getUbucacionGaleria());
            }
        }
        catch(IOException e){
            System.out.println("error: "+e);
        }finally{
            try{
                fr.close();
                pw.close();
            }catch(IOException e){
                System.out.println("error: "+e);
            }
        }
    }
    
    public void crearGaleria(String nombre, String ubicacion){
        leerArrchivo();
        lista.add(new Galerias(nombre, ubicacion));
        grabarArchivo();
    }
    
    private void leerArrchivo(){
        lista.clear();
        FileReader fr=null;
        BufferedReader br=null;
        
        try{
            fr=new FileReader("src/Archivos/Galerias.txt");
            br=new BufferedReader(fr);
            String linea=null;
            String[] array=null;
            Galerias Galerias=null;
            while ((linea=br.readLine())!=null) {
                array=linea.split(",");
                Galerias=new Galerias(array[0].trim(),array[1].trim());
                lista.add(Galerias);
            }
        }catch(IOException ex){
            System.out.println("error: "+ex);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("error: "+ex);
            }
        }
    }
    public void modificarGaleria(String nombreAnterior, String nombreGaleriaNuevo, String ubicacionGaleria){
        try{
            leerArrchivo();
            for (Galerias g : lista) {
                if(g.getNombreGaleria().equals(nombreAnterior)){
                    g.setNombreGaleria(nombreGaleriaNuevo);
                    g.setUbucacionGaleria(ubicacionGaleria);
                    break;
                }
            }
            grabarArchivo();
        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }
}
