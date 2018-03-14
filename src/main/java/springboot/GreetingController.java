package springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wuzhiyong on 2018/2/12.
 */
@RestController
public class GreetingController {
    private final static String template = "hello,%s";
    private final AtomicLong count = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world")String name){
        return new Greeting(count.incrementAndGet(),String.format(template,name));
    }
}
