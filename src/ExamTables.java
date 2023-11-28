import java.util.Random;
public class ExamTables {
    public static void main(String[] args) {
        /* ********************** ZADANIE 1 *************************
        double[] Antosz_01= new double[15];

        // even numbers from table
        for (int i = 0; i < Antosz_01.length; i++) {
            Antosz_01[i] = i * 2;
        }
        // show table numbers
        System.out.println("Table with even numbers");
        int i = 0;
        do {
            System.out.println(Antosz_01[i]);
            i++;
        }while (i < Antosz_01.length);

        // odd numbers
        for (int j = 0; j < Antosz_01.length; j++) {
            Antosz_01[j] = j * 2 + 1;
        }

        // odd numbers from table
        System.out.println("Table with odd numbers");
        for (int x = 0; x < Antosz_01.length; x++) {
            System.out.println(Antosz_01[x]);
        } ********************************************************** */

        /* ********************** ZADANIE 2 *************************
        double[] antoszw = new double[25];

        // Filling table with numbers from -1
        for (int i = 0; i < antoszw.length; i++) {
            antoszw[i] = -1 - i;
        }
        // Showing table
        System.out.println("Table before change:");
        for (double num : antoszw) {
            System.out.print(num + " ");
        }
        System.out.println();


        // adding 15.5 to
        for (int i = 0; i < antoszw.length; i++) {
            antoszw[i] += 15.5;
        }

        // Showing table
        System.out.println("Table after adding 15.5:");
        for (double num : antoszw) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Changing minus to plus
        for (int i = 0; i < antoszw.length; i++) {
            if (antoszw[i] < 0) {
                antoszw[i] *= -1;
            }
        }

        // Multiplying by 3 every element
        for (int i = 0; i < antoszw.length; i++) {
            antoszw[i] *= 3;
        }

        // Showing table
        System.out.println("Tablica after multiplying by 3:");
        for (double num : antoszw) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sum of every element in table
        double sum = 0;
        for (double num : antoszw) {
            sum += num;
        }
        System.out.println("Sum of every element in table: " + sum);
        ********************************************************** */
        int[] Antosz1 = new int[10];
        int[] Antosz2 = new int[10];
        int[] Antosz3 = new int[10];
        Random random = new Random();

        // Table Antosz1 filling with numbers from 0 to 99
        for (int i = 0; i < Antosz1.length; i++) {
            Antosz1[i] = random.nextInt(100);
        }

        // Table Antosz2 filling with numbers from 0 to 99
        for (int i = 0; i < Antosz2.length; i++) {
            Antosz2[i] = random.nextInt(100);
            System.out.print(i);
        }
        // Table Antosz3 filling with 0
        for (int i = 0; i < Antosz3.length; i++) {
            Antosz3[i] = 0;
        }
    }
}

//    public static void task2(String[] args) {
//
//    }
//    public static void task3(String[] args) {
//
//    }
//    public static void task4(String[] args) {
//
//    }
//    public static void task5(String[] args) {
//
//    }

