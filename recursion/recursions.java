package recursion;

public class recursions {
    // ======= print number increase order
    public static void printNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNumber(n - 1);
        System.out.println(n);
    }

    // ====== print factorial of a number n
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            int fact = n * factorial(n - 1);
            return fact;
        }
    }

    // ===Print sum of First n natural number
    public static int nacturalNumberSum(int n) {
        if (n == 1) {
            return 1;
        }
        int totalSum = n + nacturalNumberSum(n - 1);
        return totalSum;
    }

    // Print nth Fibonacci number = add last tow number
    // 0 1 1 2 3 5 8 13
    public static int fibonachi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibonachi(n - 1);
        int fib2 = fibonachi(n - 2);
        int fn = fib1 + fib2;
        return fn;
    }

    // ======Check sorted array======
    public static boolean sortedArray(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        printNumber(5);
        System.out.println(factorial(-4));
        System.out.println(nacturalNumberSum(10));
        System.out.println(fibonachi(4));
        System.out.println(sortedArray(arr, 0));
    }
}
