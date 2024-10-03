package Intro;
public class dataTypes {
    public static void main(String[] args) {
        // int myNum = 5; // Integer (whole number)
        // float myFloatNum = 5.99f; // Floating point number
        // char myLetter = 'D'; // Character
        // boolean myBool = true; // Boolean
        // String myText = "Hello"; // String

        /*
         * Premitive Data Types
         * 
         * byte 1 byte Stores whole numbers from -128 to 127
         * short 2 bytes Stores whole numbers from -32,768 to 32,767
         * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
         * decimal digits
         * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
         * digits
         * boolean 1 bit Stores true or false values
         * char 2 bytes Stores a single character/letter or ASCII values
         */

        // float f1 = 35e3f;
        // double d1 = 12E4d;
        // System.out.println(f1);
        // System.out.println(d1);

        // char char1 = 'h';
        // System.out.println(char1);

        // char myChar1 = 66, myChar2 = 65;

        // System.out.println(myChar1);
        // System.out.println(myChar2);

        // Type casting

        double myDouble = 6.66d;

        int myInt = (int)myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
