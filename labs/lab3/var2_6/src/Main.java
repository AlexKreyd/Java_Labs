import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        houses.add(new House(0, 18, 60, 5, 2,
                "Бауманская", "Тип1", 10));
        houses.add(new House(1, 10, 77, 3, 3,
                "Тверская", "Тип2", 30));
        houses.add(new House(2, 20, 100, 5, 4,
                "Арбат", "Тип1", 60));
        houses.add(new House(3, 4, 60, 1, 2,
                "Бауманская", "Тип3", 10));

        Scanner scan = new Scanner(System.in);
        // вывод списка квартир с заданным числом комнат
        System.out.println("Введите необходимое число комнат:");
        int num = scan.nextInt();
        ArrayList<House> houses_with_num_rooms = filter_by_room_number(houses, num);
        if(houses_with_num_rooms.size() == 0) {
            System.out.println("Квартир с заданным числом комнат нет");
        }
        else {
            for(House h: houses_with_num_rooms) {
                System.out.println(h.toString());
            }
        }

        // вывод списка квартир с заданным числом комнат и расположенных на этаже в интервале
        System.out.println("Введите минимальный возможный этаж:");
        int min_floor = scan.nextInt();
        System.out.println("Введите максимально возможный этаж:");
        int max_floor = scan.nextInt();
        ArrayList<House> houses_filtered_floor = filter_by_floor(houses_with_num_rooms, min_floor, max_floor);
        if(houses_filtered_floor.size() == 0) {
            System.out.println("Квартир с заданным числом комнат и номером этажа в заданным интервале нет");
        }
        else {
            for(House h: houses_filtered_floor) {
                System.out.println(h.toString());
            }
        }
        // вывод списка квартир, имеющих площадь, превосходящую заданную
        System.out.println("Введите минимально возможную площадь:");
        int min_area = scan.nextInt();
        ArrayList<House> houses_filtered_area = filter_by_area(houses, min_area);
        if(houses_filtered_area.size() == 0) {
            System.out.println("Квартир с площадью, превосходящую заданную, нет");
        }
        else {
            for(House h: houses_filtered_area) {
                System.out.println(h.toString());
            }
        }

    }

    public static ArrayList<House> filter_by_room_number(ArrayList<House> houses, int n) {
        ArrayList<House> filtered_houses = new ArrayList<>();
        for(House house: houses) {
            if(house.getRooms_number() == n) {
                filtered_houses.add(house);
            }
        }
        return filtered_houses;
    }

    public static ArrayList<House> filter_by_floor(ArrayList<House> houses, int min_floor, int max_floor) {
        ArrayList<House> filtered_houses = new ArrayList<>();
        for(House house: houses) {
            if(house.getFloor() >= min_floor && house.getFloor() <= max_floor) {
                filtered_houses.add(house);
            }
        }
        return filtered_houses;
    }

    public static ArrayList<House> filter_by_area(ArrayList<House> houses, int area) {
        ArrayList<House> filtered_houses = new ArrayList<>();
        for(House house: houses) {
            if(house.getArea() >= area) {
                filtered_houses.add(house);
            }
        }
        return filtered_houses;
    }
}