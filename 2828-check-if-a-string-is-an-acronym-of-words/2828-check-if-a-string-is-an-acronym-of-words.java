class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();

        for (var word : words) {
            sb.append(word.charAt(0));
        }

        return sb.toString().equals(s);
    }
}