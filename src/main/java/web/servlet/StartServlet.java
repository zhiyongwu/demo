package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2018/3/14.
 */

@WebServlet(loadOnStartup = 1)
public class StartServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();

        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(t,100,100);
    }
}
