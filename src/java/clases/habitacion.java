package clases;

import java.util.Date;
public class habitacion {
    private Integer numero;
    private Integer piso;
    private String tipo;
    private Float precio;
    private String fecha_entrada;
    private String fecha_salida;

    public habitacion() {
    }

    public habitacion(Integer numero, Integer piso, String tipo, Float precio, String fecha_entrada, String fecha_salida) {
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
        this.precio = precio;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }

  
    
    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the piso
     */
    public Integer getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the fecha_entrada
     */
    public String getFecha_entrada() {
        return fecha_entrada;
    }

    /**
     * @param fecha_entrada the fecha_entrada to set
     */
    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    /**
     * @return the fecha_salida
     */
    public String getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
