class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        int[] count = new int[51];

        for (var num : nums) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) {
                ans ^= i;
            }
        }

        return ans;
    }
}