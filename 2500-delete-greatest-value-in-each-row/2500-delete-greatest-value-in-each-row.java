class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

        for (var pos : grid) {
            Arrays.sort(pos);
        }

        for (int y = grid[0].length - 1; y >= 0; y--) {
            int max = -1;

            for (int x = 0; x < grid.length; x++) {
                max = Math.max(max, grid[x][y]);
            }

            ans += max;
        }

        return ans;
    }
}