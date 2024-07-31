class Solution {
    public boolean halvesAreAlike(String s) {
        final int LEN = s.length();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String a = s.substring(0, LEN / 2);
        String b = s.substring(LEN / 2);
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < LEN / 2; i++) {
            if (vowels.contains(a.charAt(i))) {
                aCount++;
            }

            if (vowels.contains(b.charAt(i))) {
                bCount++;
            }
        }

        return aCount == bCount;
    }
}