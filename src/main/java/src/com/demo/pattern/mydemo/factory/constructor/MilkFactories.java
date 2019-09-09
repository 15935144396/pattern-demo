package src.com.demo.pattern.mydemo.factory.constructor;


import src.com.demo.pattern.mydemo.factory.Milk;
import src.com.demo.pattern.mydemo.factory.fun.MilkFactory;

/**
 * @author fengww
 * @ClassName MilkFactories
 * @Description TODO
 * @date 2018-11-12 10:19
 */
public class MilkFactories {


    private MilkFactory milkFactory;

    public MilkFactories(MilkFactory milkFactory) {
        this.milkFactory = milkFactory;
    }

    Milk getMilk(){
        return milkFactory.getMilk();
    }



}
