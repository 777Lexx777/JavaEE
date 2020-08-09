package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "OrderHttpServlet",urlPatterns = "/order-http-servlet")
public class OrderHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("|Оформление заказа|");

        //req.setAttribute("attr", "value");
        //getServletContext().getRequestDispatcher("/product-http-servlet").include(req, resp);
    }
}
