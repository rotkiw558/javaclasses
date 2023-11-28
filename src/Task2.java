import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int product = 1;
        int counter = 0;

        do {
            System.out.print("Enter number (0 ends entering): ");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                product *= number;
                counter++;
            }
        } while (number != 0);

        if (counter % 2 == 0) {
            System.out.println( 0 + " / Even number was given.");
        } else {
            System.out.println( 1 + " / Odd number was given.");
        }

        System.out.println("Sum of all the numbers: " + sum);
        System.out.println("Product of all the numbers: " + product);

        if (counter == 0) {
            System.out.println("No number given");
        }
    }
}