
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;
// import net.codetojoy.db.impl.UserDaoImpl;

import java.rmi.RemoteException;

import java.util.logging.Logger;

public class UserServiceImpl {
    private UserDao userDao = null;
    private Logger logger = null;

    public void init() {
       String className = "net.codetojoy.db.impl.UserDaoImpl";

       try {
           Class c = Class.forName(className);
           Object myUserDao = c.newInstance();
           System.out.println("TRACER created this: " + myUserDao);
       } catch (Exception e) {
           System.err.println("caught exception: " + e.getMessage());
       }
    }

    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from UserServiceImpl");
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.init();
    }
}

