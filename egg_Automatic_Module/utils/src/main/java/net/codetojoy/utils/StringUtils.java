
package net.codetojoy.utils;

public class StringUtils {
    public int safeParseInt(String s) {
        int result = Integer.MIN_VALUE;

        if (s != null) {
            try {
                result = Integer.parseInt(s);
            } catch(Exception ex) {
            } 
        }

        return result;
    } 
}
