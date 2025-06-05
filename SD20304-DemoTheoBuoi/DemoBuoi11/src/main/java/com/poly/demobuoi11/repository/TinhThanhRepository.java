/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.demobuoi11.repository;

import com.poly.demobuoi11.model.TinhThanh;
import com.poly.demobuoi11.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class TinhThanhRepository {
    String getAllSQL = "SELECT id, ten FROM TinhThanh";
    
    public List<TinhThanh> getAll() {
        return XQuery.getBeanList(TinhThanh.class, getAllSQL);
    }
}
