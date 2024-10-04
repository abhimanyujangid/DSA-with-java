package DevideandConqure;

public class MergSort {
    // For array print
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // For merge sort
    public static void mergeSort(int arr[],int si, int ei){
        // base acase
        if (si >= ei) {
            return;
        }
        //work 
        // find mid
        int mid =  si + (ei-si)/2;
        mergeSort(arr, si, mid);// fofr left part
        mergeSort(arr, mid+1, ei);// for right part
        // now we merge our array
        mergeArr(arr, si, ei, mid);

    }

    // for merge array
    public static void mergeArr(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si;// iterator for left part
        int j = mid + 1; // iterator for right part 
        int k = 0; // iterator for temo arr

        while ( i<= mid && j <= ei ) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if element present  in left part
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        // if element in present right
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (k= 0, i = si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3, 9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
