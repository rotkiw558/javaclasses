public class Operators {
    public static void main(String[] args) {
        {
            int x = 11;
            System.out.println("Block variable " + x);
        }
        {
            for (int x=1; x<10; x++) {
                System.out.println("Variable in a loop " + x);
            }
        }

        double a = 1, b = 1, c = 1, d = 1;
        System.out.println("++a = " + - ++a
                + " \n b++ = " + b++
                + " \n --c = " + --c
                + " \n d-- = " + d--);
        a+=2;
        b-=2;
        c*=2;
        d/=2;
        System.out.println("a +=2 " + a
                + " \n b-=2 " + b
                + " \n c*=2 " + c
                + " \n d/=2 " + d);
    }
}
