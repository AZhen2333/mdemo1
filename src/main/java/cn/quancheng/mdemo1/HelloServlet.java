package cn.quancheng.mdemo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

    @WebServlet("/helloServlet") // 配置请求路径，对外发布服务
    public class HelloServlet extends HttpServlet { // 继承HttpServlet成为servlet类

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = dateFormat.format(new Date());
            req.setAttribute("currentTime",currentTime);
            req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
        }
    }