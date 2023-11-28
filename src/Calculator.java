import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {
        String mark = "/";
        int program = '0';
        double x = 1;
        double y = 2;
        int n = 1;

        System.out.println("Choose + to add two numbers");
        System.out.println("Choose - to subtract two numbers");
        System.out.println("Choose * to multiply two numbers");
        System.out.println("Choose / to divide two numbers");
        System.out.println("Click 0 to end the program");

        if (mark.equals("/")) {
            System.out.println("Works");
        }

        switch (mark) {
            case "+" -> {
                System.out.println("Sum of two numbers: " + (x + y));
            }
            case "-" -> {
                System.out.println("Difference of two numbers: " + (x - y));
            }
            case "*" -> {
                System.out.println("Result of multiplying two numbers: " + (x * y));
            }
            case "/" -> {
                System.out.println("Result of dividing two numbers: " + (x / y));
            }
            default -> System.out.println("Error with calculations in the program");
        }
    }
}