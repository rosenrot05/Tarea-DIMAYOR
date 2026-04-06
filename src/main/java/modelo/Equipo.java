
package modelo;

/**
 *
 * @author rosam
 */
public class Equipo {
    // atributos
    protected String nombre;
    protected int pg, pe, pp, pj;

    public Equipo(String nombre, int pg, int pe, int pp, int pj) {
        this.nombre = nombre;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.pj = pj;
    }

    // polimorfismo
    public int calcularPuntos() {
        return (pg * 3) + pe;
    }

    public String getNombre() {
        return nombre;
    }
}
    
