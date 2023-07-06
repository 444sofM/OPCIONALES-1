/*
Estudiante :Ana Mezu-2225958
Opcional 1 
Profesor :Luis Romo*/
package DAO;

import Model.Deportes;
import Model.Deportista;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DeportistaImplementsDAO{
    private Map<Integer, Deportista> deportistas;
    private List<Deportes> deportes;

    public DeportistaImplementsDAO() {
        deportistas = new HashMap<>();
        deportes = new ArrayList<>();
        // Agregar alergias base
        Deportes deporte1 = new Deportes("Futbol");
        agregarDeporte(deporte1);

        Deportes deporte2 = new Deportes("natacion");
        agregarDeporte(deporte2);
        
        Deportes deporte3 = new Deportes("Baloncesto");
        agregarDeporte(deporte3);
        
        Deportes deporte4 = new Deportes("Tenis");
        agregarDeporte(deporte4);
        
        Deportes deporte5 = new Deportes("Ciclismo");
        agregarDeporte(deporte5);
    }
    
    public List<Deportes> obtenerTodasLoDeporteses() {
    return deportes;
    }

    public Deportista buscarDeportista(int identificacion) {
        return deportistas.get(identificacion);
    }

    public void agregarDeportista(Deportista deportista) {
        deportistas.put(deportista.getIdentificacion(), deportista);
    }


    public void actualizarDeportista(Deportista deportista) {
        deportistas.put(deportista.getIdentificacion(), deportista);
    }
    
    public List<Deportes> obtenerDeportes() {
        return deportes;
    }
    
    public void agregarDeporte(Deportes deporte) {
        deportes.add(deporte);
    }
}
