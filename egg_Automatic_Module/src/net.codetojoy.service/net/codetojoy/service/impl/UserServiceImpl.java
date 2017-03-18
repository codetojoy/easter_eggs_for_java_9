
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;
import net.codetojoy.utils.StringUtils;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = null;

    private static StringUtils stringUtils = new StringUtils();

    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

    public static void main(String[] args) {
        int i = stringUtils.safeParseInt("5150"); 
        System.out.println("TRACER : hello from UserServiceImpl . i: " + i);
    }
}

