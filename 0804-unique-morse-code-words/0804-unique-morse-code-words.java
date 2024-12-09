class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set = new HashSet();

        for (var word : words) {
            StringBuilder sb = new StringBuilder();

            for (var pos : word.toCharArray()) {
                sb.append(table[pos - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}