public class Main {
    public static void main(String[] args) {
        Color color = new Color("white","#FFF");
        Color color2 = new Color("white","#FFF");
// true vi da override
        System.out.println(color.equals(color2));

        System.out.println(color.hashCode());
        System.out.println(color2.hashCode());

        String a = new String("1");
        String b = new String("1");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }
}
