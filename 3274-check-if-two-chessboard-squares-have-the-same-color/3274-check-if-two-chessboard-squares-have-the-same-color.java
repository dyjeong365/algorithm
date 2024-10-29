class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean[][] chessBoard = new boolean[9][9];

        for (int x = 1; x < chessBoard.length; x++) {
            for (int y = x % 2 == 1 ? 1 : 2; y < chessBoard[x].length; y += 2) {
                chessBoard[x][y] = true;
            }
        }

        return chessBoard[coordinate1.charAt(0) - 'a' + 1][Character
                .getNumericValue(coordinate1.charAt(1))] == chessBoard[coordinate2.charAt(0) - 'a' + 1][Character
                        .getNumericValue(coordinate2.charAt(1))];
    }
}