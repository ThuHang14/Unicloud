public class ColorBuilder {
    private int id;
    private String name;
    private String rgb;
    private String createAt;
    private String author;
    private String description;
    private String rating;
    public static class Builder {
        private int id;
        private String name;
        private String rgb;
        private String createAt;
        private String author;
        private String description;
        private String rating;

//        tao constructor name
        public Builder(int id) {
            this.id = id;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder author (String author) {
            this.author = author;
            return this;
        }

        public Builder createAt(String createAt) {
            this.createAt = createAt;
            return this;
        }

        public Builder description (String description) {
            this.description = description;
            return this;
        }

        public Builder rating (String rating) {
            this.rating = rating;
            return this;
        }

        public Builder rgb (String rgb) {
            this.rgb = rgb;
            return this;
        }

        public ColorBuilder build(){
            ColorBuilder colorBuilder = new ColorBuilder();
            colorBuilder.id = this.id;
            colorBuilder.author = this.author;
            colorBuilder.createAt = this.createAt;
            colorBuilder.description = this.description;
            colorBuilder.rating = this.rating;
            colorBuilder.rgb = this.rgb;
            colorBuilder.name = this.name;

            return colorBuilder;
        }
    }

//    GET SET

    @Override
    public String toString() {
        return "ColorBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rgb='" + rgb + '\'' +
                ", createAt='" + createAt + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
