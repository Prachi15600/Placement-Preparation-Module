class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s; // Single character or empty string is already a palindrome

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for two-character palindromes
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes longer than 2 characters
        for (int length = 3; length <= n; length++) { // length of substring
            for (int i = 0; i <= n - length; i++) { // start index
                int j = i + length - 1; // end index
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}