import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int target = 0;
        int max = 0;
        Queue<Integer> prioritiesQueue = new LinkedList<>(Arrays.stream(priorities).boxed().collect(Collectors.toList()));
        
        while(!prioritiesQueue.isEmpty()){
            target = prioritiesQueue.poll();    
            max = !prioritiesQueue.isEmpty() ? prioritiesQueue.stream().mapToInt(i -> i).max().getAsInt() : 0;
            
            if(target < max){
                prioritiesQueue.offer(target);
            }
            
            else{
                answer++;
                if(location == 0) break;
            }
            
            location = location == 0 ? prioritiesQueue.size() - 1 : location - 1;
        }
        
        return answer;
    }
}