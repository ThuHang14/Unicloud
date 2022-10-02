package horse;

import game.SingletonGame;
import game.action.Run;
import game.action.Sleep;
import util.UtilGame;

public class GameHorse extends Horse implements Sleep, Run {
    @Override
    public void animalRun() {
        for (Horse h : SingletonGame.getInstance().horses
        ) {
            int length = 0;
            int count = 0;
            while (length != 100) {
                int step = UtilGame.random(10);
                length += step;
                count++;

                if (length > 100) {
                    length = 100 - length;
                }
            }
            h.setStep(count);
        }
    }

    public void horseSleep() {
        animalSleep(500);
    }

    public void createHorse(int num) {
        for (int i = 1; i < 11; i++) {
            Horse horse = new Horse(i, 0);
            SingletonGame.getInstance().horses.add(horse);
        }
    }

    public void horseRun() {
        animalRun();
    }

}
