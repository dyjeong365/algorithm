class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int point = height[start];
            int target = height[end];
            int w = end - start;
            int h = Math.min(point, target);
            int area = w * h;
            max = Math.max(max, area);

            if (point > target) {
                end--;
            } else if (point < target) {
                start++;
            } else {
                // whatever future area calculated will always be less than our original area
                // So we change the start and end values together.
                start++;
                end--;
            }
        }

        return max;
    }
}