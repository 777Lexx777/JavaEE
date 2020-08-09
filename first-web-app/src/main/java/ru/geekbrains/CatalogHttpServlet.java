package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "CatalogHttpServlet",urlPatterns = "/catalog-http-servlet")
public class CatalogHttpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/text");

        resp.getWriter().println("|Товар|");

        req.setAttribute("attr", "value");
        getServletContext().getRequestDispatcher("/main-http-servlet").include(req, resp);
    }
}
