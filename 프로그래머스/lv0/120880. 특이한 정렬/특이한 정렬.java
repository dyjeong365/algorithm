import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> list = new LinkedList<>(Arrays.stream(numlist).sorted().boxed().collect(Collectors.toList()));
        int indexOfValue = 0;
        
        for(int i=0; i<answer.length; i++){
            int value = 10000;
            
            for(int j=0; j<list.size(); j++){
                int diff = Math.abs(n - list.get(j));
                
                if(value >= diff){
                    value = diff;
                    indexOfValue = j;
                    answer[i] = list.get(indexOfValue);
                }
            }
            
            list.remove(indexOfValue);
        }
        
        return answer;
    }
}