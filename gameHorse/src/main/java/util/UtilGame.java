package util;

import java.util.Random;

public class UtilGame {
    public static int random(int number){
        Random rand = new Random();
        return rand.nextInt(number) + 1;
    }
}
