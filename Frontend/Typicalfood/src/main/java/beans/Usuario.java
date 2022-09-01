
package beans;


public class Usuario {
    
    /* Definimos las variables que hay de los campos de la base de datos */
    private int id;
    private String documento;
    private String tipodoc;
    private String nombres;
    private String apellidos;
    private String email;
    private String celular;
    private String contrasena;
    private String rol;

    
    /* Metodo Constructor */
    public Usuario(int id, String documento, String tipodoc, String nombres, String apellidos, String email, String celular, String contrasena, String rol) {
        this.id = id;
        this.documento = documento;
        this.tipodoc = tipodoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    
     /* Getters y Setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    /* toString */
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", documento=" + documento + ", tipodoc=" + tipodoc + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", celular=" + celular + ", contrasena=" + contrasena + ", rol=" + rol + '}';
    }
    
    
}
