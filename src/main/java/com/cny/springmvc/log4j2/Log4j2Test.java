package com.cny.springmvc.log4j2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : chennengyuan
 */
@Slf4j
public class Log4j2Test {

    public static void main(String[] args) {
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");
    }



}
