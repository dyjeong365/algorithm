class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        final String MINUS = "-";

        while (Math.abs(num) >= 7) {
            sb.append(num % 7);
            num /= 7;
        }

        sb.append(num);

        return num < 0 ? MINUS + sb.reverse().toString().replace("-", "") : sb.reverse().toString();
    }
}