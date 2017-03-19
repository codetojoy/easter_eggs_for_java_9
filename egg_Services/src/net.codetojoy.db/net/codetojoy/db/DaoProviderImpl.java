
package net.codetojoy.db;

import net.codetojoy.dao.Dao;
import net.codetojoy.dao.spi.DaoProvider;

public class DaoProviderImpl implements DaoProvider {
    public Dao getDao() { return new DaoImpl(); }
}

