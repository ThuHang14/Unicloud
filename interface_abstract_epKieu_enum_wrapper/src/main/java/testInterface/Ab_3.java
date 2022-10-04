package testInterface;

abstract class Ab_3 implements In_1,In_2{
    @Override
    public void once() {
        System.out.println(11);
    }

    @Override
    public void two() {
        System.out.println(22);
    }

    public void three(){
        System.out.println(33);
    }
}
