package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];

        int SumEven = 0;
        double Multiplying = 1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = i;
            System.out.println("number[" + i + "] = " + numbers[i]);

            if (numbers[i] % 2 == 0) {
                SumEven += numbers[i];
            }

            if (numbers[i] % 2 == 1) {
                Multiplying *= numbers[i];
            }

        }
        System.out.println("\n ---------Task 2----------");
        System.out.println("Sum of even array elements is " + SumEven);

        System.out.println("\n ---------Task 3----------");
        System.out.println("Multiplying of odd elements is " + Multiplying);

        int[] copyNumbers = new int[101];

        for (int i: numbers) {
            copyNumbers[i] = numbers[i];
            //System.out.println("copyNumbers[" + i + "] = " + copyNumbers[i]);

        }


    }
}
