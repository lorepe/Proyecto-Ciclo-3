/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

/**
 *
 * @author lorep
 */
public class Vendedor extends Usuario{

    public Vendedor() {
    }

    public Vendedor(Integer id, String tipo_documento, String documento, String nombres, String apellidos, String email, String celular, String contraseña) {
        super(id, tipo_documento, documento, nombres, apellidos, email, celular, contraseña);
    }
    
}
