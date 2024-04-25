class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        solve(s, start, end);
    }

    private static void solve(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }

        char tmp = s[start];

        s[start] = s[end];
        s[end] = tmp;

        solve(s, ++start, --end);
    }
}