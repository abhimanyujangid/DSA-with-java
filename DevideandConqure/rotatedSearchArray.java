package DevideandConqure;

public class rotatedSearchArray {

    public static int search(int arr[], int tar, int si, int ei) {
        
        // Base Case
        if (si > ei) {
            return -1;
        }
        
        // Find mid
        int mid = si + (ei - si) / 2;

        // case 1
        if (arr[mid] == tar) {
            return mid;
        }

        // case 2 mid put on L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return  search(arr, tar, si, mid-1);
            }else{
                //case : b
                return search(arr, tar, mid+1, ei);
            }
        } else {
            // case : c
            if (arr[mid] <= tar && tar <= arr[ei] ) {
                return search(arr, tar, mid+1, ei);
            }else{
                // case : d
                return search(arr, tar, si, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2; // output 4
        int taridx = search(arr, target, 0, arr.length - 1);
        System.out.println(taridx);
    }
}
