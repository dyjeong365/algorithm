class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    boolean rowFlag = true;
                    boolean colFlag = true;

                    for (int k = 0; k < n; k++) {
                        if (k != j && mat[i][k] != 0) {
                            colFlag = false;
                            break;
                        }
                    }

                    for (int l = 0; l < m; l++) {
                        if (l != i && mat[l][j] != 0) {
                            rowFlag = false;
                            break;
                        }
                    }

                    if (rowFlag && colFlag) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}