package horse;

import game.SingletonGame;
import lombok.AllArgsConstructor;
import lombok.Data;
import util.UtilGame;

@Data
@AllArgsConstructor
public class Horse extends Thread implements Sleep, Run {
    private long id;
    private int step;
    private int length;


    @Override
    public void run() {
        //sleeping
        animalSleep(500);
        //lấy số bước chạy
        int step = getStep();
        // chạy theo số bước
        horseRunning(step);
    }

    private int getStep() {
        return UtilGame.random(10);
    }

    @Override
    public void horseRunning(int step) {
        while (length != 100) {
            length += step;
            step++;

            if (length > 100) {
                length = 100 - length;
            }
            SingletonGame.getInstance().horses.add(new Horse(id,step,length));
        }
    }


}
