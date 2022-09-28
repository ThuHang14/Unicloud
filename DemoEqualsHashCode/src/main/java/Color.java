import java.util.Objects;

public class Color {
    private String name;
    private String rbg;

    public Color(String name, String rbg) {
        this.name = name;
        this.rbg = rbg;
    }
// so sanh ve mat ngu nghia doi voi method
    @Override
    public boolean equals(Object obj) {
      if(this == obj) return true;
      if(obj == null || getClass() != obj.getClass()) return false;
      Color color = (Color) obj;
      return Objects.equals(name,color.name) && Objects.equals(rbg,color.rbg);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRbg() {
        return rbg;
    }

    public void setRbg(String rbg) {
        this.rbg = rbg;
    }
}
