package testInterface;

public class In_1_2 implements In_1,In_2{
    @Override
    public void once() {
        System.out.println(1);
    }

    @Override
    public void two() {
        System.out.println(2);
    }
}
