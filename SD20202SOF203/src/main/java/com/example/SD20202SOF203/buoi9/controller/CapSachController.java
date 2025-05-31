package com.example.SD20202SOF203.buoi9.controller;

import com.example.SD20202SOF203.buoi9.repository.CapSachRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CapSachController", value = {
        "/buoi9/hien-thi"
})
public class CapSachController extends HttpServlet {
    CapSachRepository capSachRepository = new CapSachRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", capSachRepository.getAll());
        req.getRequestDispatcher("/views/buoi9/hien-thi.jsp").forward(req, resp);
    }
}
