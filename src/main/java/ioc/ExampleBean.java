package ioc;

/**
 * Created by wuzhiyong on 2018/2/24.
 */
public class ExampleBean {
    private OneBean one;
    private AnotherBean another;
    private int val;

    public ExampleBean(OneBean one, AnotherBean another, int val) {
        this.one = one;
        this.another = another;
        this.val = val;
    }

    public OneBean getOne() {
        return one;
    }

    public AnotherBean getAnother() {
        return another;
    }

    public int getVal() {
        return val;
    }
}
