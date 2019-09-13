package practise.array.problems;

/* Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 Solution :
 1. Divide the array two parts: 1,2,3,4 and 5, 6
 2. Rotate first part: 4,3,2,1,5,6
 3. Rotate second part: 4,3,2,1,6,5
 4. Rotate the whole array: 5,6,1,2,3,4
 */

public class RotateArray {

    static void rotate(int[] arr, int order) {
        order %= arr.length;

        if(arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }

        // Length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1); //reversing first part
        reverse(arr, a, arr.length-1); //reversing second part
        reverse(arr, 0, arr.length-1); //reversion whole array

        // print whole array
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

    }

    static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while(left < right) {
            arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[left] ^ arr[right];
            arr[left] = arr[left] ^ arr[right];
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 1; // rotation length;

        rotate(arr, k);
    }
}
