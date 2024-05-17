import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {
    private List<Holiday> holidays_info;

    public Calendar(HashMap<String, String> info) {
        this.holidays_info = new ArrayList<Holiday>();
        for(Map.Entry<String, String> holiday: info.entrySet()) {
            this.holidays_info.add(new Holiday(holiday.getKey(), holiday.getValue()));
        }
    }

    public List<Holiday> getHolidays_info() {
        return holidays_info;
    }
    
    public void showHolidays() {
        for (Holiday h: this.holidays_info) {
            System.out.println(h.getDate() + ": " + h.getTitle());
        }
    }

    static class Holiday {
        private String title;
        private String date;

        public Holiday(String title, String date) {
            this.title = title;
            this.date = date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> holidays = new HashMap<>();
        holidays.put("2024-01-01", "Новый год");
        holidays.put("2024-05-01", "День труда");
        holidays.put("2024-05-09", "День победы");

        Calendar calendar = new Calendar(holidays);
        calendar.showHolidays();
    }
}
