class Solution {
    public int balancedStringSplit(String s) {
        int[] counts = new int[2];
        int ans = 0;

        for (var pos : s.toCharArray()) {
            if (pos == 'L') {
                counts[0]++;
            }

            else if (pos == 'R') {
                counts[1]++;
            }

            if (counts[0] == counts[1]) {
                ans++;
                counts[0] = counts[1] = 0;
            }
        }

        return ans;
    }
}