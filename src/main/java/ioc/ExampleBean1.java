package ioc;

/**
 * Created by wuzhiyong on 2018/2/24.
 */
public class ExampleBean1 {

    private AnotherBean anotherBean;
    private String str;
    private int age;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
