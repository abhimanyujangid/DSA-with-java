package DevideandConqure;

public class quickSort {
    public static void printAr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick sort
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // work
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // Left
        quickSort(arr, pIdx + 1, ei);
    }

    // Partition index
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place for els smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // for last pivot element
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8,-3,3, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printAr( arr);
    }
}
