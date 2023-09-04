import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i=0; i<discount.length - 9; i++){
            String[] tenDays = Arrays.copyOfRange(discount, i, i + 10);
            int[] count = new int[number.length];
            
            for(var day : tenDays){
                for(int j=0; j<want.length; j++){
                    if(day.equals(want[j])){
                        count[j]++;
                    }
                }
            }
            
            if(Arrays.equals(number, count)) answer++;
        }
        
        return answer;
    }
}