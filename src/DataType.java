import com.sun.jdi.ShortValue;

public class DataType {
    public static void main(String[] args) {
    /* comment
    the same comment
    */
        // class name must be the same as filename and with first letter uppercase
        // my variable in CamelCase
        char myVariableInCamelCase;
        // c++
        char my_variable_in_type_c;
//    myVariableInCamelCase = 'y';
//    String myVariableStringType = "m";
        String text = "I am alive";
        System.out.println(text + "\nNo way");
        boolean logicalValue = false;
        if (logicalValue) {
            System.out.println("*Alive*");
        } else {
            System.out.println("*Dead*");
        }

        // byte
        byte myVariableByte = 127;
        System.out.println("My variable byte " + myVariableByte);
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min number in byte " + minByte);
        System.out.println("Max number in byte " + maxByte);

        // short
        short myVariableShort = 558;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min number in short " + minShort);
        System.out.println("Max number in short " + maxShort);

        // integer
        int myVariableInt = 123456789;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Min number in int " + minInt);
        System.out.println("Max number in int " + maxInt);

        // long
        long myVariableLong = 1234567891011l;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min number in long " + minLong);
        System.out.println("Max number in long " + maxLong);

        // float
        float myVariableFloat = 1.2345f;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Min number in float " + minFloat);
        System.out.println("Max number in float " + maxFloat);

        // double
        double myVariableDouble = 1.2345;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Min number in double " + minDouble);
        System.out.println("Max number in double " + maxDouble);

    }
}