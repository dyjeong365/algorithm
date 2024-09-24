class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;

        for (var detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                ans++;
            }
        }

        return ans;
    }
}