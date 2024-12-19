class Solution {
    public int countSubstrings(String s) {
        final int LEN = s.length();
        int res = 0;

        for (int i = 0; i < LEN; i++) {
            for (int j = i; j < LEN; j++) {
                if (isPalindrome(s, i, j)) {
                    res++;
                }
            }
        }

        return res;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}