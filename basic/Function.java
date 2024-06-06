import java.util.*;

public class Function {
    public static boolean isprime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime numbers
        if (n == 2)
            return true; // 2 is the only even prime number
        if (n % 2 == 0)
            return false; // eliminate even numbers

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // check only odd numbers
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // code for range of prime number
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i + "");
            }
        }
        System.out.println();
    }

    // create a function for gengreate a binary number
    public static void binarytoDecimal(int binNum) {
        int power = 0;
        int decimal = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of" + binNum + "=" + decimal);
    }

    // .......................Question............................//
    /*
     * Question 2 : Write a method named isEven that accepts an int argument. The
     * method
     * should return true if the argument is even, or false otherwise. Also write a
     * program to test your
     * method.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /*
     * .............Question 3 : Write a Java program to check if a number is a
     * palindrome in Java?..........
     */
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number and reversed number are the same
        return originalNumber == reversedNumber;
    }

    // Main code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the range: ");
        // int range = sc.nextInt();
        // primeInRange(range);
        // binarytoDecimal(10);
        int[] testNumbers = { 1, 2, 3, 4, 5, 10, 15, 20, 21, 22 };

        // Test and print results
        for (int number : testNumbers) {
            // System.out.println("Is " + number + " even? " + isEven(number));
            System.out.println("Is " + number + " isPalindrome? " + isPalindrome(number));
        }
    }
}
