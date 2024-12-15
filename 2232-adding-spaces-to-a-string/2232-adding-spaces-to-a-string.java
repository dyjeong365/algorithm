class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIdx = 0;

        for (int sIdx = 0; sIdx < s.length(); sIdx++) {
            if (spaceIdx < spaces.length && sIdx == spaces[spaceIdx]) {
                sb.append(' ');
                spaceIdx++;
            }

            sb.append(s.charAt(sIdx));
        }

        return sb.toString();
    }
}