
package net.codetojoy.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public int safeParseInt(String s) {
        int result = Integer.MIN_VALUE;

        if (NumberUtils.isParsable(s)) {
            try {
                result = Integer.parseInt(s);
            } catch(Exception ex) {
            } 
        }

        return result;
    } 
}
