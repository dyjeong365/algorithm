class Solution {
    public String makeFancyString(String s) {
        final int LEN = s.length();
        StringBuilder sb = new StringBuilder();

        if (LEN < 3) {
            return s;
        }

        sb.append(s.charAt(0))
                .append(s.charAt(1));

        for (int i = 2; i < LEN; i++) {
            char first = sb.charAt(sb.length() - 2);
            char second = sb.charAt(sb.length() - 1);
            char third = s.charAt(i);

            if (first != second || second != third) {
                sb.append(third);
            }
        }

        return sb.toString();
    }
}