package homework_nr_3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer value from 1 до 12-nd: ");
        int month_number = scanner.nextInt();
        switch (month_number) {
            case 1:
                System.out.println(month_number + " --> January");
                break;
            case 2:
                System.out.println(month_number + " --> February");
                break;
            case 3:
                System.out.println(month_number + " --> March");
                break;
            case 4:
                System.out.println(month_number + " --> April");
                break;
            case 5:
                System.out.println(month_number + " --> May");
                break;
            case 6:
                System.out.println(month_number + " --> June");
                break;
            case 7:
                System.out.println(month_number + " --> July");
                break;
            case 8:
                System.out.println(month_number + " --> August");
                break;
            case 9:
                System.out.println(month_number + " --> September");
                break;
            case 10:
                System.out.println(month_number + " --> October");
                break;
            case 11:
                System.out.println(month_number + " --> November");
                break;
            case 12:
                System.out.println(month_number + " --> December");
                break;
            default:
                System.out.println("you have not entered integer value in range 1 - 12");
        }

        System.out.println("--------End of Task 1 -----------\n\n");

        //Task 2
        for(int i= 100; i<=1000; i+=5){
            System.out.println(i);
        }

        System.out.println("--------End of Task 2 -----------\n\n");

        //Task 3
        double sum = 0;
        double temp = 0;
        double i = 1;
        while (i<99) {
            temp = i / (i+2);
            sum += temp;
            i+=2;

        }
        System.out.println("Task 3: counting the sum of fractions\n sum = " + sum);
    }
}
