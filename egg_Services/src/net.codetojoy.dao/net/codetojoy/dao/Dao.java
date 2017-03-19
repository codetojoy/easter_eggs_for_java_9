
package net.codetojoy.dao;

import net.codetojoy.dao.spi.DaoProvider;

import java.util.*;

public abstract class Dao {
    public abstract List<String> getNames(); 

    public static void main(String[] args) {
        ServiceLoader<DaoProvider> serviceLoader = ServiceLoader.load(DaoProvider.class);

        Iterator<DaoProvider> iter = serviceLoader.iterator();
        if (!iter.hasNext()) {
            throw new RuntimeException("No service providers found!");
        }
        DaoProvider daoProvider = iter.next();

        Dao dao = daoProvider.getDao();
        List<String> names = dao.getNames();

        for (String name : names) {
            System.out.println("TRACER hello from Dao. name: " + name);
        }
    }
}

