import java.util.ArrayList;

public class Estudiante extends Persona {
    private int nia;
    private ArrayList<Aptitud> aptitudes = new ArrayList<Aptitud>();
    private ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
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
