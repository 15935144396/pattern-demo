package src.com.demo.pattern.mydemo.single.lazy;

/**
 * @author fengww
 * @ClassName LazyConfigThree
 * @Description TODO
 * @date 2018-11-19 16:40
 */
public class LazyConfigThree {


    private LazyConfigThree() {
    }


    public LazyConfigThree getInstence(){

        return InnerClass.lazyConfigThree;

    }



    private  static   class InnerClass{


        public static final LazyConfigThree lazyConfigThree = new LazyConfigThree();

        public InnerClass() {


        }
    }



}
