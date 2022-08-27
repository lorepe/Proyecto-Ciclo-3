/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typicalfood.model;

/**
 *
 * @author lorep
 */
public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Platillo platillo;
    private Integer cantidad;
    private Double valor_total;
    private String tipo_entrega;

    public Pedido() {
    }

    public Pedido(Integer id, Cliente cliente, Platillo platillo, Integer cantidad, Double valor_total, String tipo_entrega) {
        this.id = id;
        this.cliente = cliente;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.valor_total = valor_total;
        this.tipo_entrega = tipo_entrega;
    }
    
    
}
