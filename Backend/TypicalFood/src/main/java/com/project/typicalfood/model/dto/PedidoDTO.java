package com.project.typicalfood.model.dto;

import lombok.Data;

/**
 *
 * @author lorep
 */
@Data
public class PedidoDTO {
    
    private Integer id;
    private Integer cantidad;
    private Double valorTotal;
    private String tipoEntrega;
    private String direccion;
    private String estado;
    private PlatilloDTO platillo;
    private UsuarioDTO usuario;
}
