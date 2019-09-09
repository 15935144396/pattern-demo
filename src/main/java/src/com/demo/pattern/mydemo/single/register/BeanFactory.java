package src.com.demo.pattern.mydemo.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author fengww
 * @ClassName BeanFactory
 * @Description TODO
 * @date 2018-11-20 17:05
 */
public class BeanFactory {


    private static Map<String,Object> colorMap = new ConcurrentHashMap();



    public synchronized Object getInsternce(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object o = colorMap.get(className);
        if(o==null){
            colorMap.put(className,Class.forName(className).newInstance());
        }
        return colorMap.get(className);

    }

}
