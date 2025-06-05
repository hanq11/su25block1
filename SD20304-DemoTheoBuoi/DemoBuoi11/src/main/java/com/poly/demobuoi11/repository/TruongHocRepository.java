/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.demobuoi11.repository;

import com.poly.demobuoi11.model.TruongHoc;
import com.poly.demobuoi11.model.TruongHocResponse;
import com.poly.demobuoi11.util.XJdbc;
import com.poly.demobuoi11.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class TruongHocRepository {
    String getAllSQL = """
                        SELECT th.id, th.ten, th.tuoi, tt.ten AS 'TinhThanh'
                        FROM TruongHoc th
                        LEFT JOIN TinhThanh tt ON th.idTinhThanh = tt.id
                       """;
    String insertSQL = """
                        INSERT INTO TruongHoc
                            (ten, tuoi, idTinhThanh)
                        VALUES
                            (?, ?, ?)
                       """;
    String updateSQL = """
                        UPDATE TruongHoc
                        SET 
                            ten = ?, tuoi = ?, idTinhThanh = ?
                        WHERE id = ?
                       """;
    String deleteSQL = "DELETE FROM TruongHoc WHERE id = ?";
    
    public List<TruongHocResponse> getAll() {
        return XQuery.getBeanList(TruongHocResponse.class, getAllSQL);
    }
    
    public void insert(TruongHoc th) {
        Object[] values = {
            th.getTen(),
            th.getTuoi(),
            th.getIdTinhThanh()
        };
        XJdbc.executeUpdate(insertSQL, values);
    }
    
    public void update(TruongHoc th) {
        Object[] values = {
            th.getTen(),
            th.getTuoi(),
            th.getIdTinhThanh(),
            th.getId()
        };
        XJdbc.executeUpdate(updateSQL, values);
    }
    
    public void delete(Integer id) {
        XJdbc.executeUpdate(deleteSQL, id);
    }
}
