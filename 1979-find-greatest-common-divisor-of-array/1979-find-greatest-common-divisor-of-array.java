class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        return gcd(nums[0], nums[nums.length - 1]);
    }

    private static int gcd(int smallest, int largest) {
        if (largest == 0) {
            return smallest;
        }

        return gcd(largest, smallest % largest);
    }
}