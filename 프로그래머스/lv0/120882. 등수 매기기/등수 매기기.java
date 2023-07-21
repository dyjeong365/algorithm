import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        Map<Integer, Integer> rank = new HashMap<>();
        int[] answer = new int[score.length];
        
        for(int i=0; i<score.length; i++){
            int engScore = score[i][0];
            int mathScore = score[i][1];
            
            answer[i] = engScore + mathScore;
        }
        
        int[] scores = Arrays.copyOf(answer, answer.length);
        Arrays.sort(scores);
        
        for(int i=0; i<scores.length; i++){
            rank.put(scores[i], scores.length - i);
        }
        
        for(int i=0; i<score.length; i++){
            answer[i] = rank.get(answer[i]);
        }
        
        return answer;
    }
}