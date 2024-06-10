public class pairinarray {
    //pair function
    public static void pairinarray(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print(" (" + array[i] + "," + array[j]+ ") ");
            }
            System.out.println("");
        }
    }
    //main function
    public static void main(String[] args) {
        int array[] = { 2,4,6,8,10};
        pairinarray(array);
    }
    
}


// FIND TOTAL NUMBER OF PAIRS
// {
//     Total number of pair = n(n-1)/2
// }