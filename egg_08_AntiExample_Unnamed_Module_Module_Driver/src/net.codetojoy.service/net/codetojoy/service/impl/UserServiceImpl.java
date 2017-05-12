
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = null;

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

