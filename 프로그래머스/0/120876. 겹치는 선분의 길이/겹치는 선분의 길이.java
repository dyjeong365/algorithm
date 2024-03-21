class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201];
        
        for(int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            // exclude the end range
            for(int k=start; k<end; k++) {
                count[k]++;
            }
        }
        
        for(var el : count) {
            if(el > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}