/**Esta clase define las empresas
 * @author jose
 * @version 27/02/2023
 */
public class Empresa {
    private String nombre, direccion, email;
    private int telefono;

    /**
     * constructor de la clase Empresa.
     * @param nombre el parámetro nombre define el nombre de la empresa.
     * @param direccion el parámetro direccion define la dirección de la empresa.
     * @param email el parámetro email define el email de la empresa.
     * @param telefono el parámetro telefono define el teléfono de la empresa.
     */
    public Empresa(String nombre, String direccion, String email, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * método que devuelve el nombre de la empresa.
     * @return el nombre de la empresa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * método para definir el nombre de la empresa.
     * @param nombre el parámetro nombre define el nombre de la empresa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * método que devuelve la dirección de la empresa.
     * @return la dirección de la empresa.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * método para definir la dirección de la empresa.
     * @param direccion el parámetro direccion define la dirección de la empresa.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * método que devuelve el email de la empresa.
     * @return el email de la empresa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * método para definir el email de la empresa.
     * @param email el parámetro email define el email de la empresa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * método que devuelve el teléfono de la empresa.
     * @return el teléfono de la empresa.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * método para definir el teléfono de la empresa.
     * @param telefono el parámetro telefono define el teléfono de la empresa.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
