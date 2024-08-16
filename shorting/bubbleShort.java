import java.util.*;

public class bubbleShort {
    public static void bubbleSort(Integer arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(Integer arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than curr,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place curr at the correct position
            arr[j + 1] = curr;
        }
    }


    // counting sort 
    public static void  CountingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting  
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0 ) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        ;
        // bubbleSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        CountingSort(arr);
        printarr(arr);
    }
}
