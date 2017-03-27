import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by Home on 3/26/2017.
 */
public class DateUtilTest {
    Logger logger = Logger.getLogger("DateUtilTest");
    @Test
    public void getToday() throws Exception {
        String actualDate = DateUtil.getToday();
        String expectedDate = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());

        logger.info("Actual Date: " + actualDate);
        logger.info("Expected Date: " + expectedDate);

        Assert.assertEquals(expectedDate,actualDate);
    }
}