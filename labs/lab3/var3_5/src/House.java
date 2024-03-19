import java.util.ArrayList;
import java.util.Objects;

public class House {
    private boolean locked;
    private ArrayList<Window> windows;
    private ArrayList<Door> doors;

    public House() {
        this.locked = false;
        this.windows = new ArrayList<>();
        this.doors = new ArrayList<>();
    }

    public House(ArrayList<Window> windows, ArrayList<Door> doors) {
        this.locked = false;
        this.windows = windows;
        this.doors = doors;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House other = (House) o;
        if (Objects.equals(this.windows, other.windows)) return false;
        if (Objects.equals(this.doors, other.doors)) return false;
        return this.locked == other.locked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.locked, this.doors.size(), this.windows.size());
    }

    public String toString() {
        String lock_status;
        if (this.locked) lock_status = "закрыт.";
        else lock_status = "открыт.";
        return "Дом c количеством окон: " + this.windows.size() + " шт. и количеством дверей: " +
                this.doors.size() + " шт. Дом " + lock_status;
    }

    public void lock() {
        this.locked = true;
        System.out.println("Дверь дома была закрыта");
    }

    public void open() {
        this.locked = false;
        System.out.println("Дверь дома была открыта");
    }

    public boolean getLockStatus() {
        return this.locked;
    }

    public void addWindow(Window win) {
        this.windows.add(win);
    }

    public void addDoor(Door door) {
        this.doors.add(door);
    }

    public void printWindowNumber() {
        System.out.println("Дом имеет " + this.windows.size() + " окон.");
    }

    public void printDoorNumber() {
        System.out.println("Дом имеет " + this.doors.size() + " дверей.");
    }
}
