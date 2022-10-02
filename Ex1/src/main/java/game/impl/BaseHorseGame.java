package game.impl;

import game.Game;
import game.SingletonGame;
import horse.Horse;

public abstract class BaseHorseGame<T extends Thread> implements Game {

    @Override
    public void startGame() {
        start();
        showResult();
    }

    private void start() {
        createHorses(3);
    }

    private void showResult() {
        SingletonGame.getInstance().horses.forEach(System.out::println);
    }

    private void createHorses(int quantity){
        for (int i = 1; i <quantity+1 ; i++) {
            Horse horse = new Horse(i,0,0);
            horse.run();
        }
    };
}
