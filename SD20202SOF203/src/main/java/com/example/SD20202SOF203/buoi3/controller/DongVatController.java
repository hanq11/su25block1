package com.example.SD20202SOF203.buoi3.controller;

import com.example.SD20202SOF203.buoi3.model.DongVat;
import com.example.SD20202SOF203.buoi3.service.DongVatService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DongVatController", value = {
        "/buoi3/hien-thi" //GET
})
public class DongVatController extends HttpServlet {
    DongVatService dongVatService = new DongVatService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", dongVatService.getAll());
        req.getRequestDispatcher("/views/buoi3/hien-thi.jsp").forward(req, resp);
    }
}
