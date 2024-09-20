class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (var pos : sentence.toCharArray()) {
            set.add(pos);
        }

        return set.size() == 26;
    }
}