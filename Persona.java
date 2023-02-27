/**
 * @author Natalia
 * @version 27/02/2023
 */
public class Persona {
    private String nombre, apellidos, email, fechaNacimiento;

    /**
     * Este contructor sirve para crear una persona
     * @param nombre
     * @param apellidos
     * @param email
     * @param fechaNacimiento
     */
    public Persona(String nombre, String apellidos, String email, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Este método sirve para establecer el nombre de la persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Este método sirve para obtener el nombre de la persona
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Este método sirve para establecer los apellidos de la persona
     * @param apellidos
     */
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    /**
     * Este método sirve para obtener los apellidos de la persona
     * @return apellidos de la persona
     */
    public String getApellidos(){
        return apellidos;
    }
    /**
     * Este método sirve para establecer el email de la persona
     * @param email
     */
    public void setEmail(String email){
        this.email=email;
    }
    /**
     * Este método sirve para obtener el email de la persona
     * @return email de la persona
     */
    public String getEmail(){
        return email;
    }
    /**
     * Este método sirve para establecer la fecha de nacimiento de la persona
     * @param fecha
     */
    public void setFechaNac(String fecha){
        this.fechaNacimiento=fecha;
    }
    /**
     * Este método sirve para obtener la fecha de nacimiento de la persona
     * @return fecha de nacimiento de la persona
     */
    public String getFechaNac(){
        return fechaNacimiento;
    }
}
