class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (var num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        return gcd(smallest, largest);
    }

    private static int gcd(int smallest, int largest) {
        if (largest == 0) {
            return smallest;
        }

        return gcd(largest, smallest % largest);
    }
}