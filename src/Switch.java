public class Switch {
    public static void main(String[] args) {
        String mark;
        mark = "w";
        switch (mark) {
            case "r": {
                System.out.println("red");
                break;
            }
            case "w":
            {
                System.out.println("white");
                break;
            }
            case "g":
            {
                System.out.println("green");
                break;
            }
            case "b":
            {
                System.out.println("blue");
                break;
            }
            case "y":
            {
                System.out.println("yellow");
                break;
            }
            default:
                System.out.println("other color");
        }

        int choice = 3;
        switch(choice){
            case 1 -> {
                System.out.println("First program");
            }
            case 2 -> {
                System.out.println("Second program");
            }
            case 3 -> {
                System.out.println("Third program");
            }
            case 4 -> {
                System.out.println("Fourth program");
            }
            default -> System.out.println("Other program");

        }

        int i = 558;
        if (i < 100) {
            System.out.println("Lower");
        } else {
            System.out.println("Bigger");
        }

        String napis = (i < 100) ? "Lower" : "Bigger";


        /************************************************************************************************************************************************************/

        int min = 1;
        int max = 100;
        int random = (int) (Math.random()*(max-min + 1) * min);
        System.out.println("Random number: " + random);

        int randomNumber = 0;
        for (int f = 0; f < 100; f++) {
            randomNumber = (int) (Math.random()*(max-min + 1) * min);
            System.out.println("Random number: " + randomNumber);
        }

        int LoopCounter = 0;
        int ValidNumbersCount = 0;
        while (ValidNumbersCount!=20) {
            randomNumber = (int) (Math.random()*(max-min+1)+min);
            if(randomNumber%3==0) {
                System.out.println("Number divisible by 3: " + randomNumber);
                ValidNumbersCount++;
            }
            LoopCounter++;

        }
        System.out.println("Loop counter: " + LoopCounter);
    }
}