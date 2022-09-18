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
@Table(name = "platillo")
@NamedQueries({
    @NamedQuery(name = "Platillo.findAll", query = "SELECT p FROM Platillo p"),
    @NamedQuery(name = "Platillo.findById", query = "SELECT p FROM Platillo p WHERE p.id = :id"),
    @NamedQuery(name = "Platillo.findByNombrePlatillo", query = "SELECT p FROM Platillo p WHERE p.nombrePlatillo = :nombrePlatillo"),
    @NamedQuery(name = "Platillo.findByDescripcion", query = "SELECT p FROM Platillo p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Platillo.findByValor", query = "SELECT p FROM Platillo p WHERE p.valor = :valor"),
    @NamedQuery(name = "Platillo.findByImagen", query = "SELECT p FROM Platillo p WHERE p.imagen = :imagen")})
public class Platillo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre_platillo")
    private String nombrePlatillo;

    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "valor")
    private Double valor;

    @Column(name = "imagen")
    private String imagen;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platillo")
    private List<Pedido> pedidos;

    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categoria categoria;

    @JoinColumn(name = "id_restaurante", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Restaurante restaurante;

    public Platillo() {
    }

    public Platillo(Integer id) {
        this.id = id;
    }

    public Platillo(Integer id, String nombrePlatillo) {
        this.id = id;
        this.nombrePlatillo = nombrePlatillo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
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
        if (!(object instanceof Platillo)) {
            return false;
        }
        Platillo other = (Platillo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Platillo{" + "id=" + id + ", nombrePlatillo=" + nombrePlatillo + ", descripcion=" + descripcion + ", valor=" + valor + ", imagen=" + imagen + ", pedidoList=" + pedidos + ", idCategoria=" + categoria + ", idRestaurante=" + restaurante + '}';
    }

}
