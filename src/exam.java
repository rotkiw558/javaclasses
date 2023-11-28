import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
//        Napisz program obliczający pola i obwody 5 figur geometrycznych.
//        Sprawdź przy obliczeniach czy podano poprawne dane do obliczeń.
//        Dodaj możliwość wyboru obliczanej figury, pól czy obwodów.
//        Pamiętaj o jednostkach.
//        Pamiętaj o czytelności oraz skalowalnosći programu.

        System.out.println("Program to calculate");
        System.out.println("Choose your element");
        System.out.println("1. Kwadrat");
        System.out.println("2. Prostokat");
        System.out.println("3. Trojkat");
        System.out.println("4. Trapez");
        System.out.println("5. Okrag");
        System.out.println("0. Zakoncz");

        Scanner read = new Scanner(System.in);
        System.out.println("Napisz cyfre: ");
        int number = read.nextInt();

        if(number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 0) {

            int mark = number;
            double sum;
            if (mark == 1) {
                System.out.println("Wybierz co chcesz obliczyc: ");
                System.out.println("1. obwod");
                System.out.println("2. pole");
                Scanner liczba = new Scanner(System.in);
                System.out.println("Napisz cyfre: ");
                int wybrana = liczba.nextInt();
                System.out.println("Obliczanie obwodu kwadratu");
                Scanner random = new Scanner(System.in);
                System.out.println("Napisz dlugosc boku: ");
                double a = random.nextDouble();
                if (a < 0) {
                    System.out.println("Bledna liczba");
                } else {
                    sum = a * 4;
                    System.out.println("Obwód kwadratu wynosi: " + sum);
                }
            }
            if (mark == 2) {
                System.out.println("Obliczanie obwodu prostokata");
                Scanner random = new Scanner(System.in);
                System.out.println("Napisz dlugosc boku 1: ");
                double a = random.nextDouble();
                System.out.println("Napisz dlugosc boku 2: ");
                double b = random.nextDouble();
                if (a < 0 || b < 0) {
                    System.out.println("Bledna liczba");
                } else {
                    sum = (2 * a) + (2 * b);
                    System.out.println("Obwód prostokata wynosi: " + sum);
                }
            }
            if (mark == 3) {
                System.out.println("Obliczanie obwodu trojkata");
                Scanner random = new Scanner(System.in);
                System.out.println("Napisz dlugosc boku 1: ");
                double a = random.nextDouble();
                System.out.println("Napisz dlugosc boku 2: ");
                double b = random.nextDouble();
                System.out.println("Napisz dlugosc boku 3: ");
                double c = random.nextDouble();
                if (a < 0 || b < 0 || c < 0) {
                    System.out.println("Bledna liczba");
                } else {
                    sum = a + b + c;
                    System.out.println("Obwód trojkata wynosi: " + sum);
                }
            }

            if (mark == 4) {
                System.out.println("Obliczanie obwodu trapezu");
                Scanner random = new Scanner(System.in);
                System.out.println("Napisz dlugosc boku 1: ");
                double a = random.nextDouble();
                System.out.println("Napisz dlugosc boku 2: ");
                double b = random.nextDouble();
                sum = (2 * a) + (2 * b);
                System.out.println("Obwód trapezu wynosi: " + sum);
                if (a < 0 || b < 0) {
                    System.out.println("Bledna liczba");
                } else {
                    sum = (2 * a) + (2 * b);
                    System.out.println("Obwód trapezu wynosi: " + sum);
                }
            }
            if (mark == 5) {
                System.out.println("Obliczanie obwodu okregu");
                Scanner random = new Scanner(System.in);
                System.out.println("Napisz dlugosc promienia: ");
                double a = random.nextDouble();
                if (a < 0) {
                    System.out.println("Bledna liczba");
                } else {
                    sum = 2 * 3.14 * a;
                    System.out.println("Obwód okregu wynosi: " + sum);
                }
            }
            if (mark == 0) {
                System.out.println("Program został zakonczony");
            }
        } else {
            System.out.println("Napisales bledna liczbe");
        }

    }
}


