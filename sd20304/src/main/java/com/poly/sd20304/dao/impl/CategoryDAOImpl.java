/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sd20304.dao.impl;

import com.poly.sd20304.dao.CategoryDAO;
import com.poly.sd20304.entity.Category;
import com.poly.sd20304.util.XJdbc;
import com.poly.sd20304.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class CategoryDAOImpl implements CategoryDAO {

    String createSql = "INSERT INTO Categories(Id, Name) VALUES (?, ?)";
    String updateSql = "UPDATE Categories SET Name = ? WHERE Id = ?";
    String deleteSql = "DELETE FROM Categories WHERE Id = ?";
    String findAllSql = "SELECT * FROM Categories";
    String findByIdSql = "SELECT * FROM Categories WHERE Id = ?";
    
    @Override
    public Category create(Category entity) {
        Object[] values = {
            entity.getId(),
            entity.getName()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(Category entity) {
        Object[] values = {
            entity.getName(),
            entity.getId()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<Category> findAll() {
        return XQuery.getBeanList(Category.class, findAllSql);
    }

    @Override
    public Category findById(String id) {
        return XQuery.getSingleBean(Category.class, findByIdSql, id);
    }
    
    public static void main(String[] args) {
        CategoryDAO dao = new CategoryDAOImpl();
//        dao.create(new Category("3", "Nuoc giai khat"));
//        dao.update(new Category("3", "Nuoc uong"));
//        dao.deleteById("3");
        dao.findAll().forEach(cate -> System.out.println(cate));
        System.out.println("Test findById: " + dao.findById("C01"));
    }
}
