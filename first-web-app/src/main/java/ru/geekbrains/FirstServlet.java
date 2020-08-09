package ru.geekbrains;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet{

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws SecurityException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig(){
        return this.config;
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws SecurityException, IOException{
        res.getWriter().println("<h1>Hello from servlet!!!</n1>");
        res.getWriter().println("<p> attr = " + req.getAttribute("attr") + "</p>");
    }

    @Override
    public String getServletInfo() {return null;}

    @Override
    public void destroy (){

    }

}
