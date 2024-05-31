class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] answer = new int[size];
        int fromIdx = 0;

        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(answer, fromIdx, fromIdx + nums[i], nums[i + 1]);
            fromIdx += nums[i];
        }

        return answer;
    }
}