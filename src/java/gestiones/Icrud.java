
package gestiones;

/**
 *
 * @author juane
 */

import java.util.List;
public interface Icrud<parametro> {
    public abstract void insertar(parametro p);
    public abstract void modificar(parametro p);
    public abstract void eliminar(parametro p);
    public abstract parametro consultaIndividual(parametro p);
    public abstract List<parametro> consultar();
}

