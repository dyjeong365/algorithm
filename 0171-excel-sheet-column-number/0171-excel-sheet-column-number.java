class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;

        for (var el : columnTitle.toCharArray()) {
            sum *= 26;
            sum += el - 'A' + 1;
        }

        return sum;
    }
}