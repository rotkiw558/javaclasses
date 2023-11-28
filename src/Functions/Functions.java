package Functions;

public class Functions {
    public static void main(String[] args) {

        lines();
        System.out.println("Root " + Math.sqrt(5));
        lines();
        sum();
        lines();
        substraction(2,5);
        lines();
        int note = product();
        System.out.println("Product of numbers " + note*2);
        lines();
        double note2 = quotient(1, 0);
        System.out.println("Quotient of numbers " + note2);
        lines();
        int number1 = 9;
        int number2 = 7;
        System.out.println("Division " + quotient(number1, number2));
        lines();
    }

    public static void sum() {
        int a = 4;
        int b = -4;
        System.out.println("Sum of two numbers " + (a+b));
    }

    public static void lines() {
        System.out.println("------------------------------------------");
    }

    public static void substraction(int a, int b) {
        System.out.println("Substraction of two numbers " + (a-b));
    }

    public static int product() {
        int a = 8;
        int b = 5;
        return a*b;
    }

    public static double quotient(double dumbBoss, double b) {
        if (b == 0) {
            return 0;
        } else {
            return dumbBoss / b;
        }
    }

}
