package com.project.typicalfood.model.dto;

import com.project.typicalfood.model.entity.Platillo;
import java.util.List;
import lombok.Data;

/**
 *
 * @author lorep
 */
@Data
public class CategoriaDTO {
 
    private Integer id;
    private String nombre;
    private String descripcion;
    private List<PlatilloDTO> platillos;
}
