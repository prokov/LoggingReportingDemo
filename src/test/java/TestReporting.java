
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TestReporting extends TestTemplate {


    @Test
    public void failedTest() {
        logger.error("This is is the failed test example");
        fail("This is is the failed test example");
    }

    @Test
    public void successfulTest() {
        logger.info("This is is the passed test example");
    }

    @Test
    @Ignore
    public void ignoredTest() {
        logger.info("This is is the passed test example");
    }




}
