public class Math {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("Random: " + random);

        int min = 50, max = 100;
        double randomFromRange = Math.floor(Math.random()*(max-min + 1) + min);
        System.out.println("Random from range:" + randomFromRange);
    }
}
