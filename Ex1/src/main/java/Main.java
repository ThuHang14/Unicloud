import game.Game;
import game.GameFactory;

public class Main {
//    Làm bài toán đua ngựa:
//Có 10 con ngựa cùng xuất phát cùng lúc.
// Cứ sau nửa giây, mỗi con sẽ chạy một bước là một số int random từ 1 đến 10
// Nếu con ngựa nào có quãng đường bằng tổng các bước chạy bằng đúng 100 thì con ngựa đó sẽ về đích và in ra: Con ngựa thứ xxx đã về đích với yyy bước chạy
// Nếu quãng đường vượt quá 100, quãng đường sẽ bằng hiệu của nó với 100
    public static void main(String[] args) {

        Game game = GameFactory.createGame("horse");
        game.startGame();
    }

}
