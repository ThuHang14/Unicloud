package game;


import horse.BaseGameHorse;

public class GameFactory {
    public static BaseGame createGame(String gameType){
        switch (gameType) {
            case "horse" -> {
                return new BaseGameHorse();
            }
            default -> {
                throw new RuntimeException("not find game");
            }
        }
    }
}
