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
        "/buoi3/hien-thi", //GET
        "/buoi3/them", //POST
        "/buoi3/sua" //GET, POST
})
public class DongVatController extends HttpServlet {
    DongVatService dongVatService = new DongVatService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        } else if(uri.contains("sua")) {
            viewUpdate(req, resp);
        }
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        DongVat dv = dongVatService.chiTiet(id);
        req.setAttribute("dongVat", dv);
        req.getRequestDispatcher("/views/buoi3/sua.jsp").forward(req, resp);
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", dongVatService.getAll());
        req.getRequestDispatcher("/views/buoi3/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("them")) {
            them(req, resp);
        } else if(uri.contains("sua")) {
            sua(req, resp);
        }
    }

    private void sua(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));
        Float giaTien = Float.valueOf(req.getParameter("giaTien"));

        DongVat dv = new DongVat(id, ten, gioiTinh, giaTien);
        dongVatService.sua(dv);

        resp.sendRedirect("/buoi3/hien-thi");
    }

    private void them(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        Boolean gioiTinh = Boolean.valueOf(req.getParameter("gioiTinh"));
        Float giaTien = Float.valueOf(req.getParameter("giaTien"));

        DongVat dv = new DongVat(id, ten, gioiTinh, giaTien);
        dongVatService.them(dv);

        resp.sendRedirect("/buoi3/hien-thi");
    }
}
