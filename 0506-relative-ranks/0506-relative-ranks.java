class Solution {
    public String[] findRelativeRanks(int[] score) {
        final int N = score.length;
        int[] copyOfScore = Arrays.copyOf(score, N);
        String[] answer = new String[N];
        Map<Integer, String> map = new HashMap<>();

        Arrays.sort(copyOfScore);

        for (int i = 0; i < N; i++) {
            map.put(copyOfScore[i], String.valueOf(N - i));
        }

        for (int i = 0; i < N; i++) {
            String value = map.get(score[i]);

            if (value.equals("1")) {
                value = "Gold Medal";
            }

            else if (value.equals("2")) {
                value = "Silver Medal";
            }

            else if (value.equals("3")) {
                value = "Bronze Medal";
            }

            answer[i] = value;
        }

        return answer;
    }
}