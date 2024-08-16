package two_dimanction;

public class Practices {

    // Question 1 : Print the number of 7’s that are in the 2d array.
    public static void findCount(int findKey, int array[][]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (findKey == array[i][j]) {
                    count++;
                }
            }
        }
        System.err.println("The number of  key" + findKey + "is : " + count + " times");
    }

    // Question 2 : Print out the sum of the numbers in the second row of the “nums”
    // array.
    public static void countSecondRow(int nums[][]) {
        int row = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[row][i];
        }
        System.err.println("Total the 2nd row is : " + sum);
    }

    // Question 3 : Write a program to Find Transpose of a Matrix.
    // What is Transpose?
    // Transpose of a matrix is the process of swapping the rows to columns. For a
    // 2x3 matrix,
    public static void swapTansposeMatrix (int row , int col , int newarr[][] ,int matrix[][]){
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                newarr [j][i] = matrix[i][j];
            }
        }
    }

    public static void printMatrix(int[][] Matrix) {
        System.out.println("The matrix is: ");
        for(int i=0; i<Matrix.length; i++) {
        for (int j=0; j<Matrix[0].length; j++) {
        System.out.print(Matrix[i][j] + " ");
        }
        System.out.println();
        }}

    public static void main(String args[]) {
        // Question 1 : Print the number of 7’s that are in the 2d array.
        // int array[][] = { {4,7,8},{8,8,7} };
        // int findKey = 7;
        // findCount(findKey, array);

        // Question 2 : Print out the sum of the numbers in the second row of the “nums”
        // array.
        // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // countSecondRow(nums);

       // Question 3 : Write a program to Find Transpose of a Matrix.
       int row = 2 , col = 3 ;
       int matrix[][] = {{1,2,3},{4,5,6}};
       int newarr[][] = new int[col][row];
       printMatrix(matrix);
       swapTansposeMatrix(row, col, newarr, matrix);
       System.err.println();
       printMatrix(newarr);

    }
}
