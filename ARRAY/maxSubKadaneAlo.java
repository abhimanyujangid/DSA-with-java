public class maxSubKadaneAlo {

    //find max sub using kadane algo
    public static void maxsubKadaneAlo(int arr[]){
        int ms  = Integer.MIN_VALUE;
        int cs = 0;
         
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max Subarray is : " + ms);
    }

    // Main function
    public static void main(String arg[]){
        int arr[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsubKadaneAlo(arr);

    }
}
