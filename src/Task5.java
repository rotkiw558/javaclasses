public class Task5 {
    public static void main(String[] args) {
        char[] tab_ASCII = new char[128];
        for (int i = 0; i < 128; i++) {
            tab_ASCII[i] = (char) i;
            System.out.println("Number: " + i + ", Char: " + tab_ASCII[i]);
        }
    }
}
