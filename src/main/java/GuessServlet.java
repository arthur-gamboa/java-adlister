import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectServlet", value="correct")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        int randomNum = (int)Math.round(Math.random() * 2) + 1;

        if (guess == randomNum) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }

}