class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int cnt = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < max) {
                    cnt++;
                }
            }

            answer[i] = cnt;
        }

        return answer;
    }
}