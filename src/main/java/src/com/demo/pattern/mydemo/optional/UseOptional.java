package src.com.demo.pattern.mydemo.optional;

import com.demo.pattern.mydemo.factory.MengNiuMilk;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fengww
 * @ClassName UseOptional
 * @Description TODO
 * @date 2018-11-12 17:31
 */
public class UseOptional {


    public static void main(String[] args) throws Exception {


        Stream.of("one", "two", "three", "four")
                        .filter(e -> e.length() > 3)
                       .peek(e -> System.out.println("Filtered value: " + e))
                       .map(String::toUpperCase)
                        .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }



    public static MengNiuMilk getMengNiuMilk() throws Exception {

        if(1==1){
            throw new Exception("000");
        }
        return new MengNiuMilk();
    }


}
