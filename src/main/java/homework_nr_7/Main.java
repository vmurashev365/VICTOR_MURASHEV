package homework_nr_7;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan", "Ivanov", "Endava", 10, "Development Team");
        Programmer programmer = new Programmer("Andrei", "Shilov", "Endava", "Java", 5);
        Pensioned pensioned = new Pensioned("Ion", "Creanga", "2030-05-01", 65);

        manager.work();
        programmer.work();
    }
}
