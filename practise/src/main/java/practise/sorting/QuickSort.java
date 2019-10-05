package practise.sorting;

public class QuickSort {

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */

    public static void quickSort(int[] a, int low, int high) {
        int pivot;

        if (high > low) {
            /* pivot is partitioning index, arr[pivot] is
              now at right place */
            pivot = partition(a, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private static int partition(int[] a, int low, int high) {
        int pivot_item = a[high];
        int i = low-1; //Index of smaller element

        for (int j=low; j<high; j++) {
            if (a[j] < pivot_item) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,7,5,6};
        quickSort(arr, 0, arr.length-1);

        for (int i=0; i< arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
