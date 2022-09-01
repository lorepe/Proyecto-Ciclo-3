package beans;

public class Restaurante {

    /* Definimos las variables que hay de los campos de la base de datos */
    private int id;
    private int idusuario;
    private String nombre;
    private String direccion;
    private String departamento;
    private String municipio;
    private String telefono;
    private String celular;
    private String imagen;

    /* Metodo Constructor */
    public Restaurante(int id, int idusuario, String nombre, String direccion, String departamento, String municipio, String telefono, String celular, String imagen) {
        this.id = id;
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.telefono = telefono;
        this.celular = celular;
        this.imagen = imagen;
    }

    /* Getters y Setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /* toString */
    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", idusuario=" + idusuario + ", nombre=" + nombre + ", direccion=" + direccion + ", departamento=" + departamento + ", municipio=" + municipio + ", telefono=" + telefono + ", celular=" + celular + ", imagen=" + imagen + '}';
    }

}
