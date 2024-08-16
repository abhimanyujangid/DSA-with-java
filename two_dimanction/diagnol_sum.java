package two_dimanction;

public class diagnol_sum {
    public static int dignoalSum(int matrix[][]) {
        int sum = 0;
        // ========================NOT OPTIMIZE==================================

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // }else if((i+j)==matrix.length-1){
        // sum+=matrix[i][j];
        // }
        // }
        // }
        // return sum;

        // ==========================OPTIMIZE APPORACH==========================
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };

        System.err.println(dignoalSum(matrix));
    }
}
