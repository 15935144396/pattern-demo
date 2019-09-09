package src.com.demo.pattern.mydemo.factory.abs;


import src.com.demo.pattern.mydemo.factory.MengNiuMilk;
import src.com.demo.pattern.mydemo.factory.Milk;

/**
 * @author fengww
 * @ClassName MnegNiuMilkFactory
 * @Description TODO
 * @date 2018-11-12 10:34
 */
public class MnegNiuMilkFactory extends AbstractMilkFactory {

    @Override
    Milk getMengNiuMilk() {

        return new MengNiuMilk();
    }
}
