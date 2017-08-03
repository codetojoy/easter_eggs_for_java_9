
package net.codetojoy;

import java.lang.reflect.*;

public class App {

    public static Object useJDKInternals() throws Exception {
        Class fileChannelImpl = Class.forName("sun.nio.ch.FileChannelImpl");

        Field fd = fileChannelImpl.getDeclaredField("fd");
        fd.setAccessible(true);

        return fileChannelImpl;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("TRACER : start");

        Object obj = useJDKInternals();

        System.out.println("TRACER : created: " + obj);
    }
}

