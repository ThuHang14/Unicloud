package game;

import horse.Horse;

import java.util.ArrayList;
import java.util.List;

public class SingletonGame {
    private static SingletonGame instance;
    public List<Horse> horses;

    private SingletonGame() {
        horses = new ArrayList<>();
    }

    //        GET instance
    public synchronized static SingletonGame getInstance() {
        if (instance == null) {
            instance = new SingletonGame();
        }
        return instance;
    }

}

