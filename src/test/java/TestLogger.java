import org.testng.annotations.Test;

public class TestLogger extends TestTemplate {

    @Test
    public void testLoggingMessages() {
        logger.info("Some info");
        logger.debug("Some debug info");
        logger.error("Some error");
    }

    ;

}
