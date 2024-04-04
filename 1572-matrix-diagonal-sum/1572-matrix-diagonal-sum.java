class Solution {
    public int diagonalSum(int[][] mat) {
        final int LENGTH = mat.length;
        Set<String> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }

        int i = 0;
        int j = LENGTH - 1;

        while (i <= LENGTH - 1 && j >= 0) {
            if (i != j) {
                sum += mat[i][j];
            }

            i++;
            j--;
        }

        return sum;
    }
}