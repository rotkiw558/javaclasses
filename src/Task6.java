import java.util.Scanner;
import static java.lang.System.*;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder changedWord = new StringBuilder();
        Scanner scanner = new Scanner(in);
        out.print("Enter a word: ");
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            char mark = (char) word.length();

            if (Character.isLowerCase(mark)) changedWord.append(Character.toUpperCase(mark));
            else if (Character.isUpperCase(mark)) changedWord.append(Character.toLowerCase(mark));
            else changedWord.append(mark);
        }

        out.println("Changed word: " + changedWord);
    }
}

