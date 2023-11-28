package Functions;

// gson = grandson
// gma = grandma
// gpa = grandpa

public class SendingArgumentsToFunction {
    public static void main(String[] args) {

        int gma = 1;
        System.out.println("The argument value before function " + gma); // what gma looks like
        gson(gma); // dad sends gma to gson
        System.out.println("The argument value after function " + gma); // uff, gma is okay

        int[] secondGma = {2}; // second gma
        System.out.println("How does second gma looks before " + secondGma);
        gson(secondGma);
        System.out.println("After gson play " + secondGma[0]);
    }

    public static void gson(int[] play) {
        play[0] = 100;
        System.out.println("Gson is drawing gma " + play[0]);
    }

    // gson 1 gma
    // copy
    public static void gson(int number) { // gson receives copy of pic
        number = 100; // gson play
        System.out.println("Our number inside function " + number); // gma is gpa
    }
}
