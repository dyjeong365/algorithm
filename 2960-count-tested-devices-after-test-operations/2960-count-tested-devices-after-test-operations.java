class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        final int n = batteryPercentages.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                ans++;

                for (int j = i + 1; j < n; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }

        return ans;
    }
}