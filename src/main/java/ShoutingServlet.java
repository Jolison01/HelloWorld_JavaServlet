import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/shout")
public class ShoutingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");


        PrintWriter writer = resp.getWriter();
        writer.print("<html>" +
                "<head><title>ShoutServlet></title></head>" +
                "<body>" +
                "<h2> Shouting Servlet</h2>" +
                "<form action=‘post’  action=\"\">\n" +
                "<label for=\"fname\">what is your name?</label><br>\n" +
                "<input type=\"text\" name=\"ShoutName\" value='john'\"><br>\n" +
                "<input type=\"submit\" value=\"submit\">\n" +
                "</form>" +
                "</body>" +
                "</html>");
        writer.close();

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       resp.setContentType("text/html");
       resp.setCharacterEncoding("UTF-8");

       PrintWriter writer = resp.getWriter();

       writer.println("<html>"+
               "<head><title>ShoutServlet</title></head>"+
               "<body><h1>" +
               "You Know I Want to Shout: " +
               req.getParameter("ShoutName").toUpperCase() +
               "</h1></body>"+
               "</html>");

        writer.close();



    }
}

