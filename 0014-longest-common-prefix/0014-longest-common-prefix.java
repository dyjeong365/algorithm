class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;

        if (strs.length == 1)
            return strs[0];

        for (var str : strs) {
            min = Math.min(min, str.length());
            if (str.isEmpty())
                return "";
        }

        for (int i = 0; i < min; i++) {
            char point = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (point != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, min);
    }
}