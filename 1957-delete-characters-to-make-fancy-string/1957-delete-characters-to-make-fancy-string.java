class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int cnt = 0;

        for (var pos : s.toCharArray()) {
            if (prev == pos) {
                cnt++;

                if (cnt < 3) {
                    sb.append(pos);
                }
            }

            else {
                sb.append(pos);
                cnt = 1;
                prev = pos;
            }
        }

        return sb.toString();
    }
}