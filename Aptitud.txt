/** Esta clase define las aptitudes de los estudiantes.
 * @author jose
 * @version 22/02/2023
 */
public class Aptitud{
    private String nombreAptitud;
    private int nivelAptitud;

    /**
     * constructor de la clase Aptitud
     * @param nombreAptitud
     * @param nivelAptitud
     */
    public Aptitud(String nombreAptitud, int nivelAptitud){
        this.nombreAptitud = nombreAptitud;
        this.nivelAptitud = nivelAptitud;
    }

    /**
     * método para poner el nombre a la aptitud
     * @param nombreAptitud el parámetro nombreAptitud define el nombre de la aptitud.
     */
    public void setNombre(String nombreAptitud){
        this.nombreAptitud = nombreAptitud;
    }

    /**
     * método para poner el nivel de la aptitud
     * @param nivelAptitud el parámetro nombreAptitud define el nivel de aptitud (numero entero positivo).
     */
    public void setNivel(int nivelAptitud){
        this.nivelAptitud = nivelAptitud;
    }

    /**
     * método que devuelve el nombre de la aptitud
     * @return el nombre de la aptitud
     */
    public String getNombre(){
        return nombreAptitud;
    }

    /**
     * método que devuelve el nivel de la aptitud
     * @return el nivel de la aptitud
     */
    public int getNivel(){
        return nivelAptitud;
    }
}