import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        boolean flag = false;
        int[] count = new int[1000];
        
        if(array.length == 1) return array[0];
        
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        
        final int MAX = Arrays.stream(count).max().getAsInt();
        
        for(int i=0; i<count.length; i++){
            if(MAX == count[i]){
                if(flag) return -1;
                
                flag = true;
                answer = i;
            }
        }
        
        return answer;
    }
}