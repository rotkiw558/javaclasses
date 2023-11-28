public class RootTable {

    public static void root(int a, int b, int c) {
        double delta = (b*b) - (4 * a * c);
        double x1, x2;
        if (delta>0) {
            x1 = (-b +  Math.sqrt(delta))/(2*a);
            x2 = (-b -  Math.sqrt(delta))/(2*a);
            System.out.println("There're 2 solutions. " + "x ∈ {" + x1 + ", " + x2 + "}");
            return;
        } else if (delta == 0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("There's 1 solution. " + "x = " + x1);
            return;
        }
        System.out.println("No solution");
    }

    public static void main(String[] args) {
        root(1,1,-1);
    }
}
