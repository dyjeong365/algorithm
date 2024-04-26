class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            int idx = s.indexOf(target);

            if (idx == s.lastIndexOf(target)) {
                return idx;
            }
        }

        return -1;
    }
}