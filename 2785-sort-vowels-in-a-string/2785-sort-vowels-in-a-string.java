class Solution {
    public String sortVowels(String s) {
        final int LEN = s.length();
        List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        List<Character> target = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < LEN; i++) {
            char pos = s.charAt(i);

            if (vowels.contains(pos)) {
                target.add(pos);
            }
        }

        Collections.sort(target);

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                sb.append(target.get(j++));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}