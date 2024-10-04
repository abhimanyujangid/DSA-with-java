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

    // ==========First Occurence=====
    public static int firstOccurencer(int[] array, int key, int i) {
        if (i == array.length - 1) {
            return -1;
        }
        if (array[i] == key) {
            return 1;
        }
        return firstOccurencer(array, key, i+1);
    }

    //============Last Occurence==========
    public static int lastOccurence(int[] array, int key, int i){
        if (i == array.length - 1) {
            return -1;
        }
        int isFound = lastOccurence(array, key,i+1);
        if(isFound == -1 && array[i] == key){
            return i;
        }

        return isFound;
    }
    //=============power ====================
    // O(n)
    public static int power(int x ,int n){
        if(n == 0){
            return 1;
        }
        return  x * power(x, n-1);

    }
    //=============Optimize power ====================
    //O(logn)
    public static int OptimizePower(int a ,int n){
        if (n == 0) {
            return 1;
        }
        // For even 
        int hafpower = OptimizePower(a, n/2);
        int hafPowerSquar = hafpower * hafpower;
        // for odd
        if (n%2!=0) {
        hafPowerSquar = a * hafPowerSquar;
        }
        return hafPowerSquar;
    }
    //==================Tilling Problem========
    public static int tillingProblem(int n){ // 2 x n (floor size)
        if (n == 0 || n == 1) {
            return 1;
        }
        // kam
        //vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);
        int total = fnm1 + fnm2;
        return total;
    }

    //=========remove dublicate=====
    public static void removeDublicate(String str , int idx, StringBuilder newStr , boolean map[] ){
        if( idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar = str.charAt(idx);
        if (map[currChar-'a']== true) {
            //dublicate
            removeDublicate(str, idx+1, newStr, map);
            
        }else{
            map[currChar - 'a'] = true;
            removeDublicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    // 16. Friend Pairing problem

    public static int friendPairingProblem(int n){
        if (n == 1 || n == 2) {
            return n;
            
        }
        int forSinglePair= friendPairingProblem(n-1);
        int forDoublePair= friendPairingProblem(n-2);
        int totalPairing = forSinglePair + (n-1)* forDoublePair ;
        return totalPairing;
    }

    // 17. Binary String problem -Paytem (print all binary string of size n without consecutive ones).

    public static void consecutiveOnesNot(int n , int lastPlace, String str){
        if (n==0) {
            System.out.println(str);
            return;
        }
        consecutiveOnesNot(n-1, 0, str+"0");
        if (lastPlace == 0) {
            consecutiveOnesNot(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,1,1,1};
        int arr[] = { 1,2,3,4,5,6,7,8 };
        String str =  "appnnaacollengee";
        // printNumber(5);
        // System.out.println(factorial(-4));
        // System.out.println(nacturalNumberSum(10));
        // System.out.println(fibonachi(4));
        // System.out.println(sortedArray(arr, 0));
        // System.out.println(lastOccurence(array, 1, 0));
       
        // System.out.println(OptimizePower(2, 30));
        // System.out.println(power(2, 30));
        //System.out.println(tillingProblem(24));
        // removeDublicate(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(friendPairingProblem(3));
        consecutiveOnesNot(7, 0, str);

    }
}
