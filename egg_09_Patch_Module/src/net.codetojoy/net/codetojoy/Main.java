
package net.codetojoy;

import net.codetojoy.service.api.*;
import net.codetojoy.service.impl.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        String name = userService.getServiceName();

        System.out.println("TRACER: Greetings from: " + name);
    }
}
