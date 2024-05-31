import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class StoreApp {
    public static void main(String[] args) {
        Store store = new Store(10);

        Thread producerThread = new Thread(new Producer(store));
        Thread consumerThread = new Thread(new Consumer(store));

        producerThread.start();
        consumerThread.start();
    }
}
