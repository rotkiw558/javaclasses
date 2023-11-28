import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNumber;
        int LoopCounter = 0;
        int number = 0;
        randomNumber = (int) (Math.random()*(max-min+1)+min);
        while (randomNumber != number) {
            LoopCounter++;
            System.out.println("Enter the number");
            number = new Scanner(System.in).nextInt();
            if (number > randomNumber) {
                System.out.println("Lower number");
            } else {
                System.out.println("Bigger number");
            }

        }
        System.out.println("Congratulations you guessed!");
        System.out.println("Loop counter: " + LoopCounter);
    }
}
