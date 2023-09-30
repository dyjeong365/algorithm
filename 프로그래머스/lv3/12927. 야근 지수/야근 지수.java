import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(var work : works){
            queue.offer(work);
        }
        
        while(n > 0){
            if(queue.peek() == 0) break;
            
            int max = queue.poll();
            queue.offer(--max);
            n--;
        }
        
        for(var el : queue){
            answer += Math.pow(el, 2);
        }
        
        return answer;
    }
}