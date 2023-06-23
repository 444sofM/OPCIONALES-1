/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.modeloalergias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorAlergias {
    
    private List<modeloalergias> alergias;

    public ControladorAlergias() {
         this.alergias = new ArrayList<>();
         
    }
    
    public List<modeloalergias> obtenerAlergias() {
        return alergias;
    }

    public void agregarAlergia(modeloalergias alergia) {
        alergias.add(alergia);
    }
    
}
