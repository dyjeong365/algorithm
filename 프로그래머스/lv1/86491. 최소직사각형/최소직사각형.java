import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int MinimumSatisfiedLength = 0;
        // 3000, 2100, 1800, 3200 - 4000(80*50)
        // 70, 36, *120, 98, 75 - 120(8*15)
        // 56, 114, 96, 126, 77 - 133(19*7)
        
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            MinimumSatisfiedLength = sizes[i][0];
            max = Math.max(max, sizes[i][1]);
        }
        
        for(int j=0; j<sizes.length; j++){
            if(MinimumSatisfiedLength < sizes[j][0]){
                MinimumSatisfiedLength = sizes[j][0];
            }
        }
        
        return max * MinimumSatisfiedLength;
    }
}