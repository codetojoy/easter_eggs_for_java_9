
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;

import java.rmi.RemoteException;
import java.util.logging.Logger;

// this is available via 'transitive' in 'net.codetojoy.db'
import java.sql.Driver;

public class UserServiceImpl {
    private UserDao userDao = null;
    private Logger logger = null;

    private Driver driver = null;

    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from UserServiceImpl");
    }
}

