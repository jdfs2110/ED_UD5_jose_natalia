/** Esta clase sirve para crear un estudiante
 * @author Natalia
 * @version 27/02/2023
 */
import java.util.ArrayList;

public class Estudiante extends Persona {
    private int nia;
    protected ArrayList<Aptitud> aptitudes = new ArrayList<Aptitud>();
    protected ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
    /**
     * Este constructor sirve para crear un estudiante
     * @param nombre
     * @param apellidos
     * @param email
     * @param fechaNacimiento
     * @param nia
     */
    public Estudiante(String nombre, String apellidos, String email, String fechaNacimiento, int nia) {
        super(nombre, apellidos, email, fechaNacimiento);
        this.nia = nia;
    }
    
}
