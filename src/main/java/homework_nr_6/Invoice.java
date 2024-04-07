package homework_nr_6;

import java.util.Scanner;

public class Invoice {
    private String modelOfDevice;
    private String description;
    private int quantity;
    private double price;

    // Constructor
    public Invoice(String modelOfDevice, String description, int quantity, double price) {
        this.modelOfDevice = modelOfDevice;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    // Method for calculating final amount
    public double getAmount() {
        return quantity * price;
    }

    // getter и setter for every attribute
    public String getModel() {
        return modelOfDevice;
    }

    public void setModel(String model) {
        this.modelOfDevice = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public void inputInvoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model:");
        setModel(scanner.nextLine());

        System.out.println("Enter description:");
        setDescription(scanner.nextLine());

        System.out.println("Enter quantity:");
        setQuantity(scanner.nextInt());

        System.out.println("Enter price:");
        setPrice(scanner.nextDouble());
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "model='" + modelOfDevice + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("", "", 0, 0.0);
        invoice.inputInvoice();
        System.out.println(invoice.toString());
        System.out.println("Amount: " + invoice.getAmount());
    }
}
