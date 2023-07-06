
package Main;

import Dao.DeportistaImplementsDAO;
import Vistas.CompetenciaView;


public class Opcional {

   
    public static void main(String[] args) {
        CompetenciaView competencia = new CompetenciaView(new DeportistaImplementsDAO());
        competencia.setVisible(true);
    }
    
}
