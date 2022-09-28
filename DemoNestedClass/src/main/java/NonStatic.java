public class NonStatic {
    public static void main(String[] args) {
//        inner class

        draw.circle circle = new draw().new circle();
//        circle.red();

//        Local Classes
        System.out.println(new OuterClass().sayHello("John"));

    }

    public static class draw {
        class circle {
            public void blue() {
                System.out.println("draw circle blue");
            }

            public void red() {
                System.out.println("draw circle red");
            }
        }
    }

    public static class draw2 {
        public String circle(String color) {

            class Drawcircle {
                void blue() {
                    System.out.println(" draw circle blue and " + color);
                }
            }

            return color;
        }
    }

    public static class OuterClass {
        public String sayHello(String name) {
            int cnt = 0; //Before Java 8 must be define like: final int cnt = 0;
            class WelcomeMessage {
                WelcomeMessage() {
                    System.out.println(cnt); //Only use, can't change
                }

                String getMessage() {
                    return "Welcome";
                }

                void showName() {//Only valid from Java 8
                    System.out.println(name);
                }
            }
            WelcomeMessage msg = new WelcomeMessage();
            return msg.getMessage() + " " + name + " to the Java world !";
        }
    }
}
