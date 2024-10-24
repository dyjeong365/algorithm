class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;
        int[] mSum = new int[m];
        int[] nSum = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mSum[i] += mat[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                nSum[j] += mat[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && mSum[i] == 1 && nSum[j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}