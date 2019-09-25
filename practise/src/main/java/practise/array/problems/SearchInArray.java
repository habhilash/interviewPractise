package practise.array.problems;

import static java.lang.System.exit;

public class SearchInArray {

    static void searchForKey(int key, int a[], int mid, int left, int right) {
        if (a.length == 0 || a == null) {
            System.out.println("Array is not defined");
        }

        if (a.length == 1 && a[0] == key) {
            System.out.println("key found at : " + (a.length-1) + " index");
        } else {
            System.out.println("key not found");
        }

        if (a[mid] == key) {
            System.out.println("key found at : " + mid + " index");
            exit(0);
        } else if (key < a[mid]) {
            searchForKey(key, a, (left + mid)/2, left, mid);
        } else if (key > a[mid]) {
            searchForKey(key, a, (mid + right)/2, mid, right);
        }
    }

    public static void main(String[] args) {
        //int arr[] = null;
        //int arr[] = {};
        int arr[] = {1};
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;
        searchForKey(key, arr, arr.length/2, 0, arr.length);
    }
}
