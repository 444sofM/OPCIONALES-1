/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.modelo;
import VISTAS.VentanaPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;


/**
 *
 * @author Usuario
 */
public class controladorPaciente {
    private HashMap<String,Object > coleccionPaciente;
    private JComboBox<String> boxAlergiasp;
    private JTextField nombrep;
    private JTextField apellidop;
    private JTextField idp;
    private JTextField direccion;
    private JTextField telefono;
    private static VentanaPaciente VISTAS;
    private  modelo MODELO;
    private JTextArea listAlergias;
 
    /**
     *
     * @param MODELO   
     * @param VISTAS   
     */
    public controladorPaciente( modelo MODELO,VentanaPaciente VISTAS){
        controladorPaciente.VISTAS=VISTAS;
        this.MODELO=MODELO;
        this.coleccionPaciente=(HashMap<String, Object>) modelo.getColeccionPaciente();
        this.boxAlergiasp=controladorPaciente.VISTAS.getboxAlergias();
        this.nombrep= controladorPaciente.VISTAS.getnombrep();
        this.idp=controladorPaciente.VISTAS.getidp();
        this.direccion=controladorPaciente.VISTAS.getdireccion();
        this.telefono=controladorPaciente.VISTAS.gettelefono();
        this.apellidop=controladorPaciente.VISTAS.getapellidop();
        this.listAlergias=controladorPaciente.VISTAS.getlistAlergias();
        
        
        
        
      //this.Vista.addBotonAceptarListener(new CalculateListener());
}
    class CalculateListener implements ActionListener{
         String palabra; //Palabra concatenada
         String nombrep;
         String apellidop;
         String direccion;
         String boxAlergias;// 
         String idp;//tificación
         String telefono;
                                   
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                
                
            
                palabra =boxAlergias +""+nombrep+""+apellidop+""+telefono+""+direccion;
                coleccionPaciente.put(idp,palabra);
              
             
           

                StringBuilder stringBuilder = new StringBuilder();
                
                for (String key : coleccionPaciente.keySet()){
                    stringBuilder.append(key).append(": ").append(coleccionPaciente.get(key)).append("\n"); 
                }
                String elements = stringBuilder.toString();
                
                listAlergias.setText(elements);
            }   
         

            }}
        
    
    public static void mostrar(){
        VISTAS.setVisible(true);
        VISTAS.setLocationRelativeTo(null);}}

       