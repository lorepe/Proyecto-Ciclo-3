package com.project.typicalfood.repository;

import com.project.typicalfood.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lorep
 */
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer>{
    
}
