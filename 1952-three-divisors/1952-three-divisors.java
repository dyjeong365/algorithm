class Solution {
    public boolean isThree(int n) {
        int res = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res++;
            }

            if (res > 1) {
                return false;
            }
        }

        return res == 0 ? false : true;
    }
}