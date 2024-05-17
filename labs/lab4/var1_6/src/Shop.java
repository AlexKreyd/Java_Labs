import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<SectionInfo> sections_info;

    public Shop() {
        this.sections_info = new ArrayList<>();
    }

    public void addSection(String name, List<String> products, List<String> services) {
        SectionInfo new_section = new SectionInfo(name, products, services);
        sections_info.add(new_section);
    }

    public void showSections() {
        for (SectionInfo s: this.sections_info) {
            System.out.println("Отдел: " + s.getSection_name() + ", продукты: " +
                    s.getProducts() + ", услуги: " + s.getServices());
        }
    }
    static class SectionInfo {
        private String section_name;
        private List<String> products;
        private List<String> services;

        public SectionInfo(String section_name, List<String> products, List<String> services) {
            this.section_name = section_name;
            this.products = products;
            this.services = services;
        }

        public String getSection_name() {
            return section_name;
        }

        public void setSection_name(String section_name) {
            this.section_name = section_name;
        }

        public List<String> getProducts() {
            return products;
        }

        public void setProducts(List<String> products) {
            this.products = products;
        }

        public List<String> getServices() {
            return services;
        }

        public void setServices(List<String> services) {
            this.services = services;
        }
    }
    public static void main(String[] args) {
        String section_name = "Фрукты";

        List<String> products = new ArrayList<>();
        products.add("Апельсин");
        products.add("Банан");
        products.add("Яблоко");
        products.add("Апельсин");

        List<String> services = new ArrayList<>();
        services.add("Взвешивание");

        Shop shop = new Shop();
        shop.addSection(section_name, products, services);

        shop.showSections();

    }
}