class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        int lastNeg = cols - 1;

        for (int row = 0; row < rows; row++) {
            if (grid[row][0] < 0) {
                res += cols;
                continue;
            }

            if (grid[row][cols - 1] > 0) {
                continue;
            }

            int l = 0;
            int r = lastNeg;

            while (l <= r) {
                int m = (l + r) / 2;

                if (grid[row][m] < 0) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            res += (cols - l);
            lastNeg = l;
        }

        return res;
    }
}