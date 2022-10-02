package game;

import game.impl.HorseGame;

public class GameFactory {

    public static Game createGame(String gameType) {
        switch (gameType) {
            case "horse" -> {
                return new HorseGame();
            }
            default -> {
                throw new RuntimeException("not find game");
            }
        }
    }
}
