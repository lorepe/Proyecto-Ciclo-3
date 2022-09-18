package com.project.typicalfood.model.dto;

import java.util.List;
import lombok.Data;

/**
 *
 * @author lorep
 */
@Data
public class PlatilloDTO {
    
    private Integer id;
    private String nombrePlatillo;
    private String descripcion;
    private Double valor;
    private String imagen;
    private List<PedidoDTO> pedidos;
    private CategoriaDTO categoria;
    private RestauranteDTO restaurante;
}
