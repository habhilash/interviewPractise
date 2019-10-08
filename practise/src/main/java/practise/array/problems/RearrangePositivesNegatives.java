package practise.array.problems;

public class RearrangePositivesNegatives {


    static void reverse(int[] a, int l, int r) {
        if (l < r) {
            a = swap(a, l, r);
            reverse(a, ++l, --r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int i = l; // Initial index of 1st subarray
        int j = m + 1; // Initial index of IInd

        while (i <= m && a[i] < 0)
            i++;

        // arr[i..m] is positive

        while (j <= r && a[j] < 0)
            j++;

        // arr[j..r] is positive

        // reverse positive part of
        // left sub-array (arr[i..m])
        reverse(a, i, m);

        // reverse negative part of
        // right sub-array (arr[m+1..j-1])
        reverse(a, m + 1, j - 1);

        // reverse arr[i..j-1]
        reverse(a, i, j - 1);
    }

    public static void RearrangePosNeg(int[] a, int l, int r) {
        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for large l and h
            int m = l + (r-l) / 2;

            RearrangePosNeg(a, l, m);
            RearrangePosNeg(a, m+1, r);

            merge(a, l, m, r);
        }
    }

    static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,-2,3,-3,4,-4};
        int length = arr.length;

        RearrangePosNeg(arr, 0, length-1);

        for (int i=0; i<length; i++)
            System.out.println(arr[i] + " ");
    }
}
