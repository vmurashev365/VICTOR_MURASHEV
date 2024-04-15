package homework_nr_7;

class Programmer extends Employee {
    String programmingLanguage;
    int yearsOfExperience;

    Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
}
