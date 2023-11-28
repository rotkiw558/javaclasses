public class Task3 {
    public static void main(String[] args) {
        int[] tab = new int[100];

        tab[0] = 1;
        tab[1] = 1;

        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
