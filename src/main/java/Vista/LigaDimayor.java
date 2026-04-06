
package Vista;

/**
 *
 * @author rosam
 */

import modelo.Equipo;
import modelo.EquipoBonificado;
import controlador.LigaController;

public class LigaDimayor {
        public static void main(String[] args) {

        System.out.println("--- LIGA DIMAYOR ---");

        LigaController control = new LigaController();

        // POLIMORFISMO
        control.registrar(new Equipo("America", 10, 5, 2, 17));
        control.registrar(new Equipo("Nacional", 8, 6, 3, 17));
        control.registrar(new EquipoBonificado("Junior", 9, 4, 4, 17, 3));

        System.out.println("--- LISTA DE EQUIPOS ---");

        for (Equipo e : control.obtenerLista()) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Puntos: " + e.calcularPuntos());
            System.out.println("----------------------");
        }

        // mayor puntaje
        System.out.println("Mayor puntaje: " + control.mayorPuntaje());

        // cuantos tienen mayor puntaje
        System.out.println("Equipos con mayor puntaje: " + control.contarMayor());

        // sobrecarga
        System.out.println("--- BUSQUEDA ---");

        Equipo e1 = control.buscar("America");
        Equipo e2 = control.buscar(1);

        System.out.println("Buscar por nombre: " + (e1 != null ? e1.getNombre() : "No existe"));
        System.out.println("Buscar por indice: " + (e2 != null ? e2.getNombre() : "No existe"));
    }
}
