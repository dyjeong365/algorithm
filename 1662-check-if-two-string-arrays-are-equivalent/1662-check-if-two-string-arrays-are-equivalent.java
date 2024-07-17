class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (var pos1 : word1) {
            str1 += pos1;
        }

        for (var pos2 : word2) {
            str2 += pos2;
        }

        return str1.equals(str2);
    }
}