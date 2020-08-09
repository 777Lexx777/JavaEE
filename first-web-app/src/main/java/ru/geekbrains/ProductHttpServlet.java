package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "ProductHttpServlet",urlPatterns = "/product-http-servlet")
public class ProductHttpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("|Оформление заказа|");
        getServletContext().getRequestDispatcher("/catalog-http-servlet").include(req, resp);
        req.setAttribute("attr", "value");

    }
}
