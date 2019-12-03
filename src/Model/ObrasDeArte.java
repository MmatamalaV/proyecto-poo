/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author mario
 */
public class ObrasDeArte extends Autores1{
    private int oa_cod;
    private String oa_nom;
    private Date oa_fecha;
    private String oa_desc;

    public ObrasDeArte(int oa_cod, String oa_nom, String aut_nom, String tip_nom) {
        super(aut_nom, tip_nom);
        this.oa_cod = oa_cod;
        this.oa_nom = oa_nom;
    }

    public ObrasDeArte(int oa_cod, String oa_nom, Date oa_fecha, String oa_desc, String aut_nom, String tip_nom) {
        super(aut_nom, tip_nom);
        this.oa_cod = oa_cod;
        this.oa_nom = oa_nom;
        this.oa_fecha = oa_fecha;
        this.oa_desc = oa_desc;
    }

    public ObrasDeArte() {
    }

    public int getOa_cod() {
        return oa_cod;
    }

    public void setOa_cod(int oa_cod) {
        this.oa_cod = oa_cod;
    }

    public String getOa_nom() {
        return oa_nom;
    }

    public void setOa_nom(String oa_nom) {
        this.oa_nom = oa_nom;
    }

    public Date getOa_fecha() {
        return oa_fecha;
    }

    public void setOa_fecha(Date oa_fecha) {
        this.oa_fecha = oa_fecha;
    }

    public String getOa_desc() {
        return oa_desc;
    }

    public void setOa_desc(String oa_desc) {
        this.oa_desc = oa_desc;
    }
    
    
}
