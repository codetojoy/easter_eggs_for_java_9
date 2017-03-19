
package net.codetojoy.db;

import java.util.*;
import net.codetojoy.dao.Dao;

public class DaoImpl extends Dao {
    public List<String> getNames() {
        List<String> results = new ArrayList<>();

        results.add("abc");
        results.add("def");
        results.add("ijk");

        return results;
    }
}

