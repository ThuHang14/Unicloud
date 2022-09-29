package modal;

public class Color {
    private int id;
    private String name;

    public int id() {
        return id;
    }

    public Color setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Color setName(String name) {
        this.name = name;
        return this;
    }

    public Color() {
    }

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "modal.Color{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
