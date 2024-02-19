class Solution {
    public boolean isAnagram(String s, String t) {
        final int numberOfAlphabet = 26;
        int[] alphabetOfS = new int[numberOfAlphabet];
        int[] alphabetOfT = new int[numberOfAlphabet];

        for(var el : s.toCharArray()) {
            alphabetOfS[el - 'a']++;
        }

        for(var el : t.toCharArray()) {
            alphabetOfT[el - 'a']++;
        }

        return Arrays.equals(alphabetOfS, alphabetOfT);
    }
}