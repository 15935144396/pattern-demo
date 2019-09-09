package src.com.demo.pattern.mydemo.factory.simple;


import src.com.demo.pattern.mydemo.factory.DefaultMilk;
import src.com.demo.pattern.mydemo.factory.MengNiuMilk;
import src.com.demo.pattern.mydemo.factory.Milk;
import src.com.demo.pattern.mydemo.factory.YiLiMilk;

/**
 * @author fengww
 * @ClassName SimpleMilkFactory
 * @Description TODO
 * @date 2018-11-12 9:44
 */
public class SimpleMilkFactory {




    public Milk getMilk(String name){

        if(name.equals("蒙牛")){
            return new MengNiuMilk();
        }
        if(name.equals("伊利")){
            return new YiLiMilk();
        }

        return new DefaultMilk();



    }






}
