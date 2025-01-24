class Solution {
    public int totalMoney(int n) {
        int k = n / 7;
        int F = 28;
        int L = 28 + (k - 1) * 7;
        int sum = k * (F + L) / 2;

        int lastWeek = 0;
        int monday = k + 1;

        for (int day = 0; day < n % 7; day++) {
            lastWeek += monday + day;
        }

        return sum + lastWeek;
    }
}