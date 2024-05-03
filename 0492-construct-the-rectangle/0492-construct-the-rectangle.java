class Solution {
    public int[] constructRectangle(int area) {
        // L * W = area
        // L >= W
        // L, W - small as possible
        // return [L, W]

        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                int length = i;
                int width = area / i;

                return new int[] { Math.max(length, width), Math.min(length, width) };
            }
        }

        return new int[] {};
    }
}