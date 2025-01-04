class Solution {
    public String sortVowels(String s) {
        final int LEN = s.length();
        List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        List<Character> target = new ArrayList<>();
        List<Integer> targetIdx = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < LEN; i++) {
            char pos = s.charAt(i);

            if (vowels.contains(pos)) {
                target.add(pos);
                targetIdx.add(i);
            }
        }

        Collections.sort(target);

        for (int i = 0; i < target.size(); i++) {
            sb.setCharAt(targetIdx.get(i), target.get(i));
        }

        return sb.toString();
    }
}