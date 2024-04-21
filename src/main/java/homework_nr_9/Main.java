package homework_nr_9;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Elephant();
        System.out.println("----Calling methods under Animal Interfaces---");
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.roam(); // Using Default method
        Animal.breathe(); // Using Static method
        System.out.println("----Calling methods under Herbivore abstract class ---");
        Herbivore elephantAsHerbivore = new Elephant();
        elephantAsHerbivore.eat();
        elephantAsHerbivore.sleep();
        elephantAsHerbivore.makeSound();
        elephantAsHerbivore.graze(); // Using Abstract method
        elephantAsHerbivore.seekWater(); // Using method with a body from the Herbivore-abstract class
    }
}
