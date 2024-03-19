import java.util.Objects;

public class Bud {
    private String color;

    public Bud() {
        this.color = "Розовый";
    }

    public Bud(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud b = (Bud) o;
        return this.color.equals(b.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
