import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> progressesQueue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            double days = (double)(100 - progresses[i]) / speeds[i];

            progressesQueue.offer((int)Math.ceil(days));
        }
        
        while(!progressesQueue.isEmpty()){
            int result = 1;
            int prev = progressesQueue.poll();
            
            while(!progressesQueue.isEmpty() && prev >= progressesQueue.peek()){
                progressesQueue.poll();
                result++;
            }
            
            answer.add(result);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}