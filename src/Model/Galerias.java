/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mario
 */
public class Galerias {
    private String ubucacionGaleria;
    private String nombreGaleria;

    public Galerias() {
    }

    public Galerias(String nombreGaleria , String ubucacionGaleria) {
        this.ubucacionGaleria = ubucacionGaleria;
        this.nombreGaleria = nombreGaleria;
    }
    

    public String getUbucacionGaleria() {
        return ubucacionGaleria;
    }

    public void setUbucacionGaleria(String ubucacionGaleria) {
        this.ubucacionGaleria = ubucacionGaleria;
    }

    public String getNombreGaleria() {
        return nombreGaleria;
    }

    public void setNombreGaleria(String nombreGaleria) {
        this.nombreGaleria = nombreGaleria;
    }
    
    
    
}
