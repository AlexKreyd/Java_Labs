public class House {
    private int id;
    private int number;
    private float area;
    private int floor;
    private int rooms_number;
    private String street_name;
    private String building_type;
    private float exploit_period;

    public House(int id, int number, float area, int floor, int rooms_number,
                 String street_name, String building_type, float exploit_period) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms_number = rooms_number;
        this.street_name = street_name;
        this.building_type = building_type;
        this.exploit_period = exploit_period;
    }

    @Override
    public String toString() {
        return "Квартира № " + this.number + ", площадь " + this.area + "м^2, " +
                this.floor + " этаж, " + this.rooms_number + " комнат, ул." + this.street_name +
                ", типа здания: " + this.building_type + ", срок эксплуатации: " +
                this.exploit_period + " лет.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms_number() {
        return rooms_number;
    }

    public void setRooms_number(int rooms_number) {
        this.rooms_number = rooms_number;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public float getExploit_period() {
        return exploit_period;
    }

    public void setExploit_period(float exploit_period) {
        this.exploit_period = exploit_period;
    }
}
