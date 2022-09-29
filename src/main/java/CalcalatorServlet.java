import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "CalcalatorServlet", value = "/CalcalatorServlet")
public class CalcalatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        String operate = request.getParameter("select");


        writer.println("<html>");
        writer.println("<h1>Result</h1>");

        try {
            float result = Caculator.calculate(first,second,operate);
            writer.println(first + " "+ operate + " "+second+ " = "+result);
        }catch (Exception e){
            writer.println(e.getMessage());
        }
        writer.println("</html>");
    }

}
