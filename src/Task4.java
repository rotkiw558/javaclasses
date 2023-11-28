import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        String BinaryNumber = Integer.toBinaryString(number);
        String HexadecimalNumber = Integer.toHexString(number);

        System.out.println("Binary number: " + BinaryNumber);
        System.out.println("Hexadecimal number: " + HexadecimalNumber);
    }
}
