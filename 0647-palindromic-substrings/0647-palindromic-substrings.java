class Solution {
    static int len;

    public int countSubstrings(String s) {
        len = s.length();
        int res = len;

        for (int end = 2; end <= len; end++) {
            for (int start = 0; start < len - 1; start++) {
                // System.out.println("substring: " + s.substring(start, start + end));
                if (start + end <= len) {
                    if (isPalindrome(s.substring(start, start + end))) {
                        res++;
                    }
                }

            }
        }

        return res;
    }

    private static boolean isPalindrome(String sub) {
        StringBuilder sb = new StringBuilder(sub).reverse();

        return sub.equals(sb.toString());
    }
}