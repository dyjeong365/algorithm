class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int ans = 0;

        for (var indice : indices) {
            int x = indice[0];
            int y = indice[1];

            for (int i = 0; i < n; i++) {
                matrix[x][i]++;
            }

            for (int j = 0; j < m; j++) {
                matrix[j][y]++;
            }
        }

        for (var cells : matrix) {
            for (var cell : cells) {
                if (cell % 2 != 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}