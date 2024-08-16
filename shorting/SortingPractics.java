import java.util.*;
public class SortingPractics{


    //for bubble sort
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]) {
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;

        }
    }
    // Insertion Sort
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i-1;
            while (pre >= 0 &&  arr[pre]>curr) {
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr;
        }
    }

// Counting Sort
public static void CountingSort(int[] arr){
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }
    int countarr[] = new int [largest +1];
    for (int i = 0; i < arr.length; i++) {
        countarr[arr[i]]++;
    }

    //sorting
    int j=0;
    for (int i = 0; i < countarr.length; i++) {
        while (countarr[i]>0) {
            arr[j] = i;
            j++;
            countarr[i]--;
        }
    }
}

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(" "+arr[i] );
        }
    }
    public static void main(String[] args){
    int arr[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
    // bubblesort(arr);
   //SelectionSort(arr);
   //InsertionSort(arr);
   CountingSort(arr);
    printarr(arr);
    }
}


