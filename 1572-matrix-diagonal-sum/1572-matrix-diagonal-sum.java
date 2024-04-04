class Solution {
    public int diagonalSum(int[][] mat) {
        final int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // sum of all elements on the primary diagonal
            sum += mat[i][i];

            // sum of all elements on the secondary diagonal
            int j = n - 1 - i;

            if (i != j) {
                sum += mat[i][j];
            }
        }

        return sum;
    }
}