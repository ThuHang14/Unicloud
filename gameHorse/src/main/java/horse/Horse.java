package horse;

import game.action.Run;
import game.action.Sleep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import util.UtilGame;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Horse extends Thread implements Run, Sleep {
    private long id;
    private int step;

    @Override
    public void animalRun() {

        int length = 0;
        int count = 0;

        while (length != 100) {

            animalSleep(500);

            int step = UtilGame.random(10);
            length += step;
            count++;

            if (length > 100) {
                length = 100 - length;
            }
        }
        System.out.println("Con ngựa thứ " + this.id + " đã về đích với " + count + " bước chạy");
        this.setStep(count);
    }

//    start Thread
    @Override
    public void run() {
        animalRun();
    }
}
