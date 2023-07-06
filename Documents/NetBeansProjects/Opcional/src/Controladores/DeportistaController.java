
package Controladores;

import Dao.DeportistaImplementsDAO;
import Modelos.Deportes;
import Modelos.Deportista;
import java.util.List;



public class DeportistaController {
   private DeportistaImplementsDAO model;

    public DeportistaController(DeportistaImplementsDAO DAO) {
        
    }

    public Deportista buscarDeportista(int identificacion) {
        return model.buscarDeportista(identificacion);
    }

    public void agregarDeposrtista(Deportista deportista) {
        model.agregarDeportista(deportista);
    }

    public void actualizarDeportista(Deportista deportista) {
        model.actualizarDeportista(deportista);
    }

    public List<Deportes> obtenerDeportes() {
        return model.obtenerDeportes();
    }

    public void agregarDeporte(Deportes deporte) {
        model.agregarDeporte(deporte);
    }
   
    
}
