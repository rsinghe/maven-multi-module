import java.util.logging.Logger;

/**
 * Created by Home on 3/26/2017.
 */
public class SimpleApp {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("SimpleApp");

        System.out.println("Today's date: " + DateUtil.getToday());
    }
}
