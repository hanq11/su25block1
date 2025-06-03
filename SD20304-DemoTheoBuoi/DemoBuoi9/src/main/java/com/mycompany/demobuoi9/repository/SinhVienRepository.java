/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demobuoi9.repository;

import com.mycompany.demobuoi9.model.SinhVien;
import com.mycompany.demobuoi9.util.XJdbc;
import com.mycompany.demobuoi9.util.XQuery;
import java.util.List;

/**
 *
 * @author Syn
 */
public class SinhVienRepository {
    String selectAllSQL = "SELECT Id, Ten, Tuoi, GioiTinh FROM SinhVien";
    String createSQL = "INSERT INTO SinhVien (Ten, Tuoi, GioiTinh) VALUES (?, ?, ?)";
    String updateSQL = "UPDATE SinhVien SET Ten = ?, Tuoi = ?, GioiTinh = ? WHERE Id = ?";
    String deleteSQL = "DELETE FROM SinhVien WHERE Id = ?";
    
    public List<SinhVien> getAll() {
        return XQuery.getBeanList(SinhVien.class, selectAllSQL);
    }
    
    public void create(SinhVien sinhVien) {
        Object[] values = {
            sinhVien.getTen(),
            sinhVien.getTuoi(),
            sinhVien.getGioiTinh()
        };
        XJdbc.executeUpdate(createSQL, values);
    }
    
    public void update(SinhVien sinhVien) {
        Object[] values = {
            sinhVien.getTen(),
            sinhVien.getTuoi(),
            sinhVien.getGioiTinh(),
            sinhVien.getId()
        };
        XJdbc.executeUpdate(updateSQL, values);
    }
    
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSQL, id);
    }
}
