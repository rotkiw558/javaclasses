public class MaxNumber {
    public static void main(String[] args) {
        int a = 9, b = 12, c = 13, d = 15;

        // WAY 1
        if((a>=b)&&(a>=c)&&(a>=d))
            System.out.println("Max number: " + a);
        else
            if((b>=a)&&(b>=c)&&(b>=d))
                System.out.println("Max number: " + b);
            else
            if ((c>=a)&&(c>=b)&&(c>=d))     
                System.out.println("Max number: " + c);
            else
            if ((d>=a)&&(d>=b)&&(d>=c))
                System.out.println("Max number: " + d);
        // WAY 2
            int max = a;
            if(b > max)
                max = b;
            if(c > max)
                max = c;
            if(d > max)
                max = d;
            System.out.println("Max number other way: " + max);

        // WAY 3
        System.out.println("Max number with Math.max: " + Math.max(Math.max(a, b), Math.max(c, d)));

        // TASK - you have random a,b,c,d and sort them from the lowest to the highest (1 comparison less)




    }
}
