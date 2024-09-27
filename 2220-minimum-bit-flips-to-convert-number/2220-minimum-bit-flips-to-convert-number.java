class Solution {
    public int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        int ans = 0;

        // Brian Kernghans algorithm to count 1s
        while (xorResult != 0) {
            xorResult &= (xorResult - 1); // Clear the lowest set bit
            ans++;
        }

        return ans;
    }
}