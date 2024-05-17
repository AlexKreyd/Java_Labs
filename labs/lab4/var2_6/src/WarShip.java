abstract class WarShip implements Ship{
    protected String ship_class;
    protected String name;

    public WarShip(String name) {
        this.name = name;
        this.ship_class = "Военный";
    }

    @Override
    public String getShipName() {
        return this.name;
    }

    @Override
    public void setShipName(String new_name) {
        this.name = new_name;
    }

    public String getShip_class() {
        return ship_class;
    }
}
