/** Esta clase sirve para crear una recomendación de estudiante para una oferta de empleo
 * @author Natalia
 * @version 27/02/2023
 */
public class Recomendacion {
    private Calificacion calificaciones;
    private double minMedia;
    private String minAptitud;
    private double minAfinidad;
    private double afinidad;
    private double media;
    /**
     * Este constructor sirve para crear una recomendación con los datos del estudiante, aunque sin nombre ni datos personales ya que es anónimo
     * @param aptitudes
     * @param calificaciones
     * @param minCalificacion
     * @param minAptitud
     * @param minAfinidad
     * @param afinidad
     */
    public Recomendacion(Calificacion calificaciones, double minCalificacion, String minAptitud, double minAfinidad, double afinidad) {
        this.calificaciones = calificaciones;
        this.minMedia = minCalificacion;
        this.minAptitud = minAptitud;
        this.minAfinidad = minAfinidad;
        this.afinidad = afinidad;
    }
        /**
     * Este método sirve para calcular la afinidad del estudiante recomendado
     * @return afinidad
     */
    public double calcAfinidad() {
        return afinidad;
    }
    /**
     * Este método sirve para obtener la media de calificaciones del estudiante recomendado
     * @return media calificaciones
     */
    public double getMedia() {
        return media;
    }
    /**
     * Este método sirve para obtener las media mínima que se pide en la oferta de empleo
     * @return la media minima
     */
    public double getMinMedia() {
        return minMedia;
    }
    /**
     * Este método sirve para obtener la afinidad mínima que se pide en la oferta de empleo
     * @return la afinidad minima
     */
    public double getMinAfinidad() {
        return minAfinidad;
    }

}
