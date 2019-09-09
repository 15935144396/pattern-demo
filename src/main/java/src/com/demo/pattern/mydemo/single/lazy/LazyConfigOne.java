package src.com.demo.pattern.mydemo.single.lazy;

/**
 * @author fengww
 * @ClassName LazyConfigOne
 * @Description TODO
 * @date 2018-11-12 14:56
 */
public class LazyConfigOne {



    private static LazyConfigOne lazyConfigOne;

    private LazyConfigOne() {
    }



    public static LazyConfigOne getLazyConfigOne(){
        if(lazyConfigOne ==null){
            lazyConfigOne = new LazyConfigOne();
        }
        return lazyConfigOne;
    }


}
