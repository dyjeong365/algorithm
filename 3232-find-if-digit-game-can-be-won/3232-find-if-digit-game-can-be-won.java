class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice = 0;
        int bob = 0;

        for (var num : nums) {
            if (num < 10) {
                alice += num;
            } else {
                bob += num;
            }
        }

        return alice != bob;
    }
}