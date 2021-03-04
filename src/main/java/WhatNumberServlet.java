import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "WhatNumberServlet", urlPatterns = "/what-num")
public class WhatNumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userNum = req.getParameter("num");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>User Number was: " + userNum + "</h1>");
    }

}
