package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class STRINGS_QUESTIONS {

    // Question 1 : Count how many times lowercase vowels occurred in a String
    // entered by the user.
    public static int countLowercaseVowels(String str) {
        int count = 0;

        // Convert the string to lowercase to ensure only lowercase vowels are counted
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a lowercase vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to count lowercase vowels and print the result
        int vowelCount = countLowercaseVowels(input);
        System.out.println("Number of lowercase vowels: " + vowelCount);

        scanner.close();

        // ===========Question 4 : Determine if 2 Strings are anagrams of each other.

        String str1 = "earth";
        String str2 = "heart";
        // Convert Strings to lowercase. Why? so that we don't have to check separately
        // for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
