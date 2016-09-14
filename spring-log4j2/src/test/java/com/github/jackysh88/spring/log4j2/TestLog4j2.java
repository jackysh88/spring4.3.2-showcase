package com.github.jackysh88.spring.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by jacky on 2016/9/13.
 */
public class TestLog4j2 {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.debug("Test Debug {}", "Message Debug");
        logger.info("Test Info {}", "Message Info");
        logger.error("Test Error {}", "Message Error");
        logger.warn("Test Warn {}", "Message Warn");
        logger.trace("Test Trace {}", "Message Trace");
    }
}
