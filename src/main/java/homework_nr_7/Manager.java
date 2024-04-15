package homework_nr_7;

class Manager extends Employee {
    int teamSize;
    String teamName;

    Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
}
