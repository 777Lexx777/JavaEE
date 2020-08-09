package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "ExceptionHttpServlet",urlPatterns = "/exception-http-servlet")
public class ExceptionHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Ошибка. Проверь правильность набора адреса");

//        req.setAttribute("attr", "value");
//        getServletContext().getRequestDispatcher("/product-http-servlet").include(req, resp);
    }
}