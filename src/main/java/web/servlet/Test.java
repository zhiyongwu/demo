package web.servlet;

import javafx.concurrent.ScheduledService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2018/3/14.
 */
public class Test {
    public static void main(String[] args) {
        ScheduledExecutorService sc = Executors.newSingleThreadScheduledExecutor();
        sc.scheduleAtFixedRate(
                ()-> System.out.println(System.currentTimeMillis()),100,1000, TimeUnit.MILLISECONDS);
    }
}
