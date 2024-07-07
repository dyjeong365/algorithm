class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2)
                    && s.charAt(i + 1) != s.charAt(i + 2)) {
                cnt++;
            }
        }

        return cnt;
    }
}