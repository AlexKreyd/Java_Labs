abstract class SiemensMobile implements Mobile {
    protected String company_name;

    public SiemensMobile() {
        this.company_name = "Siemens";
    }

    public String getCompany_name() {
        return company_name;
    }

    @Override
    public void call() {
        System.out.println("Сделан звонок с мобильного телефона Siemens");
    }
}
