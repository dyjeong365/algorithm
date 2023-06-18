import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i++]);
            }
            
            else if(arr[i] == stk.get(stk.size()-1)){
                stk.remove(stk.size()-1);
                i++;
            }
            
            else if(arr[i] != stk.get(stk.size()-1)){
                stk.add(arr[i++]);
            }
        }
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(el -> el).toArray();
    }
}