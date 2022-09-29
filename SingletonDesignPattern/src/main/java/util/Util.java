package util;

import java.util.List;

public class Util {
    public static void getData(List<?> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("null");
            return;
        }
        list.forEach(System.out::println);
    }
}
