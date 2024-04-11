class Solution {
    public String tictactoe(int[][] moves) {
        String[][] table = new String[3][3];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            table[row][col] = i % 2 == 0 ? "A" : "B";
        }

        List<String> listOfLeftDiagonals = new ArrayList<>();
        List<String> listOfRightDiagonals = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            List<String> listOfRows = new ArrayList<>();
            List<String> listOfCols = new ArrayList<>();

            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j] != null) {
                    // row
                    listOfRows.add(table[i][j]);

                    // leftDiagonal
                    if (i == j) {
                        listOfLeftDiagonals.add(table[i][j]);
                    }

                    // rightDiagonal
                    if (i + j == 2) {
                        listOfRightDiagonals.add(table[i][j]);
                    }
                }

                if (table[j][i] != null) {
                    // col
                    listOfCols.add(table[j][i]);
                }
            }

            if (listOfRows.size() == 3 && listOfRows.get(0).equals(listOfRows.get(1))
                    && listOfRows.get(0).equals(listOfRows.get(2))) {
                return listOfRows.get(0);
            }

            else if (listOfCols.size() == 3 && listOfCols.get(0).equals(listOfCols.get(1))
                    && listOfCols.get(0).equals(listOfCols.get(2))) {
                return listOfCols.get(0);
            }
        }

        if (listOfLeftDiagonals.size() == 3 && listOfLeftDiagonals.get(0).equals(listOfLeftDiagonals.get(1))
                && listOfLeftDiagonals.get(0).equals(listOfLeftDiagonals.get(2))) {
            return listOfLeftDiagonals.get(0);
        }

        else if (listOfRightDiagonals.size() == 3 && listOfRightDiagonals.get(0).equals(listOfRightDiagonals.get(1))
                && listOfRightDiagonals.get(0).equals(listOfRightDiagonals.get(2))) {
            return listOfRightDiagonals.get(0);
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}