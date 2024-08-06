class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        final int MAX = grid.length * grid[0].length;
        int[] counts = new int[MAX + 1];
        int[] ans = new int[2];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                counts[grid[i][j]]++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                ans[0] = i;
            }

            if (counts[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}