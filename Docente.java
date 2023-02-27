/** Esta clase sirve para crear un docente
 * @author Natalia
 * @version 27/02/2023
 */
public class Docente extends Persona {
    private String dni;
    /**
     * Este constructor sirve para crear un docente
     * @param nombre
     * @param apellidos
     * @param email
     * @param fechaNacimiento
     * @param dni
     */
    public Docente(String nombre, String apellidos, String email, String fechaNacimiento, String dni) {
        super(nombre, apellidos, email, fechaNacimiento);
        this.dni = dni;
    }
    /**
     * Este método sirve para establecer el dni del docente
     * @param dni
     */
    public void setDni(String dni){
        this.dni=dni;
    }
    /**
     * Este método sirve para obtener el dni del docente
     * @return dni del docente
     */
    public String getDni(){
        return dni;
    }
    /**
     * Este método sirve para comprobar si el dni es correcto
     * @return true si el dni es correcto, false si no lo es
     */
    public boolean dniOk(String dni){
        return dni.matches("[0-9]{8}[A-Z]");
    }
    
}
