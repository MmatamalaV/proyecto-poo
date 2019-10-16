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
public class Nacionalidades extends Paises{
    private int nac_cod;
    private String nac_desc;

    public Nacionalidades() {
    }

    public Nacionalidades(int nac_cod, String nac_desc) {
        this.nac_cod = nac_cod;
        this.nac_desc = nac_desc;
    }

    public Nacionalidades(int nac_cod, String nac_desc, String pais_nom) {
        super(pais_nom);
        this.nac_cod = nac_cod;
        this.nac_desc = nac_desc;
    }

    public Nacionalidades(String nac_desc, String pais_nom) {
        super(pais_nom);
        this.nac_desc = nac_desc;
    }
    
    
    
    public int getNac_cod() {
        return nac_cod;
    }

    public void setNac_cod(int nac_cod) {
        this.nac_cod = nac_cod;
    }

    public String getNac_desc() {
        return nac_desc;
    }

    public void setNac_desc(String nac_desc) {
        this.nac_desc = nac_desc;
    }
    
    
    
}
