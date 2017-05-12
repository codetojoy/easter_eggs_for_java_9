
package net.codetojoy.service.impl;

import net.codetojoy.db.api.UserDao;

import org.apache.commons.lang3.math.NumberUtils;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = null;

    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

   public static int safeParseInt(String s) {
        int result = Integer.MIN_VALUE;

        if (NumberUtils.isParsable(s)) {
            try {
                result = Integer.parseInt(s);
            } catch(Exception ex) {
            } 
        }

        return result;
    } 

    public static void main(String[] args) {
        String value = "5150";
        int i = safeParseInt("5150"); 
        System.out.println("TRACER : hello from UserServiceImpl . i: " + i);
    }
}

