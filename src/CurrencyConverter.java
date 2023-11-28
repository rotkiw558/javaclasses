import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        byte mark = 0;
        byte currency;
        double amount = 0;
        double money = 0;
        byte number = 0;
        double result;
        double PLN = 1;
        double USD = 4.40;
        double EUR = 4.55;
        double YEN = 0.03;

        System.out.println("Which currency do you have?");
        System.out.println("Choose 1 to use PLN");
        System.out.println("Choose 2 to use USD");
        System.out.println("Choose 0 to end the program");

        currency = new Scanner(System.in).nextByte();
        System.out.println("Read number: " + currency);


        if (currency == 1) {
            System.out.println("Choose 1 to convert PLN to USD");
            System.out.println("Choose 2 to convert PLN to EUR");
            System.out.println("Choose 3 to convert PLN to YEN");
            System.out.println("Click 0 to end the program");
            mark = new Scanner(System.in).nextByte();
            System.out.println("Read number: " + mark);
            switch (mark) {
                case '1' -> {
                    money = PLN * USD;
                    System.out.println("PLN to USD: " + money);
                }
                case '2' -> {
                    money = PLN * EUR;
                    System.out.println("PLN to EUR: " + money);
                }
                case '3' -> {
                    money = PLN * YEN;
                    System.out.println("PLN to YEN: " + money);
                }
                case '0' -> {
                    break;
                }
            }
        }
        if (currency == 2) {
            System.out.println("Choose 1 to convert USD to PLN");
            System.out.println("Choose 2 to convert USD to EUR");
            System.out.println("Choose 3 to convert USD to YEN");
            System.out.println("Click 0 to end the program");
            mark = new Scanner(System.in).nextByte();
            System.out.println("Read number: " + mark);
            switch (mark) {
                case '1' -> {
                    money = USD * PLN;
                    System.out.println("USD to PLN: " + (money));
                }
                case '2' -> {
                    money = USD * EUR;
                    System.out.println("USD to EUR: " + (money));
                }
                case '3' -> {
                    money = USD * YEN;
                    System.out.println("USD to YEN: " + (money));
                }
                case '0' -> {
                    break;
                }
            }
        }

        System.out.println("Enter the amount you want to convert");
        mark = new Scanner(System.in).nextByte();
        System.out.println("Read number: " + mark);

        result = money * amount;
        System.out.println("You get: " + (result));

    }
}
