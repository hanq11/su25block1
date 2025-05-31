package com.example.SD20202SOF203.buoi9.repository;

import com.example.SD20202SOF203.buoi9.model.CapSach;
import com.example.SD20202SOF203.buoi9.util.DbConnection;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class CapSachRepository {
    private Connection conn = null;

    public CapSachRepository() {
        conn = DbConnection.getConnection();
    }

    public ArrayList<CapSach> getAll() {
        String sql = "SELECT * FROM CapSach";
        ArrayList<CapSach> danhSach = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while(rs.next()) {
                danhSach.add(new CapSach(
                        rs.getInt("id"),
                        rs.getString("ten"),
                        rs.getFloat("gia"),
                        rs.getBoolean("chong_nuoc")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return danhSach;
    }
}
