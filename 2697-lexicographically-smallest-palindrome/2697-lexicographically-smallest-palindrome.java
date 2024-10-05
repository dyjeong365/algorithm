class Solution {
    public String makeSmallestPalindrome(String s) {
        final int LEN = s.length();
        char[] ans = s.toCharArray();

        for (int i = 0; i < LEN; i++) {
            if (s.charAt(i) - '0' < s.charAt(LEN - 1 - i) - '0') {
                ans[LEN - 1 - i] = ans[i];
            }

            else if (s.charAt(i) - '0' > s.charAt(LEN - 1 - i) - '0') {
                ans[i] = ans[LEN - 1 - i];
            }
        }

        return new String(ans);
    }
}