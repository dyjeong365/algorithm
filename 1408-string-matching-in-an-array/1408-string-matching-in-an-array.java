class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        String str = String.join(" ", words);

        for (int i = 0; i < words.length; i++) {
            String target = words[i];

            if (str.indexOf(target) != str.lastIndexOf(target)) {
                answer.add(target);
            }
        }

        return answer;
    }
}