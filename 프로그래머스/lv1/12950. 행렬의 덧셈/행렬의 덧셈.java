import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = Arrays.copyOf(arr1, arr1.length);
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}