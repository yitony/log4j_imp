package com.ywj.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tony on 17/1/17.
 */
public class Slf4jTest1 {

    public static Logger logger = LoggerFactory.getLogger(Slf4jTest1.class);

    public void test() {
        logger.info("this is a test {}", System.currentTimeMillis());
        logger.info("this is a test");
        logger.info("this is a test");
        logger.info("this is a test");
    }

    public static void main(String[] args) {

        Slf4jTest1 slf4jTest1 = new Slf4jTest1();
        slf4jTest1.test();

    }
}
