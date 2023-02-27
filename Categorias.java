/** Esta clase define las categorías de las aptitudes.
 * @author jose
 * @version 27/02/2023
 */
public class Categorias{
    private int id;
    private String tipo;

    /**
     * constructor de la clase Categorias.
     * @param id
     * @param tipo
     */
    public Categorias(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    /**
     * método que devuelve el tipo de categoría.
     * @return el tipo de categoría.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * método para definir el tipo de categoría.
     * @param tipo el parámetro tipo define el tipo de categoría.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * método que devuelve el id de la categoría.
     * @return el id de la categoría.
     */
    public int getId() {
        return id;
    }

    /**
     * método para definir el id de la categoría.
     * @param id el parámetro id define el id de la categoría.
     */
    public void setId(int id) {
        this.id = id;
    }
}