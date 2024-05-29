class Solution {
    public int heightChecker(int[] heights) {
        int[] copyOfHeights = Arrays.copyOf(heights, heights.length);
        int cnt = 0;

        Arrays.sort(copyOfHeights);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copyOfHeights[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}