/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 
package Dao;

import Modelos.Deportes;
import Modelos.Deportista;
import java.util.List;

/**
 *
 * @author ASUS
 */

public interface DeportistaDAO {
    List<Deportes> obtenerTodosLosDeportes();
    List<Deportista> obtenerTodosLosDeportistas();
    Deportista buscarDeportista(int identificacion);
    void agregarDeportista(Deportista deportista);
    void actualizarDeportista(Deportista deportista);
    List<Deportes> obtenerDeportes();
    void agregarDeporte(Deportes deporte);
    boolean existeDeportista(int identificacion);
    void eliminarDeportista(int identificacion);

}