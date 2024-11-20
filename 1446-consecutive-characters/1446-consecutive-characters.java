class Solution {
    public int maxPower(String s) {
        int max = 1;
        char before = s.charAt(0);
        int res = 0;

        for (var pos : s.toCharArray()) {
            if (before == pos) {
                res++;
            }

            else {
                before = pos;
                max = Math.max(max, res);
                res = 1;
            }
        }
        
        max = Math.max(max, res);

        return max;
    }
}