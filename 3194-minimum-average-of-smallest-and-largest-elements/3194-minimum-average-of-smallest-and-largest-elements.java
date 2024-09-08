class Solution {
    public double minimumAverage(int[] nums) {
        final int n = nums.length;
        Queue<Double> priorityQueue = new PriorityQueue<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            priorityQueue.offer((nums[i] + nums[n - i - 1]) / 2.0);
        }

        return priorityQueue.poll();

    }
}