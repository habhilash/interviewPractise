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

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int k = 1;
        leftRotate(a, a.length, k);
    }
}
