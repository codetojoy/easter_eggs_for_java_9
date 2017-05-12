
package net.codetojoy.domain;

import org.apache.commons.lang3.StringUtils;

public class User {
    public boolean isNumeric(String id) {
        boolean result = false;

        if (id != null) {
            result = StringUtils.isNumeric(id);
        }

        return result;
    }
}
