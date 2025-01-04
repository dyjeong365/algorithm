class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        int[] count = new int[1000];

        for (var pos : s.toCharArray()) {
            count[pos - 'A']++;
        }

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(String.valueOf(s.charAt(i)))) {
                sb.append(s.charAt(i));
            } else {
                while (count[vowels.charAt(j) - 'A'] == 0) {
                    j++;
                }

                sb.append(vowels.charAt(j));
                count[vowels.charAt(j) - 'A']--;
            }
        }

        return sb.toString();
    }
}