package practise.array.problems;

public class PrintArrayAfterNRotations {


    // Java implementation of
    // left rotation of an
    // array K number of times
    public static void leftRotate(int[] a, int n, int k) {


        // Print array after
        // k rotations
        for (int i = k; i < k + n; i++) {
            System.out.println(a[i % n] + " ");
        }
    }

    /* OR
            // Function to leftRotate array multiple times
void leftRotate(int arr[], int n, int k)
{
    static void leftRotate(int arr[], int n,
                                     int k)
    {
        // To get the starting point of rotated array
    int mod = k % n;

    // Prints the rotated array from
    // start position
        for(int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n]
            + " ");

        System.out.println();
}
     */

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int k = 14;
        leftRotate(a, a.length, k);
    }
}
