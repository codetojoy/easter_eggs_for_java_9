package com.allstate.jigsaw;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class JigsawTest {
    private static Logger logger = Logger.getLogger("JigsawTest");

    public static void main(String[] args) {
        System.out.println("test hello world");
        logger.log(Level.INFO,"testing hello world for {0}","Jay");
    }
//Error:java: the unnamed module reads package org.apache.commons.logging from both jcl.over.slf4j and spring.jcl
}
