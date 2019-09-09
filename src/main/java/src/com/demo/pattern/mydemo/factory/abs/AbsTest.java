package src.com.demo.pattern.mydemo.factory.abs;


import src.com.demo.pattern.mydemo.factory.Milk;

/**
 * @author fengww
 * @ClassName AbsTest
 * @Description TODO
 * @date 2018-11-12 10:35
 */
public class AbsTest {


    public static void main(String[] args) {

        AbstractMilkFactory milkFactory = new MnegNiuMilkFactory();
        Milk mengNiuMilk = milkFactory.getMengNiuMilk();
        System.out.println(mengNiuMilk.drink());
        System.out.println(mengNiuMilk.getName());


    }
}
