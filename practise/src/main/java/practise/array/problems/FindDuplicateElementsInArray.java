package practise.array.problems;

// This problem can be solved using negating of arr[arr[i]] elements as well. Refer to ReplaceDuplicatesInArray
// Array should contain only n-1 elements.
public class FindDuplicateElementsInArray {

    public static void findDuplicates(int[] arr, int n) {
        for (int i=0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for(int i=0; i < n; i++) {
            if (arr[i] / n > 1)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,3,4,5};
        int n = arr.length;

        System.out.println("Repeating elements in the given array are : ");
        findDuplicates(arr, n);


    }
}
