// Класс, представляющий ногу робота
public class Leg implements Runnable {
    private final String legName;

    public Leg(String legName) {
        this.legName = legName;
    }

    @Override
    public void run() {
        // Имитируем шаги ноги робота
        for (int i = 0; i < 10; i++) {
            synchronized (Leg.class) {
                System.out.println(legName);
                try {
                    // Устанавливаем задержку для имитации движения ноги
                    Leg.class.notify();
                    Leg.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (Leg.class) {
            Leg.class.notify(); // Убедиться, что другой поток не останется заблокированным
        }
    }
}
