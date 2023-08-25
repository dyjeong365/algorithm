import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        final int LENGTH = score.length;
        int[] answer = new int[LENGTH];
        List<Integer> scoreList = new ArrayList<>();
        
        for(int i=0; i<LENGTH; i++){
            scoreList.add(score[i]);
            Collections.sort(scoreList, Collections.reverseOrder());
            answer[i] = scoreList.stream().limit(k).mapToInt(Integer::intValue).min().getAsInt();
        }

        return answer;
    }
}