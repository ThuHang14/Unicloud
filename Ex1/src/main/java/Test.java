import java.util.Random;

public class Test {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(10)+1;
            System.out.println("Random number is " + ranNum);
        }
    }
}
