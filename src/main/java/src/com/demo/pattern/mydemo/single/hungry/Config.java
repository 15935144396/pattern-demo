package src.com.demo.pattern.mydemo.single.hungry;

/**
 * @author fengww
 * @ClassName Config
 * @Description TODO
 * @date 2018-11-12 14:12
 */
public class Config {


    public static final Config conf = new Config();

    private Config() {
    }

    public static  Config getConfig(){
        return conf;
    }
}
