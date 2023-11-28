import java.util.Scanner;
public class Task1 {
    public static void task1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter = 1;
        int maxCount = 13;

        System.out.println("Think of a number, I will try to guess it!");
        System.out.println("You have 13 tries");

        do {
            System.out.print("Is your number " + counter + "? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("I guessed it! Your number is " + counter + ".");
                break;
            } else {
                counter++;
            }
        } while (counter <= maxCount);

        if (counter > maxCount) {
            System.out.println("I couldn't guess your number in 13 tries");
        }
    }
}


