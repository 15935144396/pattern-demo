package src.com.demo.pattern.mydemo.factory;

/**
 * @author fengww
 * @ClassName DefaultMilk
 * @Description TODO
 * @date 2018-11-12 9:58
 */
public class DefaultMilk implements Milk {
    public String drink() {
        return "喝杂牌牛奶";
    }

    public String getName() {
        return "杂牌牛奶";
    }
}
