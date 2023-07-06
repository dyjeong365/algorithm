import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        
        if(arr[start] != 2) return new int[]{-1};
        
        for(int j=arr.length-1; j>=0; j--){
            if(arr[j] == 2){
                end = j;
                break;
            }
        }
        
        int[] answer = new int[end - start + 1];
        
        for(int i=start, index=0; i<= end; i++){
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}