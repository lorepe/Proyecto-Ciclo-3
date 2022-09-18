package com.project.typicalfood.model.dto;

import java.util.List;
import lombok.Data;
/**
 *
 * @author lorep
 */
@Data
public class UsuarioDTO {

    private Integer id;
    private String tipoDocumento;
    private String documento;
    private String nombres;
    private String apellidos;
    private String email;
    private String celular;
    private String contrasena;
    private String rol;
    private List<RestauranteDTO> restaurantes;
    private List<PedidoDTO> pedidos;

}
