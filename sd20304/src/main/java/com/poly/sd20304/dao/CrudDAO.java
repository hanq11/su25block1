/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sd20304.dao;

import java.util.List;

/**
 *
 * @author lovep
 */
public interface CrudDAO<T, ID> {
    T create(T entity);
    
    void update(T entity);
    
    void deleteById(ID id);
    
    List<T> findAll();
    
    T findById(ID id);
}
