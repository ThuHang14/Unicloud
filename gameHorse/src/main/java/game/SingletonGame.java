package game;

import horse.Horse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SingletonGame {
    private static SingletonGame instance;
    private List<Horse> horses;

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

    public void addHorse(Horse horse) {
        if (horse == null) {
            return;
        }
        this.horses.add(horse);
    }

    public void showHorsesBySortStep() {
        this.horses.stream().sorted(Comparator.comparingInt(Horse::getStep))
                .toList()
                .forEach(System.out::println);
    }

    public List<Horse> getAllHorse(){
        return this.horses;
    }
}

