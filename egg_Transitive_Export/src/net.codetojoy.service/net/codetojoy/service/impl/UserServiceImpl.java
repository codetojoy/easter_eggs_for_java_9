
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;

import java.rmi.RemoteException;

import java.util.logging.Logger;

public class UserServiceImpl {
    private UserDao userDao = null;
    private Logger logger = null;

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

