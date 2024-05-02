class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                int count = 1;

                for (int j = i + 1; j < len; j++) {
                    if (nums[j] == 0) {
                        break;
                    }

                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}