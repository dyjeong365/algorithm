class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (var pos1 : word1) {
            sb1.append(pos1);
        }

        for (var pos2 : word2) {
            sb2.append(pos2);
        }

        return (sb1.toString()).equals((sb2.toString()));
    }
}