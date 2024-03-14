class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int point = height[start];
            int target = height[end];
            int distance = end - start;
            max = Math.max(max, distance * Math.min(point, target));

            if (point >= target) {
                end--;
            } else {
                start++;
            }
        }

        return max;
    }
}