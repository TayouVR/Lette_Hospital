import java.util.ArrayList;

public class Station {
    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();
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

    public boolean searchPatient(int id) {
        Patient patient = patients.get(id);
        if (patient != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deletePatient(int id) {
        Patient patient = patients.get(id);
        if (patient != null) {
            patients.remove(patient);
            anzPatienten--;
            return true;
        } else {
            return false;
        }
    }

    public void displayAll() {
        for (Patient s: patients) {
            System.out.println(s);
        }
    }
}
