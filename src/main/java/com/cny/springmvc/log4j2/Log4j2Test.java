package com.cny.springmvc.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author : chennengyuan
 */
public class Log4j2Test {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(Log4j2Test.class);
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
        log.trace("trace");
    }

}
