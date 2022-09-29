package modal;

public class Geometry {
    private int id;
    private String name;

    public int id() {
        return id;
    }

    public Geometry setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Geometry setName(String name) {
        this.name = name;
        return this;
    }

    public Geometry() {
    }

    public Geometry(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "modal.Geometry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
