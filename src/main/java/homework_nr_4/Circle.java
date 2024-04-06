package homework_nr_4;

public class Circle {

    float radius;
    float PI = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double CalculateArea() {
        return PI * radius * radius;
    }


    public static void main(String[] args) {

        Circle circle = new Circle(6);
        double area = circle.CalculateArea();

        System.out.println("Circle are equal to " + area);

    }
}
