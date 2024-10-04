package recursion;

public class QUESTIONS {
    /*
     * Question 1 : For a given integer array of size N. You have to find all the
     * occurrences
     * (indices) of a given element (Key) and print them. Use a recursive function
     * to solve this
     * problem.
     */
    public static void findOccurence(int arr[], int index, int key) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        findOccurence(arr, index + 1, key);
    }

    /*
     * Question 2 : You are given a number (eg - 2019), convert it into a String of
     * english like
     * “two zero one nine”. Use a recursive function to solve this problem.
     * NOTE - The digits of the number will only be in the range 0-9 and the last
     * digit of a number
     * can’t be 0.
     */
    public static void numberToCharcter(String numberArray[], int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        number = number / 10;
        numberToCharcter(numberArray, number);
        System.out.print(numberArray[lastDigit] + " ");
    }

    // Question 3 : Write a program to find Length of a String using Recursion.
    public static int stringCount(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + stringCount(str.substring(1));
    }

    // Question 4 : We are given a string S, we need to find the count of all
    // contiguous substrings
    // starting and ending with the same character.
    
    public static void main(String[] args) {
        // Ouestion 1
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // findOccurence(arr, 0, 2);
        // System.out.println();

        // Question 2
        // String numberArray[] = {"zero", "one", "two", "three", "four", "five",
        // "six","seven", "eight", "nine"};
        // numberToCharcter(numberArray,1947);
        // System.out.println();

        // Question 3
        // String str = "abcde";
        // int Length = stringCount(str);
        // System.out.println(Length);
    }
}
