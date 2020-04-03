public class Patient {
    protected int id;
    protected int age;
    protected String name;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void read() {}

    public void display() {}
}
