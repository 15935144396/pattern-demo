package src.com.demo.pattern.mydemo.single.lazy;

/**
 * @author fengww
 * @ClassName LazyConfigTwo
 * @Description TODO
 * @date 2018-11-19 16:38
 */
public class LazyConfigTwo {



    public static  LazyConfigTwo lazyConfigTwo ;

    private LazyConfigTwo() {
    }


    public static synchronized LazyConfigTwo getInstence(){

        if(lazyConfigTwo==null){
            lazyConfigTwo = new LazyConfigTwo();
        }

        return lazyConfigTwo;
    }



}
