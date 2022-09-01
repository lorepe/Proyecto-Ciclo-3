package beans;

public class Platillo {

    /* Definimos las variables que hay de los campos de la base de datos */
    private int id;
    private int idrestaurante;
    private int idcategoria;
    private String nombre;
    private String descripcion;
    private int valor;
    private String imagen;


    /* Metodo Constructor */
    public Platillo(int id, int idrestaurante, int idcategoria, String nombre, String descripcion, int valor, String imagen) {
        this.id = id;
        this.idrestaurante = idrestaurante;
        this.idcategoria = idcategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.imagen = imagen;
    }

    /* toString */
    @Override
    public String toString() {
        return "Platillo{" + "id=" + id + ", idrestaurante=" + idrestaurante + ", idcategoria=" + idcategoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", valor=" + valor + ", imagen=" + imagen + '}';
    }

}
