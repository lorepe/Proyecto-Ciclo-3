package beans;

public class Pedido {

    /* Definimos las variables que hay de los campos de la base de datos */
    private int id;
    private int idusuario;
    private int idplatillo;
    private int cantidad;
    private int valortotal;
    private String tipoentrega;
    private String direccion;
    private boolean estado;

    /* Metodo Constructor */
    public Pedido(int id, int idusuario, int idplatillo, int cantidad, int valortotal, String tipoentrega, String direccion, boolean estado) {
        this.id = id;
        this.idusuario = idusuario;
        this.idplatillo = idplatillo;
        this.cantidad = cantidad;
        this.valortotal = valortotal;
        this.tipoentrega = tipoentrega;
        this.direccion = direccion;
        this.estado = estado;
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

    public int getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(int idplatillo) {
        this.idplatillo = idplatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    public String getTipoentrega() {
        return tipoentrega;
    }

    public void setTipoentrega(String tipoentrega) {
        this.tipoentrega = tipoentrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /* toString */
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", idusuario=" + idusuario + ", idplatillo=" + idplatillo + ", cantidad=" + cantidad + ", valortotal=" + valortotal + ", tipoentrega=" + tipoentrega + ", direccion=" + direccion + ", estado=" + estado + '}';
    }

}
