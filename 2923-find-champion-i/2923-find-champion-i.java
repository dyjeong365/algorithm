class Solution {
    public int findChampion(int[][] grid) {
        final int n = grid[0].length;
        int winner = 0;

        for (int opponent = 0; opponent < n; opponent++) {
            if (opponent != winner) {
                if (grid[winner][opponent] == 0) {
                    winner = opponent;
                }
            }
        }

        return winner;
    }
}