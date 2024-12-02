class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (var pos : s.toCharArray()) {
            frequency.put(pos, frequency.getOrDefault(pos, 0) + 1);
        }

        List<Character> keySet = new ArrayList<>(frequency.keySet());

        Collections.sort(keySet, (a, b) -> frequency.get(b) - frequency.get(a));

        for (var key : keySet) {
            int value = frequency.get(key);

            while (value-- > 0) {
                sb.append(key);
            }
        }

        return sb.toString();
    }
}