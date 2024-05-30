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
                 String street_name, String building_type, float exploit_period) throws HouseInitializationException {
        validateInitialization(id, number, area, floor, rooms_number, street_name, building_type, exploit_period);
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms_number = rooms_number;
        this.street_name = street_name;
        this.building_type = building_type;
        this.exploit_period = exploit_period;
    }

    public static void validateInitialization(int id, int number, float area, int floor, int rooms_number,
                                              String street_name, String building_type,
                                              float exploit_period) throws HouseInitializationException {
        validateId(id);
        validateNumber(number);
        validateArea(area);
        validateFloor(floor);
        validateRoomsNumber(rooms_number);
        validateStreetName(street_name);
        validateBuildingType(building_type);
        validateExploitPeriod(exploit_period);
    }

    public static void validateId(int id) throws HouseInitializationException {
        if (id <= 0) {
            throw new HouseInitializationException("Id должно быть больше нуля");
        }
    }

    public static void validateNumber(int number) throws HouseInitializationException {
        if (number <= 0) {
            throw new HouseInitializationException("Номер квартиры должен быть больше 0");
        }
    }

    public static void validateArea(float area) throws HouseInitializationException {
        if (area <= 0) {
            throw new HouseInitializationException("Площадь квартиры должно быть больше 0");
        }
    }

    public static void validateFloor(int floor) throws HouseInitializationException {
        if (floor <= 0) {
            throw new HouseInitializationException("Этаж должен быть больше 0");
        }
    }

    public static void validateRoomsNumber(int rooms_number) throws HouseInitializationException {
        if (rooms_number <= 0) {
            throw new HouseInitializationException("Количество комнат квартиры должно быть больше 0");
        }
    }

    public static void validateStreetName(String street_name) throws HouseInitializationException {
        if (street_name.equals("")) {
            throw new HouseInitializationException("Название улицы не должно быть пустой строкой");
        }
    }

    public static void validateBuildingType(String building_type) throws HouseInitializationException {
        if (building_type.equals("")) {
            throw new HouseInitializationException("Тип здания не должно быть пустой строкой");
        }
    }

    public static void validateExploitPeriod(float exploit_period) throws HouseInitializationException {
        if (exploit_period <= 0) {
            throw new HouseInitializationException("Период эксплуатации квартиры должно быть больше 0");
        }
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
