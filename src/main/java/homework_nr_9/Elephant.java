package homework_nr_9;

public class Elephant extends Herbivore implements Animal {

    //Interface methods
    @Override
    public void eat() {
        System.out.println("Elephant is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }

    // extended from the Herbivore
    @Override
    public void graze() {

    }
}

