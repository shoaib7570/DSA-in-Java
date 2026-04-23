public class divideconquer{

    // Function to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case
        }

        int mid = si + (ei - si) / 2;

        // Sort left half
        mergeSort(arr, si, mid);

        // Sort right half
        mergeSort(arr, mid + 1, ei);

        // Merge the two halves
        merge(arr, si, mid, ei);
    }

    // Merge two sorted subarrays
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;      // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;       // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right side
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (int t = 0; t < temp.length; t++) {
            arr[si + t] = temp[t];
        }
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}