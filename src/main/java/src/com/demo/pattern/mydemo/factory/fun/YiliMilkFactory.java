package src.com.demo.pattern.mydemo.factory.fun;

import src.com.demo.pattern.mydemo.factory.Milk;
import src.com.demo.pattern.mydemo.factory.YiLiMilk;

/**
 * @author fengww
 * @ClassName YiliMilkFactory
 * @Description TODO
 * @date 2018-11-12 10:16
 */
public class YiliMilkFactory implements MilkFactory {

    public Milk getMilk() {
        return new YiLiMilk();
    }
}
