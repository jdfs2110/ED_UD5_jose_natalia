/** Esta clase sirve para crear una oferta de empleo
 * @author Natalia
 * @version 27/02/2023
 */
public class OfertaEmpleo {
    private double minCalificacion;
    private String minAptitud;
    private double minAfinidad;
    private String nombreEmpresa;
    private String nombrePuesto;
    private String descripcion;
    /**
     * Este constructor sirve para crear una oferta de empleo
     * @param minCalificacion
     * @param minAptitud
     * @param minAfinidad
     */
    public OfertaEmpleo(double minCalificacion, String minAptitud, double minAfinidad, String nombreEmpresa, String nombrePuesto, String descripcion) {
        this.minCalificacion = minCalificacion;
        this.minAptitud = minAptitud;
        this.minAfinidad = minAfinidad;
        this.nombreEmpresa = nombreEmpresa;
        this.nombrePuesto = nombrePuesto;
        this.descripcion = descripcion;
    }
    /**
     * Este método sirve para establecer la media mínima para la oferta de empleo
     * @param minAptitud
     */
    public void setMinCalificacion(){
        this.minCalificacion = minCalificacion;
    }
    /**
     * Este método sirve para obtener la calificación mínima que se pide en la oferta de empleo
     * @return minCalificacion
     */
    public double getMinCalificacion() {
        return minCalificacion;
    }
    /**
     * Este método sirve para establecer la aptitud mínima para la oferta de empleo
     * @param minAptitud
     */
    public void setMinAptitud(){
        this.minAptitud = minAptitud;
    }
    /**
     * Este método sirve para obtener la aptitud mínima que se pide en la oferta de empleo
     * @return minAptitud
     */
    public String getMinAptitud() {
        return minAptitud;
    }
    /**
     * Este método sirve para establecer la afinidad mínima para la oferta de empleo
     * @param minAfinidad
     */
    public void setMinAfinidad(){
        this.minAfinidad = minAfinidad;
    }
    /**
     * Este método sirve para obtener la afinidad mínima que se pide en la oferta de empleo
     * @return minAfinidad
     */
    public double getMinAfinidad() {
        return minAfinidad;
    }
    /**
     * Este método sirve para establecer el nombre de la empresa hace la oferta
     * @param nombreEmpresa
     */
    public void setNombreEmpresa(){
        this.nombreEmpresa = nombreEmpresa;
    }
    /**
     * Este método sirve para obtener el nombre de la empresa que hace la oferta
     * @return nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    /**
     * Este método sirve para establecer el nombre del puesto de la oferta
     * @param nombrePuesto
     */
    public void setNombrePuesto(){
        this.nombrePuesto = nombrePuesto;
    }
    /**
     * Este método sirve para obtener el nombre del puesto de la oferta
     * @return nombrePuesto
     */
    public String getNombrePuesto() {
        return nombrePuesto;
    }
    /**
     * Este método sirve para establecer la descripción de la oferta
     * @param descripcion
     */
    public void setDescripcion(){
        this.descripcion = descripcion;
    }
    /**
     * Este método sirve para obtener la descripción de la oferta
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
}
