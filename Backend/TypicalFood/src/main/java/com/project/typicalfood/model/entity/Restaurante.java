package com.project.typicalfood.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lorep
 */
@Entity
@Table(name = "restaurante")
@NamedQueries({
    @NamedQuery(name = "Restaurante.findAll", query = "SELECT r FROM Restaurante r"),
    @NamedQuery(name = "Restaurante.findById", query = "SELECT r FROM Restaurante r WHERE r.id = :id"),
    @NamedQuery(name = "Restaurante.findByNombreRestaurante", query = "SELECT r FROM Restaurante r WHERE r.nombreRestaurante = :nombreRestaurante"),
    @NamedQuery(name = "Restaurante.findByDireccion", query = "SELECT r FROM Restaurante r WHERE r.direccion = :direccion"),
    @NamedQuery(name = "Restaurante.findByDepartamento", query = "SELECT r FROM Restaurante r WHERE r.departamento = :departamento"),
    @NamedQuery(name = "Restaurante.findByMunicipio", query = "SELECT r FROM Restaurante r WHERE r.municipio = :municipio"),
    @NamedQuery(name = "Restaurante.findByTelefono", query = "SELECT r FROM Restaurante r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Restaurante.findByCelular", query = "SELECT r FROM Restaurante r WHERE r.celular = :celular"),
    @NamedQuery(name = "Restaurante.findByImagen", query = "SELECT r FROM Restaurante r WHERE r.imagen = :imagen")})
public class Restaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nombre_restaurante")
    private String nombreRestaurante;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "celular")
    private String celular;

    @Column(name = "imagen")
    private String imagen;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private List<Platillo> platillos;


    public Restaurante() {
    }

    public Restaurante(Integer id) {
        this.id = id;
    }

    public Restaurante(Integer id, String nombreRestaurante, String direccion, String departamento, String municipio, String celular) {
        this.id = id;
        this.nombreRestaurante = nombreRestaurante;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.celular = celular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurante)) {
            return false;
        }
        Restaurante other = (Restaurante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", nombreRestaurante=" + nombreRestaurante + ", direccion=" + direccion + ", departamento=" + departamento + ", municipio=" + municipio + ", telefono=" + telefono + ", celular=" + celular + ", imagen=" + imagen + ", idUsuario=" + usuario + ", platilloList=" + platillos + '}';
    }

    
    
}
