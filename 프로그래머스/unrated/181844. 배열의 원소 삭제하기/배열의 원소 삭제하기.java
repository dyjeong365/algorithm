import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]) break;
                else if(j == delete_list.length-1){
                    answer = Arrays.copyOf(answer, answer.length+1);
                    answer[index++] = arr[i];
                }
            }
        }
        return answer;
    }
}