class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] nums = new int[2001];
        int cnt = 0;

        for (var el : arr) {
            nums[el]++;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            }

            if (cnt == k) {
                return i;
            }
        }

        return -1;
    }
}