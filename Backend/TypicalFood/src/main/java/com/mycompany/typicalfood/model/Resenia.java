/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

import java.util.Date;

/**
 *
 * @author lorep
 */
public class Resenia {
    
    private Integer id;
    private String descripcion;
    private Double calificacion;
    private Date fecha;
    
    public Resenia() {
    }

    public Resenia(Integer id, String descripcion, Double calificacion, Date fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }
    
    
    
}
