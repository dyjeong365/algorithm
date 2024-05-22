class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] concat = (s1 + " " + s2).split(" ");
        String[] answer = new String[0];
        int i = 0;

        for (var el : concat) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (var entrySet : map.entrySet()) {
            String key = entrySet.getKey();
            Integer value = entrySet.getValue();

            if (value == 1) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[i++] = key;
            }
        }

        return answer;
    }
}