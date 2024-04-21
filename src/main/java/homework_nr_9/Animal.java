package homework_nr_9;

public interface Animal {

    // Methods of the interface
    void eat();

    void sleep();

    void makeSound();

    // Default method
    default void roam() {
        System.out.println("The animal is roaming.");
    }

    // Static method
    static void breathe() {
        System.out.println("The animal is breathing.");
    }

}
