package horse;

import game.BaseGame;
import game.SingletonGame;

public class BaseGameHorse extends Horse implements BaseGame {

    @Override
    public void startGame() {
//        System.out.println("Game Horse Start");
        start();
    }

    @Override
    public void init() {
        for (Horse h : SingletonGame.getInstance().getAllHorse()) {
            h.start();
        }
    }

    @Override
    public void result() {
        System.out.println("Result Game Horse");
        SingletonGame.getInstance().showHorsesBySortStep();
    }

    public void start() {
        createHorse(10);
        init();
    }

    public void createHorse(int num) {
        for (int i = 1; i < num + 1; i++) {
            Horse horse = new Horse(i, 0);
            SingletonGame.getInstance().addHorse(horse);
        }
    }
}
