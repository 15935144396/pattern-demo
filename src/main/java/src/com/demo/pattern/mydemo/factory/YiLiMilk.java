package src.com.demo.pattern.mydemo.factory;

/**
 * @author fengww
 * @ClassName YiLiMilk
 * @Description TODO
 * @date 2018-11-12 9:54
 */
public class YiLiMilk implements Milk {

    public String drink() {
        return "我在喝伊利";
    }

    public String getName() {
        return "伊利牛奶";
    }
}
