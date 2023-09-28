import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] result = {a, b, c, d};
        
        Arrays.sort(result);
        
        if(result[0] == result[1] && result[1] == result[2] && result[2] == result[3]){
            return 1111 * a;
        }
        
        else if(result[0] != result[1] && result[1] != result[2] && result[2] != result[3]){
            return result[0];
        }
        
        else if(result[0] == result[1] && result[1] == result[2]){
            return (int)Math.pow(10 * result[0] + result[3], 2);
        }
        
        else if(result[1] == result[2] && result[2] == result[3]){
            return (int)Math.pow(10 * result[1] + result[0], 2);
        }
        
        else if(result[0] == result[1] && result[2] == result[3]){
            return (result[0] + result[2]) * Math.abs(result[0] - result[2]);
        }
        
        else if(result[0] == result[1]){
            return result[2] * result[3];
        }
        
        else if(result[1] == result[2]){
            return result[0] * result[3];
        }
        
        else if(result[2] == result[3]){
            return result[0] * result[1];
        }
        
        return answer;
    }
}