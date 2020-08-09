package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet (name = "FirstHttpServlet",urlPatterns = "/first-http-servlet")
public class FirstHttpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Hello from HTTP servlet!!!</n1>");
        resp.getWriter().println("<p>contextPath = " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>servletPath = " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>pathInfo = " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>queryString = " + req.getQueryString() + "</p>");

        resp.getWriter().println("<h2>Parameters</n2>");
        req.getParameterMap().forEach(
            (param, value) -> {
                try{
                    resp.getWriter().println("<p>" + param + " = " + Arrays.toString(value) + "</p>");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        );

        req.setAttribute("attr", "value");
        getServletContext().getRequestDispatcher("/catalog-http-servlet").include(req, resp);
    }
}




