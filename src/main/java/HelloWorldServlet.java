//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class HelloWorldServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
//
//    }
//}

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (name != null) {
            out.printf("<h1>Hello, %s</h1>", name);
        } else {
            out.println("<h1>Hello, World!</h1>");
        }
    }


}