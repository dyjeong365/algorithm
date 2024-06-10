class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (int i = words.length - 1; i > 0; i--) {
            String pos = words[i];

            for (int j = i - 1; j >= 0; j--) {
                String target = words[j];

                if (!answer.contains(target) && pos.contains(target)) {
                    answer.add(target);
                }
            }
        }

        return answer;
    }
}