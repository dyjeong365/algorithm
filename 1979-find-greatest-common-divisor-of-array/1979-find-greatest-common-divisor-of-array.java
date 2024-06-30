class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        return gcd(nums[0], nums[nums.length - 1]);
    }

    private static int gcd(int smallest, int largest) {
        for (int i = largest; i > 0; i--) {
            if (largest % i == 0 && smallest % i == 0) {
                return i;
            }
        }

        return 1;
    }
}