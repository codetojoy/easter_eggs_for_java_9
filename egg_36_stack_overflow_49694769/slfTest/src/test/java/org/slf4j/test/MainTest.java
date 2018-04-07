package org.slf.test;

import org.junit.Test;
import static org.junit.Assert.*;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

public class MainTest {

    @Test
    public void testFoo() throws Exception {
        Main main = new Main();

        // Logger logger = LoggerFactory.getLogger(Main.class);
        // logger.info("Hello World");
    
        // test 
        String result = main.foo();
        assertEquals("OK", result);
    }
}
