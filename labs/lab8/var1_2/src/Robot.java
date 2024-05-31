public class Robot {

    public static void main(String[] args) {
        // Создание объектов ног
        Leg leftLeg = new Leg("LEFT");
        Leg rightLeg = new Leg("RIGHT");

        // Создание потоков для каждой ноги
        Thread leftThread = new Thread(leftLeg);
        Thread rightThread = new Thread(rightLeg);

        // Запуск потоков
        leftThread.start();
        rightThread.start();

        // Ожидание завершения потоков
        try {
            leftThread.join();
            rightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

