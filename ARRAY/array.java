import java.util.Arrays;
import java.util.Scanner;

public class array {
    
    //***********create a function to get the largest number********** */
    public static int maxNumber(int[] mark) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > largest) { // Change from < to > to find the largest number
                largest = mark[i];
            }
        }
        return largest;
    }

    //********************************Binary search**********************\\
    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (number[mid] == key) { // found
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int mark[] = {32, 14, 25, 7, 9, 18, 21, 3, 50, 43, 12, 1, 27, 19, 34, 11, 17, 45, 6, 29, 24, 8, 10, 33, 22, 16, 39, 13, 31, 28};
        
        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();

        // Sort the array
        Arrays.sort(mark);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();

        // Find and print the largest number
        System.out.println("Largest: " + maxNumber(mark));
        
        int number[] = {2, 3, 4, 5, 6, 8, 9, 10, 11, 15, 16, 22, 25, 26, 28, 29, 35, 36, 38, 39, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        // Perform binary search
        int index = binarySearch(number, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        sc.close();
    }
}
