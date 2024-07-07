class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            cnt += isGood(s.substring(i, i + 3));
        }

        return cnt;
    }

    private static int isGood(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            if (!set.add(s.charAt(i))) {
                return 0;
            }
        }

        return 1;
    }
}