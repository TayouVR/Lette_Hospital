import java.util.Scanner;

public class Patient {
    protected int id;
    protected int age;
    protected String name;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void read() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Geben Sie den Namen des Patienten ein : ");
        this.name = scnr.next();

        System.out.println("Nun das Alter des Patienten : ");
        this.age = scnr.nextInt();

        System.out.println("Geben Sie die id des Patient ein : ");
        this.id = scnr.nextInt();
        System.out.println("*********************************");
    }

    public void display() {
        System.out.println(this.name + ", ID: " + this.id + ", Age: " + this.age);
    }
}
