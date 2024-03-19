import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.addDoor(new Door());
        house1.addWindow(new Window());
        house1.addWindow(new Window());

        ArrayList<Window> windows = new ArrayList<>();
        windows.add(new Window());
        windows.add(new Window());
        ArrayList<Door> doors = new ArrayList<>();
        doors.add(new Door());
        House house2 = new House(windows, doors);

        // проверка работы методов hashCode, equals и toString
        System.out.println("1) " + house1.toString());
        System.out.println("Хэш дома №1: " + house1.hashCode());
        System.out.println("2) " + house2.toString());
        System.out.println("Хэш дома №2: " + house2.hashCode());
        System.out.println("Результат сравнения домов: " + house1.equals(house2));
        System.out.println();

        house2.lock();
        System.out.println("Дом №1: " + house1.toString());
        System.out.println("Хэш дома №1: " + house1.hashCode());
        System.out.println("Дом №2: " + house2.toString());
        System.out.println("Хэш дома №2: " + house2.hashCode());
        System.out.println("Результат сравнения домов: " + house1.equals(house2));
        System.out.println();







    }
}