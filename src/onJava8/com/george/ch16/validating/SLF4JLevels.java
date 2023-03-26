package onJava8.com.george.ch16.validating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLevels {
    private static Logger log =
            LoggerFactory.getLogger(SLF4JLevels.class);

    public static void main(String[] args) {
        log.trace("Hello李炫辉");
        log.debug("Logging");
        log.info("UsingHello李炫辉");
        log.warn("the SLF4J");
        log.error("Facade");
    }
}
