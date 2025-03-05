package JavaProgrammes;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {


        String s = "Hello i am good and i dont know the malayalam and malayalam is best for ususususususus";
        int n = s.length();
        System.out.println(n);
        String longestPalindrome = "";

        // Loop through each possible substring
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if the substring s[i..j] is a palindrome
                boolean isPalindrome = true;
                for (int left = i, right = j; left < right; left++, right--) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                }

                // If it's a palindrome and longer than the current longest, update
                if (isPalindrome && (j - i + 1) > longestPalindrome.length()) {
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longestPalindrome);

    }
}