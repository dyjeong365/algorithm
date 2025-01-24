class Solution {
    public int totalMoney(int n) {
        int start = 1;
        int res = 0;

        while (n > 0) {
            for (int day = start; day < start + Math.min(n, 7); day++) {
                res += day;
            }

            n -= 7;
            start++;
        }

        return res;
    }
}