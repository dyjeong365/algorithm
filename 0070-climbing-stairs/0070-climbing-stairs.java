class Solution {
    public int climbStairs(int n) {
        final int MAX = 45;
        int[] ways = new int[MAX + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= MAX; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }
}