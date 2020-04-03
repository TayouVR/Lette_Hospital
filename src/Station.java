import java.util.ArrayList;

public class Station {
    private String name;
    private ArrayList<Patient> patients;
    private int anzPatienten;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        anzPatienten++;
    }

    public boolean searchPatient(String name) {
        for (Patient s: patients) {
            if (s.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean deletePatient(String name) {
        for (Patient s: patients) {
            if (s.name.equals(name)) {
                patients.remove(s);
                anzPatienten--;
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (Patient s: patients) {
            System.out.println(s);
        }
    }
}
