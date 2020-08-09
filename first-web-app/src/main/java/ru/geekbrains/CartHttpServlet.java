package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "CartHttpServlet",urlPatterns = "/cart-http-servlet")
public class CartHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Карзина!!!");

        req.setAttribute("attr", "value");
        getServletContext().getRequestDispatcher("/catalog-http-servlet").include(req, resp);
    }
}
