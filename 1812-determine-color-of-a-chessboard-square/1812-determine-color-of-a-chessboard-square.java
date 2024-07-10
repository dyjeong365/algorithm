class Solution {
    public boolean squareIsWhite(String coordinates) {
        final int LEN = 8;
        boolean[][] coordinate = new boolean[LEN][LEN];

        for (int i = 1; i < LEN; i += 2) {
            for (int j = 0; j < LEN; j += 2) {
                coordinate[i][j] = true;
                coordinate[j][i] = true;
            }
        }

        return coordinate[coordinates.charAt(0) - 'a'][(coordinates.charAt(1) - '0') - 1];
    }
}