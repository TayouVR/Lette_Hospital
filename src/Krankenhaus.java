import java.util.ArrayList;

public class Krankenhaus {
    private String name;
    private ArrayList<Station> stationsListe;
    private int anzStationen;

    public Krankenhaus(String name) {
        this.name = name;
    }

    public void fuegStationHinzu(Station station) {
        stationsListe.add(station);
    }

    public boolean sucheStation(String name) {
        for (Station s: stationsListe) {
            if (s.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean loescheStation(String name) {
        for (Station s: stationsListe) {
            if (s.getName().equals(name)) {
                stationsListe.remove(s);
                return true;
            }
        }
        return false;
    }

    public void zeigeAlle() {
        for (Station s: stationsListe) {
            System.out.println(s);
        }
    }
}
