package homework_nr_7;

class Pensioned extends Person {
    String retireDate;
    int age;

    Pensioned(String name, String surname, String retireDate, int age) {
        super(name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }
}
