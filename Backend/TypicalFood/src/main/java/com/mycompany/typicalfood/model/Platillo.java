/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

import java.util.List;

/**
 *
 * @author lorep
 */
public class Platillo {
    private Integer id;
    private Restaurante restaurante;
    private Categoria categoria;
    private String nombre_platillo;
    private String descripcion;
    private Double valor;
    private Double califacion;
    private List<Resenia> resenias; 

    public Platillo() {
    }

    public Platillo(Integer id, Restaurante restaurante, Categoria categoria, String nombre_platillo, String descripcion, Double valor, Double califacion, List<Resenia> resenias) {
        this.id = id;
        this.restaurante = restaurante;
        this.categoria = categoria;
        this.nombre_platillo = nombre_platillo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.califacion = califacion;
        this.resenias = resenias;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre_platillo() {
        return nombre_platillo;
    }

    public void setNombre_platillo(String nombre_platillo) {
        this.nombre_platillo = nombre_platillo;
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

    public Double getCalifacion() {
        return califacion;
    }

    public void setCalifacion(Double califacion) {
        this.califacion = califacion;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(List<Resenia> resenias) {
        this.resenias = resenias;
    }
    
    
}
