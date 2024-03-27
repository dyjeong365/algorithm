class Solution {
    public int arraySign(int[] nums) {
        int numberOfMinus = 0;

        for (var num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                numberOfMinus++;
            }
        }

        return numberOfMinus % 2 == 0 ? 1 : -1;
    }
}