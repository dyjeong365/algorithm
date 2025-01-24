class Solution {
    public int totalMoney(int n) {
        int start = 0;
        int res = 0;

        for (int i = 0; i < n / 7; i++) {
            start++;

            for (int j = start; j < start + 7; j++) {
                res += j;
            }
        }

        for (int k = start + 1; k < start + 1 + (n % 7); k++) {
            res += k;
        }

        return res;
    }
}