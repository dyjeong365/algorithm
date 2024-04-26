class Solution {
    public int firstUniqChar(String s) {
        for (var el : s.split("")) {
            if (s.indexOf(el) == s.lastIndexOf(el)) {
                return s.indexOf(el);
            }
        }

        return -1;
    }
}