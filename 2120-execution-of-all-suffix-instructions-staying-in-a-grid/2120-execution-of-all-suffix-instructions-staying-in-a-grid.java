class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        final int LEN = s.length();
        int[] res = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int row = startPos[0];
            int col = startPos[1];
            int cnt = 0;

            for (var pos : s.substring(i).toCharArray()) {
                if (pos == 'U') {
                    row--;
                }

                else if (pos == 'R') {
                    col++;
                }

                else if (pos == 'D') {
                    row++;
                }

                else if (pos == 'L') {
                    col--;
                }

                if (row < 0 || row >= n || col < 0 || col >= n) {
                    break;
                }

                else {
                    cnt++;
                }
            }

            res[i] = cnt;
        }

        return res;
    }
}