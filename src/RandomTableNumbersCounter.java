import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomTableNumbersCounter {
    // Random numbers in table and counted the repeated ones and which ones
    public static void main(String[] args) {
        // 100 random numbers
        int[] numbers = new int[100];
        Random random = new Random();

        // numbers between 0 and 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        Map<Integer, Integer> numberCounts = new HashMap<>();

        for (int number : numbers) {
            numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println("Number " + number + " appears " + count + " times.");
            }
        }
        // Unique numbers in table and show
    }
}
