package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SimpleServlet2", urlPatterns = "/sum")
public class SimpleServlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get data from request
        String a = request.getParameter("a");
        String b = request.getParameter("b");

        // calculate something
        int sum = Integer.valueOf(a) + Integer.valueOf(b);

        // write data to response
        response.getWriter().println(sum);

    }
}
