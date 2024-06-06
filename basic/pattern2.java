public class pattern2 {
    //HOLLOW RECTANGLE pattern.....................................
    public static void hollow_rectangel(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
//invrtedAndRotated......................................
    public static void invrtedAndRotated(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols-i; j++) {
                // cell - (i,j)
                    System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
//INVERTED HALF-PYRAMID with Numbers pattern...........................
public static void InvertedHalfPramid(int totRows, int totCols) {
    // outer loop
    for (int i = 1; i <= totRows; i++) {
        // inner - columns
        for (int j = 1; j <= totCols-i+1; j++) {
                System.out.print(j + "");
        }
        System.out.println();
    }
}

//FLOYD'S Triangle pattern......................
public static void floydTriangle(int totRows, int totCols) {
    // outer loop
    int counter = 1;
    for (int i = 1; i <= totRows; i++) {
        // inner - columns
        for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
        }
        System.out.println();
    }
}
//0-1 Triangle pattern..............................
public static void trianglezeroOrOne(int totRows, int totCols) {
    // outer loop
    int counter = 1;
    for (int i = 1; i <= totRows; i++) {
        // inner - columns
        for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
        }
        System.out.println();
    }
}
    public static void main(String args[]) {
       // hollow_rectangel(10, 7);
       //invrtedAndRotated(9, 9);
       //InvertedHalfPramid(5,5);
       floydTriangle(5, 5);
    }

}
