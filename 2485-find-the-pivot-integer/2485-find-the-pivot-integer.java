class Solution {
    public int pivotInteger(int n) {
        int left = 1;
        int right = n;
        int totalSum = n * (n + 1) / 2;

        while (left < right) {
            int mid = (left + right) / 2;

            if (mid * mid < totalSum) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left * left == totalSum ? left : -1;
    }
}