import java.util.Random;

public class Producer implements Runnable {
    private Store store;
    private Random random = new Random();

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int product = random.nextInt(100); // Генерация случайного товара
                store.produce(product); // Добавление товара на склад
                Thread.sleep(random.nextInt(1000)); // Имитация времени на производство
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}