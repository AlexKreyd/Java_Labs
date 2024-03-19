import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rose rose1 = new Rose();
        rose1.addPetal(new Petal());
        rose1.addPetal(new Petal());
        rose1.bloom();

        ArrayList<Petal> petals = new ArrayList<>();
        petals.add(new Petal());
        petals.add(new Petal());
        Rose rose2 = new Rose(petals, new Bud());
        rose2.bloom();

        rose2.printBudColor();
        System.out.println();

        // Проверка методов hashCode, equals, toString
        System.out.println("Информация о розах: ");
        System.out.println("1) " + rose1.toString());
        System.out.println("Хэш розы 1: " + rose1.hashCode());
        System.out.println("2) " + rose2.toString());
        System.out.println("Хэш розы 2: " + rose2.hashCode());
        System.out.println("Результат сравнения: " + rose1.equals(rose2));
        System.out.println();

        rose2.wither();
        System.out.println("Информация о розах: ");
        System.out.println("1) " + rose1.toString());
        System.out.println("Хэш розы 1: " + rose1.hashCode());
        System.out.println("2) " + rose2.toString());
        System.out.println("Хэш розы 2: " + rose2.hashCode());
        System.out.println("Результат сравнения: " + rose1.equals(rose2));



    }
}