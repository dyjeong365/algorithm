class Solution {
    public int countAsterisks(String s) {
        int res = 0;
        int bars = 0;

        for (var pos : s.toCharArray()) {
            if (pos == '*' && bars % 2 == 0) {
                res++;
            }

            if (pos == '|') {
                bars++;
            }
        }

        return res;
    }
}