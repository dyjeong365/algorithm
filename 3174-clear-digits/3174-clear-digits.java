class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (var pos : s.toCharArray()) {
            if (Character.isDigit(pos)) {
                sb.deleteCharAt(sb.length() - 1);
            }

            else {
                sb.append(pos);
            }
        }

        return sb.toString();
    }
}