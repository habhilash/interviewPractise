package practise.array.problems;

import java.util.Arrays;

public class PairsSumArray {

    public void sumOfPairs(int[] arr, int sum) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                System.out.println("The pair is : (" + arr[left] + ", " + arr[right] + ")");
            }
            if (arr[left] + arr[right] > sum) {
                right--;
            }
            else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
            int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
            Arrays.sort(arr);

            PairsSumArray pairsSumArray = new PairsSumArray();
            pairsSumArray.sumOfPairs(arr, 6);
    }

}


