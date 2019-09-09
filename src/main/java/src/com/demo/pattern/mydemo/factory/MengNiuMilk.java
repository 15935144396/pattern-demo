package src.com.demo.pattern.mydemo.factory;

/**
 * @author fengww
 * @ClassName MengNiuMilk
 * @Description TODO
 * @date 2018-11-12 9:54
 */
public class MengNiuMilk implements Milk {
    public String drink() {
        return "我在喝蒙牛";
    }

    public String getName() {
        return "蒙牛牛奶";
    }
}
