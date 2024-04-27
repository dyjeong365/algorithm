class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        int len = columnTitle.length();

        for (int i = 0; i < len; i++) {
            answer += Math.pow(26, len - 1 - i) * (columnTitle.charAt(i) - 'A' + 1);
        }

        return answer;
    }
}