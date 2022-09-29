package modal;

public class User {
    private Integer id;
    private String name;
    private Color color;
    private Geometry geometry;

    public Integer id() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Color color() {
        return color;
    }

    public User setColor(Color color) {
        this.color = color;
        return this;
    }

    public Geometry geometry() {
        return geometry;
    }

    public User setGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

    public User(Integer id, String name, Color color, Geometry geometry) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", geometry=" + geometry +
                '}';
    }
}
