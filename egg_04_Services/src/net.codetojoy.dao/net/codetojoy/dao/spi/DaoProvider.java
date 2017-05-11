
package net.codetojoy.dao.spi;

import net.codetojoy.dao.Dao;

public interface DaoProvider {
    Dao getDao();
}

