package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

// example of a filter logging all requests
@WebFilter(filterName = "logger",
        urlPatterns = {"/*"},
        initParams = @WebInitParam(name = "parameterName", value = "parameterValue"))
public class LoggingFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        System.err.println("start logging " + filterConfig.getInitParameter("parameterName"));
        chain.doFilter(request, response);
        System.err.println("end logging");
    }

//
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

}
