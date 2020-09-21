package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// servlet marker, specify URL part
@WebServlet(name = "SimpleServlet1", urlPatterns = "/hello")
public class SimpleServlet1 extends HttpServlet {// class extension

    // override this method and process request
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // write something as response
        response.getWriter().println("hello elena");
    }
}
