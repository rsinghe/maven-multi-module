import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * Created by Home on 3/26/2017.
 */
public class DateUtil {
    public static String getToday() {
        return DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
    }
}
