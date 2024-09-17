class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;

            for (var pos : s.substring(i, i + k).toCharArray()) {
                sum += pos - 'a';
            }

            result.append((char) (sum % 26 + 'a'));
        }

        return result.toString();
    }
}