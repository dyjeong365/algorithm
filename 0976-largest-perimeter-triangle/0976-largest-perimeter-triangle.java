class Solution {
    public int largestPerimeter(int[] nums) {
        int len = nums.length;
        int i = len - 3;
        int j = len - 2;
        int k = len - 1;

        Arrays.sort(nums);

        while (i >= 0 && j >= 0 && k >= 0) {
            int largest = nums[k];
            int sumWithoutLargest = nums[i] + nums[j];

            if (sumWithoutLargest > largest) {
                return sumWithoutLargest + largest;
            }

            i--;
            j--;
            k--;
        }

        return 0;
    }
}