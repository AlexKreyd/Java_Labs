import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // инициализация заказчика
        Customer customer = new Customer("Алексей");

        // инициализация технического задания
        Map<String, Double> tasks = new HashMap<>();
        tasks.put("План помещения", 10000.0);
        tasks.put("Проводка", 5000.50);
        tasks.put("Дизайн", 2000.0);
        TechnicalSpecification ts = new TechnicalSpecification("Конструкция 8-ми этажного здания");
        ts.setTasks(tasks);

        // инициализация конструкторов
        Designer designer1 = new Designer("Иван");
        Designer designer2 = new Designer("Петр");

        // расчет счета
        DesignBureau bureau = new DesignBureau();
        bureau.registerTechnicalAssignment(ts);
        Invoice invoice = bureau.createInvoice(customer, ts);

        // добавление конструкторов в бригаду
        ProjectTeam team = bureau.createProjectTeam();
        bureau.assignDesignerToTeam(team, designer1);
        bureau.assignDesignerToTeam(team, designer2);
    }
}