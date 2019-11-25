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
public class TipoObra {
    private int tip_cod;
    private String tip_nom;

    public TipoObra() {
    }

    public TipoObra(int tip_cod, String tip_nom) {
        this.tip_cod = tip_cod;
        this.tip_nom = tip_nom;
    }

    public int getTip_cod() {
        return tip_cod;
    }

    public void setTip_cod(int tip_cod) {
        this.tip_cod = tip_cod;
    }

    public String getTip_nom() {
        return tip_nom;
    }

    public void setTip_nom(String tip_nom) {
        this.tip_nom = tip_nom;
    }
    
    @Override
    public String toString(){
        return tip_nom;
    }
}
