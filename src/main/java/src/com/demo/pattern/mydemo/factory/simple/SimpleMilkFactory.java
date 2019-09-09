package src.com.demo.pattern.mydemo.factory.simple;

import com.demo.pattern.mydemo.factory.DefaultMilk;
import com.demo.pattern.mydemo.factory.MengNiuMilk;
import com.demo.pattern.mydemo.factory.Milk;
import com.demo.pattern.mydemo.factory.YiLiMilk;

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
