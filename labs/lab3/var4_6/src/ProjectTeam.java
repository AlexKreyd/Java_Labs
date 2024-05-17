import java.util.ArrayList;
import java.util.List;

public class ProjectTeam {
    private List<Designer> designers;

    public ProjectTeam() {
        this.designers = new ArrayList<>();
    }

    public void addDesigner(Designer designer) {
        designers.add(designer);
    }

    public List<Designer> getDesigners() {
        return designers;
    }
}
