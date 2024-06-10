public class maxsubarray {
    public static void maxsubArray(int array[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prifix[] = new int[array.length];
        prifix[0] = array[0];

        // calculate prefix array
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + array[i];
        }
        for (int i = 0; i <= array.length; i++) {
            int start = i; // find start
            for (int j = i + 1; j <= array.length; j++) {
                int end = j; // find end
                currentSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];

                System.out.println("sum sub array : " + currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println();
        System.out.println("max sub array : " + maxSum);
    }

    // find sub array using prefix array
    public static void maxsubArrayPRIFIX(int array[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= array.length; i++) {
            int start = i; // find start
            for (int j = i + 1; j <= array.length; j++) {
                int end = j; // find end
                currentSum = 0;
                for (int j2 = start; j2 < end; j2++) {
                    currentSum = currentSum + array[j2]; // find sum for one element
                }
                System.out.println("sum sub array : " + currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println();
        System.out.println("max sub array : " + maxSum);
    }

    public static void main(String arg[]) {
        int array[] = { 1, -2, 6, -1, 3 };
        // maxsubArray(array);
        maxsubArrayPRIFIX(array);
    }
}
