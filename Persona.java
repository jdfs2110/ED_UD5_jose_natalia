public class Persona {
    private String nombre, apellidos, email, fechaNacimiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setFechaNac(String fecha){
        this.fechaNacimiento=fecha;
    }
    public String getFechaNac(){
        return fechaNacimiento;
    }
}
