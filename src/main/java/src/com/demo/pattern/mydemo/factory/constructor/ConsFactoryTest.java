package src.com.demo.pattern.mydemo.factory.constructor;

import com.demo.pattern.mydemo.factory.Milk;
import com.demo.pattern.mydemo.factory.fun.MengNiuMilkFactory;

/**
 * @author fengww
 * @ClassName ConsFactoryTest
 * @Description TODO
 * @date 2018-11-12 10:29
 */
public class ConsFactoryTest {


    public static void main(String[] args) {
        MilkFactories milkFactories = new MilkFactories(new MengNiuMilkFactory());
        Milk milk = milkFactories.getMilk();
        System.out.println(milk.getName());
        System.out.println(milk.drink());
    }
}
