package ioc;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuzhiyong on 2018/2/24.
 */
public class ExampleTest {
    private ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("app.xml");
    }

    @Test
    public void testExample(){
        ExampleBean exampleBean = context.getBean("exampleBean",ExampleBean.class);
        Assert.assertNotNull(exampleBean.getOne());
        Assert.assertEquals(exampleBean.getVal(),1);
        System.out.println(exampleBean);
    }
}
