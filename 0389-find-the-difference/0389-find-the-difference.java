class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(t);

        for (var el : s.toCharArray()) {
            int idx = sb.toString().indexOf(el);

            sb.deleteCharAt(idx);
        }

        return sb.toString().charAt(0);
    }
}