import java.util.Random;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (true) {
                store.consume(); // Забираем товар со склада
                Thread.sleep(new Random().nextInt(1000)); // Имитация времени на потребление
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}