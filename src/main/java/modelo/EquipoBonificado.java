
package modelo;

/**
 *
 * @author rosam
 */
public class EquipoBonificado extends Equipo {
    
    // Herencia
    private int bono;

    public EquipoBonificado(String nombre, int pg, int pe, int pp, int pj, int bono) {
        super(nombre, pg, pe, pp, pj);
        this.bono = bono;
    }

    // Polimorfismo
    @Override
    public int calcularPuntos() {
        return super.calcularPuntos() + bono;
    }
}

