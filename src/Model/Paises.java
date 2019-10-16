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
public class Paises {
    private int pais_cod;
    private String pais_nom;

    public Paises() {
    }

    public Paises(int pais_cod, String pais_nom) {
        this.pais_cod = pais_cod;
        this.pais_nom = pais_nom;
    }

    public Paises(String pais_nom) {
        this.pais_nom = pais_nom;
    }

    public int getPais_cod() {
        return pais_cod;
    }

    public void setPais_cod(int pais_cod) {
        this.pais_cod = pais_cod;
    }

    public String getPais_nom() {
        return pais_nom;
    }

    public void setPais_nom(String pais_nom) {
        this.pais_nom = pais_nom;
    }
    
    
}
