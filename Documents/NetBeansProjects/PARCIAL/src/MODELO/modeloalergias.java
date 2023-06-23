/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Usuario
 */
public class modeloalergias {
     private String id_a;
    private String nombre_a;

    public modeloalergias(String id_a, String nombre_a) {
        this.id_a = id_a;
        this.nombre_a = nombre_a;
    }

    public modeloalergias(String nombre_a) {
        this.nombre_a = nombre_a;
    }
    

    public String getId_a() {
        return id_a;
    }

    public void setId_a(String id_a) {
        this.id_a = id_a;
    }

    public String getNombre_a() {
        return nombre_a;
    }

    public void setNombre_a(String nombre_a) {
        this.nombre_a = nombre_a;
    }
    
    
    
}
