package com.example.SD20202SOF203.buoi9.controller;

import com.example.SD20202SOF203.buoi9.model.CapSach;
import com.example.SD20202SOF203.buoi9.repository.CapSachRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CapSachController", value = {
        "/buoi9/hien-thi", //GET
        "/buoi9/view-update", // GET
        "/buoi9/them", //POST
        "/buoi9/update", // POST
        "/buoi9/xoa" // GET
})
public class CapSachController extends HttpServlet {
    CapSachRepository capSachRepository = new CapSachRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")) {
            hienThi(req, resp);
        } else if(uri.contains("view-update")) {
            viewUpdate(req, resp);
        } else if(uri.contains("xoa")) {
            xoa(req, resp);
        }
    }

    private void xoa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        capSachRepository.xoa(id);
        resp.sendRedirect("/buoi9/hien-thi");
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("capSach", capSachRepository.chiTiet(id));
        req.getRequestDispatcher("/views/buoi9/view-update.jsp").forward(req, resp);
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("danhSach", capSachRepository.getAll());
        req.getRequestDispatcher("/views/buoi9/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("them")) {
            them(req, resp);
        } else if(uri.contains("update")) {
            update(req, resp);
        }
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        Float gia = Float.valueOf(req.getParameter("gia"));
        Boolean chongNuoc = Boolean.valueOf(req.getParameter("chongNuoc"));
        CapSach capSach = new CapSach(id, ten, gia, chongNuoc);

        capSachRepository.sua(capSach);
        resp.sendRedirect("/buoi9/hien-thi");
    }

    private void them(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        Float gia = Float.valueOf(req.getParameter("gia"));
        Boolean chongNuoc = Boolean.valueOf(req.getParameter("chongNuoc"));
        CapSach capSach = new CapSach(id, ten, gia, chongNuoc);

        capSachRepository.them(capSach);
        resp.sendRedirect("/buoi9/hien-thi");
    }
}
