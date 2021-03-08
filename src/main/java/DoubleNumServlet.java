import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "DoubleNumServlet", urlPatterns = "/double-number")

public class DoubleNumServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userNum = Integer.parseInt(request.getParameter("num"));
        request.setAttribute("userNum", userNum);
        request.setAttribute("dubNum", userNum * 2);
        request.getRequestDispatcher("double-number.jsp").forward(request, response);
    }
}
