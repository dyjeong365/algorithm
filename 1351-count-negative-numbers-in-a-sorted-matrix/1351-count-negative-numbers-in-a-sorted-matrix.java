class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                    cnt += grid[i].length - (j + 1);
                    break;
                }

                else if (j == 0) {
                    cnt += grid[i].length;
                }
            }
        }

        return cnt;
    }
}