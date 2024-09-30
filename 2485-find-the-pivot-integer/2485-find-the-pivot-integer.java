class Solution {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }

        int x = n / 2 + 1;

        while (x <= n) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 1; i <= x; i++) {
                leftSum += i;
            }

            for (int j = x; j <= n; j++) {
                rightSum += j;
            }

            if (leftSum == rightSum) {
                return x;
            } else {
                x++;
            }
        }

        return -1;
    }
}