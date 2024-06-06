

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

    public static void main(String[] args) {
        // int mark[] = new int[100];
        int mark[] = {1, 5, 4, 6, 2, 3, 8, 7, 4, 5, 6, 22, 55, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest: " + maxNumber(mark));
    }
}
