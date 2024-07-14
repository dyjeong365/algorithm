class Solution {
    public int numberOfMatches(int n) {
        int res = 0;

        while (n > 1) {
            int matches = n / 2;
            n = matches + n % 2;
            res += matches;
        }

        return res;
    }
}