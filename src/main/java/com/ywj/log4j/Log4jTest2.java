package com.ywj.log4j;

import org.apache.log4j.Logger;

/**
 * Created by tony on 15/4/26.
 */
public class Log4jTest2 {
    private static Logger logger = Logger.getLogger("scribename");

    public static void main(String[] args) {

        logger.debug("this is debug info");

        logger.info("jusr ok");

        logger.error("hello errorinof");
    }
}
