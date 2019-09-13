package practise.string.problems;

/**
 * Longest Palindromic Substring in Java
 *
 */

public class LongestPalindromicSubString {

    public static void main(String[] args) {
        String str = "abbba";
        String longestPalindromeSubStr = longestPanlindrom(str);
        System.out.println("Longest panlindrome sub string is : " + longestPalindromeSubStr);
    }

    public static String longestPanlindrom(String str) {
        if (str == null)
            return null;
        if (str.length() == 1)
            return str;

        String longestpalindrome = str.substring(0,1);
        for (int i=0; i<str.length(); i++) {

            // i is centre
            String tmp = checkPalindrome(str, i, i);
            if (tmp.length() > longestpalindrome.length())
                longestpalindrome = tmp;

            //i, i+1 is centre
            tmp = checkPalindrome(str, i, i+1);
            if (tmp.length() > longestpalindrome.length())
                longestpalindrome = tmp;
        }
        return longestpalindrome;
    }

    public static String checkPalindrome(String s, int begin, int end) {
        while (begin>=0 && end<=s.length()-1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin+1, end);
    }
}
