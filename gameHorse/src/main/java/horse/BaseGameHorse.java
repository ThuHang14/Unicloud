package horse;

import game.BaseGame;
import game.SingletonGame;
import java.util.Comparator;

public class BaseGameHorse extends GameHorse implements BaseGame {

    @Override
    public void startGame() {
//        System.out.println("Game Horse Start");
        createHorse(10);
        start();
        result();
    }

    public void start() {
        horseSleep();
        horseRun();
    }

    public void result() {
        System.out.println("Result Game Horse");
        SingletonGame.getInstance().horses
                .stream().sorted(Comparator.comparingInt(Horse::getStep))
                .toList()
                .forEach(System.out::println);
    }

}
