class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return isPalindrome(n);
    }

    private static boolean isPalindrome(int n) {
        for (int i = 2; i < n - 1; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(n, i));

            if (!sb.toString().equals(sb.reverse().toString())) {
                return false;
            }
        }

        return true;
    }
}