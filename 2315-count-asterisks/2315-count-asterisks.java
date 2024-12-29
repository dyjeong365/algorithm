class Solution {
    public int countAsterisks(String s) {
        int res = 0;
        int tmp = 0;
        int numberOfVerticalBar = 0;

        for (var pos : s.toCharArray()) {
            if (pos == '|') {
                if (numberOfVerticalBar == 1) {
                    res = tmp;
                    numberOfVerticalBar = 0;
                }

                else {
                    tmp = res;
                    numberOfVerticalBar++;
                }
            }

            else if (pos == '*') {
                res++;
            }
        }

        return res;
    }
}