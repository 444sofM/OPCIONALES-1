/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class modelopaciente {
    private String idp;
    private String nombrep;
    private String direccionp;
    private String telefonop;
    private String apellidop;
    private ArrayList<String>Alergias;

    public ArrayList<String> getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergia) {
        Alergias.add(alergia);
    }

    public modelopaciente(String idp, String nombrep, String direccionp, String telefonop, String apellidop, ArrayList<String> Alergias) {
        this.idp = idp;
        this.nombrep = nombrep;
        this.direccionp = direccionp;
        this.telefonop = telefonop;
        this.apellidop = apellidop;
        this.Alergias = Alergias;
        
    }

    public modelopaciente(String idp, String nombrep, String direccionp, String telefonop, String apellidop) {
        this.idp = idp;
        this.nombrep = nombrep;
        this.direccionp = direccionp;
        this.telefonop = telefonop;
        this.apellidop = apellidop;
        Alergias = new ArrayList<>();
    }
   

    public String getIdp() {
        return idp;
    }

    public void setIdp(String idp) {
        this.idp = idp;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDireccionp() {
        return direccionp;
    }

    public void setDireccionp(String direccionp) {
        this.direccionp = direccionp;
    }

    public String getTelefonop() {
        return telefonop;
    }

    public void setTelefonop(String telefonop) {
        this.telefonop = telefonop;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
}
