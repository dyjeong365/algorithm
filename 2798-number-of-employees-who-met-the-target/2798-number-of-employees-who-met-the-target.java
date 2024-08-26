class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;

        for (var hour : hours) {
            if (hour >= target) {
                ans++;
            }
        }

        return ans;
    }
}