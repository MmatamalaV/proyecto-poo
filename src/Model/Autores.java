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
public class Autores extends Nacionalidades{
    private int aut_cod;
    private String aut_nom;
    private String aut_pseu;
    private Date aut_fnac;
    private Date aut_fdef;

    public Autores() {
    }

    public Autores(int aut_cod, String aut_nom, String aut_pseu, Date aut_fnac, Date aut_fdef) {
        this.aut_cod = aut_cod;
        this.aut_nom = aut_nom;
        this.aut_pseu = aut_pseu;
        this.aut_fnac = aut_fnac;
        this.aut_fdef = aut_fdef;
    }

    public Autores(int aut_cod, String aut_nom, String aut_pseu, Date aut_fnac, Date aut_fdef, String nac_desc, String pais_nom) {
        super(nac_desc, pais_nom);
        this.aut_cod = aut_cod;
        this.aut_nom = aut_nom;
        this.aut_pseu = aut_pseu;
        this.aut_fnac = aut_fnac;
        this.aut_fdef = aut_fdef;
    }

    public Autores(String aut_nom, String aut_pseu) {
        this.aut_nom = aut_nom;
        this.aut_pseu = aut_pseu;
    }
    
    public int getAut_cod() {
        return aut_cod;
    }

    public void setAut_cod(int aut_cod) {
        this.aut_cod = aut_cod;
    }

    public String getAut_nom() {
        return aut_nom;
    }

    public void setAut_nom(String aut_nom) {
        this.aut_nom = aut_nom;
    }

    public String getAut_pseu() {
        return aut_pseu;
    }

    public void setAut_pseu(String aut_pseu) {
        this.aut_pseu = aut_pseu;
    }

    public Date getAut_fnac() {
        return aut_fnac;
    }

    public void setAut_fnac(Date aut_fnac) {
        this.aut_fnac = aut_fnac;
    }

    public Date getAut_fdef() {
        return aut_fdef;
    }

    public void setAut_fdef(Date aut_fdef) {
        this.aut_fdef = aut_fdef;
    }
    
}
