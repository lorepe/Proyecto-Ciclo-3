/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.typicalfood.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 *
 * @author lorep
 */
public interface ICrudService<T> {
    T findById(Integer id);
    T create(T t) throws UnsupportedEncodingException;
    void deleteById(Integer id);
    T update(T t);
    List<T> findAll();  
}
