package src.com.demo.pattern.mydemo.factory.simple;

import com.demo.pattern.mydemo.factory.Milk;

/**
 * @author fengww
 * @ClassName SimpleMilkFacotryTest
 * @Description TODO
 * @date 2018-11-12 9:54
 */
public class SimpleMilkFacotryTest {


    public static void main(String[] args) {
        SimpleMilkFactory factory = new SimpleMilkFactory();
        Milk mengNiu = factory.getMilk("蒙牛");
        System.out.println(mengNiu.getName());
        System.out.println(mengNiu.drink());
        Milk yili = factory.getMilk("伊利");
        System.out.println(yili.getName());
        System.out.println(yili.drink());
        Milk milk = factory.getMilk("");
        System.out.println(milk.getName());
        System.out.println(milk.drink());


    }
}
