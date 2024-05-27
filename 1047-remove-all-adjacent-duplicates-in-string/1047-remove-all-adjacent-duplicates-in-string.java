class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (var el : s.toCharArray()) {
            int len = sb.length();

            if (len > 0 && sb.charAt(len - 1) == el) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(el);
            }
        }

        return sb.toString();
    }
}