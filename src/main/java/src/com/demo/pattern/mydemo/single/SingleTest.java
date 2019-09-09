package src.com.demo.pattern.mydemo.single;


import src.com.demo.pattern.mydemo.single.lazy.LazyConfigOne;

import java.util.concurrent.CountDownLatch;

/**
 * @author fengww
 * @ClassName SingleTest
 * @Description TODO
 * @date 2018-11-12 14:58
 */
public class SingleTest {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LazyConfigOne.getLazyConfigOne());
            }).start();
            countDownLatch.countDown();
        }


        System.out.println("end");

    }


}
