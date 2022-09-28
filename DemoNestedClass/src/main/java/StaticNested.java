public class StaticNested {
    public static void main(String[] args) {
        draw.circle draw = new draw.circle();
        draw.blue();
    }

    static class draw {
        static class circle {
            public void blue() {
                System.out.println("draw circle blue");
            }

            public void red() {
                System.out.println("draw circle red");
            }
        }
    }
}
