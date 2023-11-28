public class Tables {
    public static void main(String[] args) {
        String fname[] = new String[3]; // old syntax
        String[] lname = new String[3]; // new syntax
        fname[0] = "Chad";
        fname[1] = "Neega";
        fname[2] = "Sigma";
        System.out.println("First name from the table: " + fname[1]);
//        fname[3] = "Random";
//        System.out.println("Can I read: " + fname[3]);
        for (int i = 0; i < 3; i++) {
            System.out.println("Element from table: " + fname[i]);
        }

        System.out.println("------------------------------------------------------------------------------------");
        int[] numbers = {31,52,623,12,5,1,5,213,6432,123,76,21,6,2,5,231,62};
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

        // foreach
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Foreach loop");
        numbers[6] = -100;
        for (int variable: numbers) {
            System.out.println(variable + ", ");
        }
        System.out.println("------------------------------------------------------------------------------------");
        // rewrite last element from table to -200
        int last = numbers.length;
        System.out.println("Length of the table: " + last);
        System.out.println("23rd element from table: " + numbers[16]);
        numbers[last-1] = -200;
        System.out.println("Last element from table: " + numbers[last-1]);
        System.out.println("------------------------------------------------------------------------------------");
        // read table in reverse order
        System.out.println("Numbers in reverse order: ");
        for(int i = numbers.length-1; i>0; i--) {
            System.out.println(numbers[i] + ", ");
        }

        }

    }
