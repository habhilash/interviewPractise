package practise.array.problems;


// If duplicates are there in array, then replace with -1
public class ReplaceDuplicatesInArray {

    public static void replaceDuplicates(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            if (arr[ Math.abs(arr[i])] >= 0)
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
            else {
                if(arr[Math.abs(arr[i])] != -1)
                arr[i] = -1;
            }
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] != -1)
                arr[i] = Math.abs(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,5,3,7,6,9,3,4};
        replaceDuplicates(arr);

        for(int i=0; i< arr.length; i++)
            System.out.println(arr[i]);
    }
}
