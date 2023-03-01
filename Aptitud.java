/** Esta clase define las aptitudes de los estudiantes.
 * @author jose
 * @version 01/03/2023
 */
public class Aptitud {
    private String nombreAptitud;
    private int nivelAptitud;

    /**
     * Constructor de la clase Aptitud
     * @param nombreAptitud nombre de la aptitud
     * @param nivelAptitud nivel de la aptitud
     */
    public Aptitud(String nombreAptitud, int nivelAptitud) {
        this.nombreAptitud = nombreAptitud;
        this.nivelAptitud = nivelAptitud;
    }

    /**
     * Metodo para modificar el nombre de la aptitud
     * @param nombreAptitud nombre de la aptitud
     */
    public void setNombreAptitud(String nombreAptitud) {
        this.nombreAptitud = nombreAptitud;
    }

    /**
     * Metodo que devuelve el nivel de la aptitud
     * @return nombre de la aptitud
     */
    public String getNombreAptitud() {
        return nombreAptitud;
    }

    /**
     * Metodo para modificar el nivel de la aptitud
     * @param nivelAptitud nivel de la aptitud
     */
    public void setNivelAptitud(int nivelAptitud) {
        this.nivelAptitud = nivelAptitud;
    }

    /**
     * Metodo que devuelve el nivel de la aptitud
     * @return nivel de la aptitud
     */
    public int getNivelAptitud() {
        return nivelAptitud;
    }
}