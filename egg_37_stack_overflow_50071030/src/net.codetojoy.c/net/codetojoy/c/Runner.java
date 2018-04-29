
package net.codetojoy.c;

import net.codetojoy.b.Boo;
// import net.codetojoy.x.Xoo;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello from Runner :: " + new Boo().getMessage());
        System.out.println("hello from Runner :: " + new Coo().getMessage());
        System.out.println("TRACER ready");
    }
}
