import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private final int max_capacity; // Максимальная вместимость склада
    private Queue<Integer> products; // Очередь для хранения товаров

    public Store(int capacity) {
        this.max_capacity = capacity;
        this.products = new LinkedList<>();
    }
// Метод для добавления товара на склад
    public synchronized void produce(int product) throws InterruptedException {
            while (products.size() == max_capacity) {
            System.out.println("Склад полон, производитель ждет");
            wait(); // Если склад полон, производитель ждёт
            }
            products.add(product);
            System.out.println("Производитель добавил товар " + product);
            notifyAll(); // Уведомляем все ожидающие потоки
    }

// Метод для потребления товара со склада
    public synchronized int consume() throws InterruptedException {
            while (products.isEmpty()) {
            System.out.println("Товара не хватает в магазине, покупатель ждет.");
            wait(); // Если товаров нет, покупатель ждёт
            }
            int product = products.poll();
            System.out.println("Покупатель забрал товар " + product);
            notifyAll(); // Уведомляем все ожидающие потоки
            return product;
    }
}
