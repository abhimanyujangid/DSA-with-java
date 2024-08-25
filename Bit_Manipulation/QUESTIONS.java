package Bit_Manipulation;

public class QUESTIONS {
    // Question 2 : Swap two numbers without using any third variable
    public static void swap(int x, int y) {
        System.out.println("Before swap: x = " + x + " and y = " + y);
        // swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    // Question 3 : Add 1 to an integer using Bit Manipulation.
    public static void addingOne(int x) {
        System.out.println(x + " + " + 1 + " is " + -~x);
    }

    // Question 3 : Add 1 to an integer using Bit Manipulation.
    public static int addOne(int num) {
        int m = 1; // Initialize m to represent 1 (to add 1 to the number)

        // While there is a carry
        while ((num & m) != 0) {
            num = num ^ m; // Flip the bits where m is 1
            m = m << 1; // Shift m to handle the next carry
        }

        // Add the final carry
        num = num ^ m;

        return num;
    }

    // Question 4 : This question is based on a trick, please directly look at the
    // solution.
    // Convert uppercase characters to lowercase using bits.
    public static void uperToLower() {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ')+ " ");
            // prints abcdefghijklmnopqrstuvwxyz
        }
        System.out .println();
    }

    public static void main(String[] args) {
        swap(3, 4);
        addingOne(5);
        int num = 5; // Example number
        int result = addOne(num);
        System.out.println("Original number: " + num);
        System.out.println("Number after adding 1: " + result);
        uperToLower();
    }
}
