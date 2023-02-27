/** Esta clase define las calificaciones de los estudiantes.
* @author jose
* @version 22/02/2023
*/
public class Calificacion {
    private String asignatura;
    private int nota;

    /**
     * constructor de la clase Calificacion
     * @param asignatura
     * @param nota
     */
    public Calificacion(String asignatura, int nota){
        this.asignatura = asignatura;
        this.nota = nota;
    }

    /**
     * método para definir la asignatura de la calificación
     * @param asignatura el parámetro asignatura define la asignatura
     */
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    /**
     * método para definir la nota de calificación
     * @param nota el parámetro nota hace referencia a la nota de la asignatura.
     */
    public void setNota(int nota){
        this.nota = nota;
    }

    /**
     * método que devuelve la asignatura.
     * @return el nombre de la asignatura.
     */
    public String getAsignatura(){
        return asignatura;
    }

    /**
     * método que devuelve la nota.
     * @return la nota de una asignatura.
     */
    public int getNota(){
        return nota;
    }

    /**
     * método que calcula la media de las calificaciones.
     * @return la media de las calificaciones.
     */
    public double calcularMedia(){
        
    }
}
