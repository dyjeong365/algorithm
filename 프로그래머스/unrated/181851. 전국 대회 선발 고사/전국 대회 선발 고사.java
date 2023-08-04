import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>();
        int[] student = new int[3];
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        
        Iterator<Integer> iterator = map.keySet().iterator();
        
        for(int i=0; i<3; i++){
            student[i] = map.get(iterator.next());
        }
        
        return 10000 * student[0] + 100 * student[1] + student[2];
    }
}