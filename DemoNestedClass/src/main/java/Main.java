public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(2);
        Integer b = new Integer("2");

        System.out.println(a == b);

        Integer c = 2;
        Integer d = c;
        c = 4;
        System.out.println(c + " - " + d);

        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}
