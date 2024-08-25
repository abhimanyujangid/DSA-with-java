package Bit_Manipulation;

public class practics {

    // Function for Clear Bit by given range
    public static int clearBitRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (i << i) - 1;
        int bit_mask = a | b;
        return bit_mask & n;
    }

    // Cheak if a number is a power of two
    public static void powerOfTwo(int n) {
        int j = n - 1;
        if ((j & n) == 0) {
            System.err.println("Given number is even ");
        } else {
            System.err.println(" Given number is odd");
        }
    }
    
    // Cout 1's in these bit
    public static int CountSetBit(int n){
        int count = 0;
        while (n>0) {
            if ((n  & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // Fast Expontaintal
    public static int fastExpo(int a , int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans =  ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.err.println(clearBitRange(10, 03, 7));
        powerOfTwo(7);
        System.err.println("Given number 1's is" + CountSetBit(10));
        System.err.println(fastExpo(3, 5));
    }
}
