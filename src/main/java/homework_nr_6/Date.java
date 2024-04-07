package homework_nr_6;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(1, 1, 1970); // Date by default
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // getter и setter for every attribute

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to input Date via console
    public void inputDateFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        setDay(scanner.nextInt());

        System.out.println("Enter month:");
        setMonth(scanner.nextInt());

        System.out.println("Enter year:");
        setYear(scanner.nextInt());
    }

    // Method to display date in "day/month/year" format
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        // adding object of Date class
        Date date = new Date();

        // Input Date via console
        date.inputDateFromConsole();

        // Printing entered
        date.displayDate();
    }
}
