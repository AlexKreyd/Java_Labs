import java.util.ArrayList;
import java.util.Objects;

public class Rose {
    private ArrayList<Petal> petals;
    private Bud bud;
    private int status;

    public Rose() {
        this.petals = new ArrayList<>();
        this.bud = new Bud();
        this.status = 0;
    }

    public Rose(ArrayList<Petal> p, Bud b) {
        this.petals = p;
        this.bud = b;
        this.status = 0;
    }

    @Override
    public String toString() {
        String rose_status = "";
        if (this.status == 0) rose_status = "не расцвела";
        else if (this.status == 1) rose_status = "расцвела";
        else if (this.status == 2) rose_status = "завяла";

        return "Роза, количество лепестков: " + this.petals.size() +
                ", цвет бутона: " + this.bud.getColor() + ", состояние розы: " +
                rose_status + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose other = (Rose) o;
        return this.status == other.status && this.petals.size() == other.petals.size() && this.bud.equals(other.bud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.petals.size(), this.bud.getColor(), this.status);
    }

    public void bloom() {
        if (this.status == 0) {
            this.status = 1;
            System.out.println("Роза расцвела");
        } else if (this.status == 1){
            System.out.println("Роза уже расцвела");
        }
        else {
            System.out.println("Роза уже завяла и не может расцвести");
        }
    }

    public void wither() {
        if (this.status == 1) {
            this.status = 2;
            System.out.println("Роза завяла");
        } else if (this.status == 0) {
            System.out.println("Роза еще не расцвела");
        }
        else {
            System.out.println("Роза уже завяла");
        }
    }

    public void printBudColor() {
        System.out.println("Цвет бутона " + this.bud.getColor());
    }

    public void addPetal(Petal p) {
        this.petals.add(p);
    }


}
