package com.ywj.log4j;

import org.apache.log4j.Logger;

/**
 * Created by tony on 15/4/26.
 */
public class Log4jTest {

    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {

        System.out.println(Log4jTest.class);

        logger.debug("this is debug info");

        logger.info("jusr ok");

        logger.error("helll errorinof");
    }
}
