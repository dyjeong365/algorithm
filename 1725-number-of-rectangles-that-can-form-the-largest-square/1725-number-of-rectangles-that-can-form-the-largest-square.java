class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int ans = 0;
        int max = 0;

        for (var rectangle : rectangles) {
            int length = rectangle[0];
            int width = rectangle[1];
            int min = Math.min(length, width);

            if (min > max) {
                ans = 1;
                max = min;
            }

            else if (min == max) {
                ans++;
            }
        }

        return ans;
    }
}