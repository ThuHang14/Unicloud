public class Main {
    public static void main(String[] args) {
        ColorBuilder colorBuilder = new ColorBuilder
                .Builder(12)
                .author("author")
                .createAt("29/09/2022")
                .description("description")
                .name("name")
                .rating("5")
                .rgb("#fff")
                .build();

        System.out.println(colorBuilder);
    }
}
