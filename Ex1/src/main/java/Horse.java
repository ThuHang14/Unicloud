import java.util.Random;

public class Horse extends Thread {
    private int id;
    private int num = 0;
    private int length = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (length != 100) {
            Random rand = new Random();
            int ranNum = rand.nextInt(10) + 1;

            length += ranNum;
            num++;

            if (length > 100) {
                length -= 100;
            }
        }

        System.out.println("Con ngựa thứ " + id + " đã về đích với " + num + " bước chạy" );
    }

    public Horse(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }

    public Horse setId(int id) {
        this.id = id;
        return this;
    }

    public int num() {
        return num;
    }

    public Horse setNum(int num) {
        this.num = num;
        return this;
    }

    public int length() {
        return length;
    }

    public Horse setLength(int length) {
        this.length = length;
        return this;
    }

}
