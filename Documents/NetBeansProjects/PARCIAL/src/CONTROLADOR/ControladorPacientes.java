/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.modelopaciente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class ControladorPacientes {
    
    private Map<String, modelopaciente> pacientes;

    public ControladorPacientes() {
        this.pacientes = new HashMap<>();
        
        
        modelopaciente paciente1 = new modelopaciente("1009", "Jimena", "Cll 2c", "12123123", "Ordoñez");
        agregarPaciente(paciente1);

        modelopaciente paciente2 = new modelopaciente("1001", "Camilo", "cll 3d", "232424", "Sanchez");
        agregarPaciente(paciente2);
        
        modelopaciente paciente3 = new modelopaciente("1002", "Jimena", "Cll 2c", "12123123", "Ordoñez");
        agregarPaciente(paciente3);

        modelopaciente paciente4 = new modelopaciente("5554", "Camilo", "cll 3d", "232424", "Sanchez");
        agregarPaciente(paciente4);
    }
    
    public modelopaciente buscarPaciente(String cc) {
        return pacientes.get(cc);
    }

    public void agregarPaciente(modelopaciente paciente) {
        pacientes.put(paciente.getIdp(), paciente);
    }

    public void actualizarPaciente(modelopaciente paciente) {
        pacientes.put(paciente.getIdp(), paciente);
    }
    
    
    
    
}
