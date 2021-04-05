
package clases;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private List<habitacion> habitaciones;
    private String fecha_reserva;

    public cliente() {
    }

    public cliente(String cedula, String nombre, String apellido, List<habitacion> habitaciones, String fecha_reserva) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habitaciones = habitaciones;
        this.fecha_reserva = fecha_reserva;
    }

   
    
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the habitaciones
     */
    public List<habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(List<habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * @return the fecha_reserva
     */
    public String getFecha_reserva() {
        return fecha_reserva;
    }

    /**
     * @param fecha_reserva the fecha_reserva to set
     */
    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
}
