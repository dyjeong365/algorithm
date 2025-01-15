class Solution {
    public int minimumChairs(String s) {
        int max = -1;
        int res = 0;

        for (var pos : s.toCharArray()) {
            if (pos == 'E') {
                res++;
            }

            else if (pos == 'L') {
                res--;
            }

            max = Math.max(max, res);
        }

        return max;
    }
}