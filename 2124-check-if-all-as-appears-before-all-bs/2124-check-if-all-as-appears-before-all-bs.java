class Solution {
    public boolean checkString(String s) {
        char prev = s.charAt(0);

        for (var pos : s.toCharArray()) {
            if (prev == 'b' && pos == 'a') {
                return false;
            }

            prev = pos;
        }

        return true;
    }
}