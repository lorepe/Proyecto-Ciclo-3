/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lorep
 */
public class Restaurante {
    private Integer id;
    private Usuario usuario;
    private String nombre_restaurante;
    private String direccion;
    private String departamento;
    private String municipio;
    private String telefono;
    private String celular;
    private Integer calificacion;
    private List<Resenia> resenias = new ArrayList<>() ;
    
    public Restaurante() {
    }

    public Restaurante(Integer id, Usuario usuario, String nombre_restaurante, String direccion, String departamento, String municipio, String telefono, String celular, Integer calificacion, List<Resenia> resenias) {
        this.id = id;
        this.usuario = usuario;
        this.nombre_restaurante = nombre_restaurante;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.telefono = telefono;
        this.celular = celular;
        this.calificacion = calificacion;
        this.resenias = resenias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) {
        this.nombre_restaurante = nombre_restaurante;
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

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public List<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(Resenia resenia) {
        this.resenias.add(resenia);
    }
    
    
    
    

    
    
        
}
