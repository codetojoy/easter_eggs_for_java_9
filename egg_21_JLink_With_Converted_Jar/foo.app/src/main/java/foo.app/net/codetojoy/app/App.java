
package net.codetojoy.app;

import net.codetojoy.domain.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        boolean result = user.isNumeric("5150");
        System.out.println("Ready. result: " + result);
    }
}
