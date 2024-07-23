class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        final int COL = image.length;
        final int ROW = image[0].length;
        int[][] ans = new int[COL][ROW];

        for (int i = 0; i < COL; i++) {
            for (int j = ROW - 1; j >= 0; j--) {
                ans[i][ROW - j - 1] = image[i][j] == 0 ? 1 : 0;
            }
        }

        return ans;
    }
}