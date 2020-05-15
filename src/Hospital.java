import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<Station> stations;
    private int anzStationen = 0;

    public Hospital(String name) {
        stations = new ArrayList<>();
        this.name = name;
    }

    public void addStation(Station station) {
        stations.add(station);
        anzStationen++;
    }

    public boolean searchStation(String name) {
        for (Station s: stations) {
            if (s.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteStation(String name) {
        for (Station s: stations) {
            if (s.getName().equals(name)) {
                stations.remove(s);
                anzStationen--;
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (Station s: stations) {
            System.out.println(s.getName());
        }
    }
}
