class Solution {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i < 16; i++) {
            int ans = (int) Math.pow(4, i);

            if (ans == n) {
                return true;
            }
        }

        return false;
    }
}