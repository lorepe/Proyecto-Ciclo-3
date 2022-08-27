/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

/**
 *
 * @author lorep
 */
public class Categoria {
    private Integer id ;
    private String nombre;
    private String descripcion;
    private Platillo platillo;
    public Categoria() {
    }

    public Categoria(Integer id, String nombre, String descripcion, Platillo platillo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.platillo = platillo;
    }
    
    
    
}
