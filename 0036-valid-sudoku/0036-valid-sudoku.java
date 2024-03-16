class Solution {
    public boolean isValidSudoku(char[][] board) {
        final int MAX = 9;
        Set seen = new HashSet();

        for (int x = 0; x < MAX; x++) {
            for (int y = 0; y < MAX; y++) {
                char value = board[x][y];

                if (value != '.') {
                    if (!seen.add(value + " in row " + x)
                            || !seen.add(value + " in column " + y)
                            || !seen.add(value + " in box " + x / 3 + ", " + y / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}