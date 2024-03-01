import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        String surname = "Крейденко";
        String receive_date = "09.02.2024 13:50";
        Calendar submit_date = Calendar.getInstance();
        System.out.printf("Фамилия разработчика: %s\n" +
                        "Дата и время получения задания: %s\n" +
                        "Дата и время сдачи задания: %s",
                surname, receive_date, submit_date.getTime());
    }
}