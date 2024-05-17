import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DesignBureau {
    private List<TechnicalSpecification> technicalAssignments;
    private List<ProjectTeam> projectTeams;

    public DesignBureau() {
        this.technicalAssignments = new ArrayList<>();
        this.projectTeams = new ArrayList<>();
    }

    public void registerTechnicalAssignment(TechnicalSpecification ts) {
        technicalAssignments.add(ts);
        System.out.println("Зарегистрировано техническое задание: " + ts.getDescription());
    }

    public double determineCost(TechnicalSpecification ts) {
        double budget = 0;
        // Простой расчет стоимости, исходя из бюджета ТЗ
        for(Map.Entry<String, Double> task: ts.getTasks().entrySet()) {
            budget += task.getValue();
        }
        return budget;
    }

    public Invoice createInvoice(Customer customer, TechnicalSpecification ts) {
        double cost = determineCost(ts);
        Invoice invoice = new Invoice(cost);
        invoice.printInvoice(customer);
        return invoice;
    }

    public ProjectTeam createProjectTeam() {
        ProjectTeam team = new ProjectTeam();
        projectTeams.add(team);
        System.out.println("Создана новая бригада конструкторов.");
        return team;
    }

    public void assignDesignerToTeam(ProjectTeam team, Designer designer) {
        team.addDesigner(designer);
        System.out.println("Назначить конструктора " + designer.getName() + " в бригаду.");
    }
}
