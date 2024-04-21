package homework_nr_9;

public abstract class Herbivore implements Animal {
    // Абстрактный метод
    public abstract void graze();

    // Метод с телом
    public void seekWater() {
        System.out.println("Herbivore is seeking water.");
    }
}

