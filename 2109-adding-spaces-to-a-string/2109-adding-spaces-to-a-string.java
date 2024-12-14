class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int target = spaces[idx];

        for (int i = 0; i < s.length(); i++) {
            if (i == target) {
                sb.append(" ");
                idx++;

                if (spaces.length > idx) {
                    target = spaces[idx];
                }
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}