class Solution {
    public int maxProductDifference(int[] nums) {
        final int LEN = nums.length;
        int max = 0;
        int secondMax = 0;
        int min = 10001;
        int secondMin = 10001;

        for (var num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } 
            
            else if (num > secondMax) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } 
            
            else if (num < secondMin) {
                secondMin = num;
            }
        }

        return (max * secondMax) - (min * secondMin);
    }
}