public class Carrier extends WarShip{
    private String ship_type;

    public Carrier(String name) {
        super(name);
        this.ship_type = "Авианосец";
    }

    @Override
    public void sale() {
        System.out.println("Плывет авианосец");
    }

    public void show_ship_info() {
        System.out.println("Корабль: класса - " + this.ship_class +
                ", тип - " + this.ship_type);
    }

    public String getShip_type() {
        return ship_type;
    }

    public static void main(String[] args) {
        Carrier carrier = new Carrier("Адмирал Кузнецов");
        carrier.sale();
        carrier.show_ship_info();
    }
}
