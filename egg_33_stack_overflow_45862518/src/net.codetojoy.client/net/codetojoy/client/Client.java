
package net.codetojoy.client;

// import net.codetojoy.db.api.UserDao;
import net.codetojoy.db.foo.Foo;

public class Client {
    // private UserDao userDao = null;
    private Foo foo = new Foo();

    public void init() {
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from Client");
        Client client = new Client();
        client.init();
    }
}

