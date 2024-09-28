class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int ans = 0;

        for (var pos : s.toCharArray()) {
            sum += pos == 'L' ? 1 : -1;

            if (sum == 0) {
                ans++;
            }
        }

        return ans;
    }
}