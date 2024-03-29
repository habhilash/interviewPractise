package practise.array.problems;

public class CountRotationsSortedArray {


    public static int countRotations(int[] a, int low, int high) {
        if (high < low)
            return 0;

        if (high == low)
            return low;

        int mid = low + (high-low) / 2;

        if (mid < high && a[mid+1] < a[mid])
            return (mid+1);

        if (mid > low && a[mid] < a[mid-1])
            return mid;

        if (a[mid] < a[high])
            return countRotations(a, low, mid-1);

        return countRotations(a, mid + 1, high);

    }

    public static void main(String[] args) {
        int[] a = {3,4,5,6,7,1,2};
        int no_of_rotations = countRotations(a, 0, a.length-1);
        System.out.println("No. of rotations in the given sorted array : " + no_of_rotations);
        // Prints minimum element in rotated sorted array.
        System.out.println("Minimum element in the array : " + a[no_of_rotations]);
    }
}
