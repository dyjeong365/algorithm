class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] grid = new int[n][n];
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = (i * n) + j;
            }
        }

        for (var command : commands) {
            if (command.equals("UP")) {
                x--;
            }

            else if (command.equals("RIGHT")) {
                y++;
            }

            else if (command.equals("DOWN")) {
                x++;
            }

            else if (command.equals("LEFT")) {
                y--;
            }
        }

        return grid[x][y];
    }
}