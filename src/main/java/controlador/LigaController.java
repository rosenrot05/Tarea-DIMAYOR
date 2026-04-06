
package controlador;

/**
 *
 * @author rosam
 */

import modelo.Equipo;
import java.util.ArrayList;

public class LigaController {
        private ArrayList<Equipo> listaEquipos;

    public LigaController() {
        listaEquipos = new ArrayList<>();
    }

    // registrar equipos
    public void registrar(Equipo e) {
        listaEquipos.add(e);
    }

    // sobrecarga: buscar por nombre
    public Equipo buscar(String nombre) {
        for (Equipo e : listaEquipos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    // sobrecarga: buscar por índice
    public Equipo buscar(int index) {
        if (index >= 0 && index < listaEquipos.size()) {
            return listaEquipos.get(index);
        }
        return null;
    }

    public ArrayList<Equipo> obtenerLista() {
        return listaEquipos;
    }

    // mayor puntaje
    public int mayorPuntaje() {
        int mayor = 0;
        for (Equipo e : listaEquipos) {
            if (e.calcularPuntos() > mayor) {
                mayor = e.calcularPuntos();
            }
        }
        return mayor;
    }

    // cuantos equipos tienen el mayor puntaje
    public int contarMayor() {
        int mayor = mayorPuntaje();
        int contador = 0;

        for (Equipo e : listaEquipos) {
            if (e.calcularPuntos() == mayor) {
                contador++;
            }
        }
        return contador;
    }
}
