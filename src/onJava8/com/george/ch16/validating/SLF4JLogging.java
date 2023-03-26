package onJava8.com.george.ch16.validating;

import org.slf4j.*;

public class SLF4JLogging {
    private static Logger log = LoggerFactory.getLogger(SLF4JLogging.class);

    public static void main(String[] args) {
        log.info("hello logging");
    }
}
