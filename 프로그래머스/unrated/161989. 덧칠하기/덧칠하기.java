class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
 
        if(m == 1) return section.length;
        
        for(var el : section){
            if((start + (m-1)) >= el) continue;
            
            start = el;
            answer++;
        }
        
        return answer;
    }
}