package homework_nr_2;

import javax.swing.plaf.basic.BasicTreeUI;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float Pi = 3.14559f;

        System.out.println("\nCurrentWorldPopulation - " + CurrentWorldPopulation + "\nCarsProducedThisYear - " + CarsProducedThisYear +
                "\nFirstLetterInAlphabet - " + FirstLetterInAlphabet + "\nJavaIsAmazing - " + JavaIsAmazing + "\nPi - " + Pi);

        double Price = 123.32;
        double Tax = 345.56;
        int Quantity = 100;
        double Sum = 0;
        System.out.println("\nPrice = " + Price + "\nTax = " + Tax +
                "\nQuantity = " + Quantity + "\nSum = " + Sum );

        double Total = (Price + Tax) * Quantity + Sum;
        System.out.println("-------------------\nTotal = " + Total);
    }
}
