import java.util.Objects;

// Класс для представления прямой в виде y = mx + b
public class Line {
    double slope, intercept;

    Line(Point p1, Point p2) {
        if (p1.x == p2.x) { // вертикальная прямая
            this.slope = Double.POSITIVE_INFINITY;
            this.intercept = p1.x;
        } else {
            this.slope = (double) (p2.y - p1.y) / (p2.x - p1.x);
            this.intercept = p1.y - this.slope * p1.x;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.slope, slope) == 0 &&
                Double.compare(line.intercept, intercept) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slope, intercept);
    }

    @Override
    public String toString() {
        return slope == Double.POSITIVE_INFINITY ? String.format("x = %.2f", intercept)
                : String.format("y = %.2fx + %.2f", slope, intercept);
    }
}
