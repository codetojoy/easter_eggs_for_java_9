package org.slf.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public String foo() {
        logger.info("Hello World from foo");
        return "OK";
    }

    public static void main(String[] args) throws Exception {
        logger.info("Hello World from main");
        System.out.println("Hello World from main");
    }
}
