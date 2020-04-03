import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String patientName;
        int patientAge;
        int patientId;

        Patient p1 = new Patient(1,"Baumtrud Schneider",78);
        Patient p2 = new Patient(2,"Ismir Schnuppe",20);
        Patient p3 = new Patient(3,"Niko Thin",17);

        System.out.println("*********************************"); 
        System.out.println("Geben Sie den Namen des Patienten ein : ");
        patientName = obj.next();

        System.out.println("Nun das Alter des Patienten : ");
        patientAge = obj.nextInt();

        System.out.println("Geben Sie die id des Patient ein : ");
        patientId = obj.nextInt();
        System.out.println("*********************************");

        Patient p4 = new Patient(patientId,patientName,patientAge);

        Station w1 = new Station("Unfall");
        Station w2 = new Station("Geburt");
        Station w3 = new Station("Kettensägen Massaker extrem Chirurgie");

        w1.addPatient(p1);
        w1.addPatient(p2);
        w1.addPatient(p3);
        w3.addPatient(p4);

        System.out.println("\n\n**************** Station INFORMATION ***************");
        w1.displayAll();

        System.out.println("\n\n************** SUCHE ************");
        System.out.println("Bitte Patienten ID eingeben : ");

        patientId = obj.nextInt();
        System.out.println("Der Patient Nr " + patientId + " ist im System, " + w1.searchPatient(patientId));
        System.out.println("\n");

        System.out.println("Geben Sie die ID des zu löschenden Patienten ein: : ");
        patientId = obj.nextInt();

        System.out.println("\n\n************** Nach loesche ************");
        System.out.println("Der Patient Nr " + patientId + " wurde gelöscht: " + w1.deletePatient(patientId));
        w1.displayAll();

        Hospital h1=new Hospital("Martin Luther Krankenhaus");
        h1.addStation(w2);
        h1.addStation(w1);
        h1.addStation(w3);

        System.out.println("\n\n************ Krankenhaus Station SEARCH *************");
        System.out.println("Der Station ist vorhanden " + h1.searchStation("Unfall"));
        System.out.println("\n\n************ Krankenhaus Station nach loesche *************");
        System.out.println("Station wurde gelöscht " + h1.deleteStation("Kettensägen Massaker extrem Chirurgie"));
        h1.displayAll();
    }
}
