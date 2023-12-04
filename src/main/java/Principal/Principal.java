// Paquete principal
package Principal;

import Controller.UniversidadController;
import model.Universidad;
import ventana.VentanaMenuBienvenida;

public class Principal {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        UniversidadController controller = new UniversidadController(universidad);
        new VentanaMenuBienvenida(universidad);
    }
}


