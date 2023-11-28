public class Loops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10)
        {
            System.out.println("i (while): " + i);
            i++;
        }

        i = 0;
        do {
            System.out.println("i (do while): " + i);
            i++;
        }while (i <=10);

        int j = 1;
        for ( ;; ) {
            if (j <= 10000) {
                System.out.println("j (for): " + j);
                j++;
            }
            else
                break;
        }

        for (int x=1; x <=50; x++) {
            if(x%2==0) {
                System.out.println("Even number: " + x);
            }
        }

        for(int n=20; n >=1; n--) {
            System.out.println(n);
            if (n == 1) {
                System.out.println("BUM");
            }
        }

        for(int a=150; a >=1; ) {
            System.out.println(a);
            a -= 5;
        }

        int sum = 0;
        for(int b=0; b <=10; b++) {
            sum += b;
            if (b == 10) {
                System.out.println("Sum: " + sum);
            }
        }

        for (int g=10; g <=100; g++) {
            if (g >= 50 && g<=60) {
                continue;
            }
            System.out.println(g);
        }

        for (int v=1; v <=5; v++) {
            System.out.println();
            for (int h=1; h <=5; h++) {
                System.out.print("*");
            }
        }

        for (int y=1; y <=5; y++) {
            System.out.println();
            for (int m=1; m<=y; m++) {
                System.out.print("*");
            }
        }

        for (int y=1; y <=5; y++) {
            System.out.println();
            for (int m=5; m>=y; m--) {
                System.out.print("*");
            }
        }

    }
}
