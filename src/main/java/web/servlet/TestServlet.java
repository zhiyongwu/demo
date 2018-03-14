package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wuzhiyong on 2018/3/14.
 */

@WebServlet(name = "test",urlPatterns = "/test")
public class TestServlet extends HttpServlet{

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(getServletContext().getInitParameter("name"));
        req.getRequestDispatcher("/WEB-INF/demo.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy");
    }
}
