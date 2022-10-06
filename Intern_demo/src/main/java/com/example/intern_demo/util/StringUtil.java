package com.example.intern_demo.util;

public class StringUtil {

    public static boolean isText(String input) {
        return input != null
                && input.trim().length() > 0;
    }

}
