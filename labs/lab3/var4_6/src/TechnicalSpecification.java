import java.util.HashMap;
import java.util.Map;

public class TechnicalSpecification {
    private String description;
    Map<String, Double> tasks;

    public TechnicalSpecification(String description) {
        this.description = description;
        this.tasks = new HashMap<>();
    }

    public void addTask(String title, Double price) {
        tasks.put(title, price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Map<String, Double> getTasks() {
        return tasks;
    }

    public void setTasks(Map<String, Double> tasks) {
        this.tasks = tasks;
    }
}
