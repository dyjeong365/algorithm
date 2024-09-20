class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] isPangram = new boolean[26];

        for (var pos : sentence.toCharArray()) {
            isPangram[pos - 'a'] = true;
        }

        for (var pos : isPangram) {
            if (!pos) {
                return false;
            }
        }

        return true;
    }
}