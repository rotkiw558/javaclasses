import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = read.nextInt();
//        System.out.println("Your number is: " + number);
//        System.out.println("Enter name: ");
//        // Click Enter
//        read.nextLine(); // Read Enter

//        String name = read.nextLine();
//        System.out.println("Your name is: " + name);
//        Scanner readString = new Scanner(System.in);
//        System.out.println("Enter some text: ");
//        String textLine = readString.nextLine();
//        System.out.println("Your text is: " + textLine);

//        Scanner toSpace = new Scanner(System.in);
//        System.out.println("Read to space");
//        String lname = toSpace.next();
//        System.out.println("Your last name is: " + lname);

//        System.out.println("Enter a floating point number");
//        Scanner number = new Scanner(System.in);
//        double variable = number.nextDouble();
//        System.out.println("Read number: " + variable);

//        System.out.println("Floating point number");
//        double shorter = new Scanner(System.in).nextDouble();
//        System.out.println("Read number: " + shorter);

        System.out.println("Enter a floating number");
        String doDouble = new Scanner(System.in).nextLine();
        System.out.println("Read string: " + doDouble);
        double real = Double.parseDouble(doDouble);
        System.out.println("Changed number: " + real*real);
    }
}
