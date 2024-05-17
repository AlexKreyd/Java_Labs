public class Model extends SiemensMobile{
    private String model;

    public Model(String model) {
        super();
        this.model = model;
    }

    public void show_model() {
        System.out.println("Модель телефона: " + this.model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Model mobile_phone = new Model("SIEMENS 1920 PRO MAX");
        mobile_phone.call();
        mobile_phone.show_model();
        System.out.println(mobile_phone.getCompany_name());
    }
}
