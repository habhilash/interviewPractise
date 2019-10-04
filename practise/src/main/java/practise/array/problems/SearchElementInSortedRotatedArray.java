package practise.array.problems;

public class SearchElementInSortedRotatedArray {

    public static int search(int[] a, int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = (l+h)/2;
        if(a[mid] == key)
            return mid;

        /* If arr[l...mid] first subarray is sorted */
        if (a[l] <= a[mid])
        {
             /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= a[l] && key <= a[mid]) {
                return search(a, l, mid-1, key);
            }

            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return search(a, mid+1, h, key);
        }

        if (key >= a[mid] && key <= a[h]) {
            return search(a, mid+1, h, key);
        }

        return search(a, l, mid-1, key);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int n = arr.length;
        int key = 6;

        int i = search(arr, 0, n-1, key);

        if(i != -1)
            System.out.println("Key found at Index : " + i);
        else
            System.out.println("Key not found");
    }
}
