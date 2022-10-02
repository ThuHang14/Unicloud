import game.BaseGame;
import game.GameFactory;

public class Main {
    public static void main(String[] args) {
        BaseGame game = GameFactory.createGame("horse");
        game.startGame();
    }
}
