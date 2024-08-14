class Solution {
    public int findChampion(int[][] grid) {
        final int n = grid[0].length;
        int[] counts = new int[n];
        int ans = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    counts[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (max < counts[i]) {
                max = counts[i];
                ans = i;
            }
        }

        return ans;
    }
}