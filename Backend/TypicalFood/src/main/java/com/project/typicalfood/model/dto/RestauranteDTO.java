package com.project.typicalfood.model.dto;

import com.project.typicalfood.model.entity.Platillo;
import com.project.typicalfood.model.entity.Usuario;
import java.util.List;
import lombok.Data;


/**
 *
 * @author lorep
 */
@Data
public class RestauranteDTO {
    
    private Integer id;
    private String nombreRestaurante;
    private String direccion;
    private String departamento;
    private String municipio;
    private String telefono;
    private String celular;
    private String imagen;
    private UsuarioDTO usuario;
    private List<PlatilloDTO> platillos;

}
