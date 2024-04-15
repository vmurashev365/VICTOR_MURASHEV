package homework_nr_7;

class Employee extends Person {
    String companyName;

    Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }

    void work() {
        System.out.println(name + " " + surname + " is working at " + companyName + ".");
    }
}
