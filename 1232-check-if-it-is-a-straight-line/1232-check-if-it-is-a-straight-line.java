class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        int dx = x1 - x0;
        int dy = y1 - y0;

        for (var coordinate : coordinates) {
            int x = coordinate[0];
            int y = coordinate[1];

            // (y - y1) / (x - x1) = (y1 - y0) / (x1 - x0)
            if (dx * (y - y1) != dy * (x - x1)) {
                return false;
            }
        }

        return true;
    }
}