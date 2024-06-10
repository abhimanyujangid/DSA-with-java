public class subarray {
    public static void subArray(int array[]) {
        int ts = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                int sum =0;
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(array[j2] + " ");
                    sum = sum + array[j2];
                }
                System.out.print(" Total sub array is : " + sum);                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrary " + ts);
    }

    public static void main(String arg[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        subArray(array);
    }
}
