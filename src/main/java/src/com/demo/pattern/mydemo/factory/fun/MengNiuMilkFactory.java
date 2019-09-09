package src.com.demo.pattern.mydemo.factory.fun;

import src.com.demo.pattern.mydemo.factory.MengNiuMilk;
import src.com.demo.pattern.mydemo.factory.Milk;

/**
 * @author fengww
 * @ClassName MengNiuMilkFactory
 * @Description TODO
 * @date 2018-11-12 10:15
 */
public class MengNiuMilkFactory implements MilkFactory {

    public Milk getMilk() {
        return new MengNiuMilk();
    }
}
