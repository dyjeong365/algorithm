class Solution {
    public String removeOccurrences(String s, String part) {
        final int PART_LEN = part.length();
        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf(part) >= 0) {
            int idx = sb.indexOf(part);

            for (int i = 0; i < PART_LEN; i++) {
                sb.deleteCharAt(idx);
            }
        }

        return sb.toString();
    }
}