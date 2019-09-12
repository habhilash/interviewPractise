package practise.string.problems;

import java.util.Arrays;

public class TwoStringsAnagram {

    /* O(nLogn) solution. Bruteforce solution */
    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i < n1; i++) {
            if(str1[i] != str2[i])
                return false;
        }
        return true;
    }

    /* O(n) time complexity and O(1) space complexity */
    static boolean areAnagramxor(char[] str1, char[] str2) {
        if (str1.length != str2.length)
            return false;

        int value = 0;

        for (int i=0; i < str1.length; i++) {
            value = value ^ (int) str1[i]; // char ascii values start from 97 (a)
            value = value ^ (int) str2[i];
        }

        return value == 0;
    }

    /*  */

    public static void main(String[] args) {
        char str1[] = { 'a', 't', 'e', 's', 't' };
        char str2[] = { 't', 'a', 's', 'e', 't' };
        //System.out.println(areAnagram(str1, str2));
        System.out.println(areAnagramxor(str1, str2));
    }
}
