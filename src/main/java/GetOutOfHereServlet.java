import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "GetOutOfHereServlet", urlPatterns = "/get-out")
public class GetOutOfHereServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletResponse req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.sendRedirect("http://www.google.com");
    }

}
