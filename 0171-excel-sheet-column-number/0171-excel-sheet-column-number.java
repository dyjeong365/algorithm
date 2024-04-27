class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;

        /*
         * "BCM" = (2 x 26 x 26) + (3 x 26) + (13)
         * 
         * "B" = 2
         * "BC" = (2)26 + 3
         * "BCM" = (2(26) + 3)26 + 13
         */
        for (var el : columnTitle.toCharArray()) {
            answer *= 26;
            answer += el - 'A' + 1;
        }

        return answer;
    }
}