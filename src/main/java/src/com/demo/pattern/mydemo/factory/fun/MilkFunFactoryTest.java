package src.com.demo.pattern.mydemo.factory.fun;

import com.demo.pattern.mydemo.factory.Milk;

/**
 * @author fengww
 * @ClassName MilkFunFactoryTest
 * @Description TODO
 * @date 2018-11-12 10:16
 */
public class MilkFunFactoryTest {


    public static void main(String[] args) {

        MilkFactory factory = new MengNiuMilkFactory();
        Milk milk = factory.getMilk();
        System.out.println(milk.drink());
        System.out.println(milk.getName());
        factory = new YiliMilkFactory();
        milk =  factory.getMilk();
        System.out.println(milk.drink());
        System.out.println(milk.getName());

    }
}
