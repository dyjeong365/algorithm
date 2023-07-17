class Solution {
    public int solution(int[][] dots) {
        final int X = dots[0][0];
        final int Y = dots[0][1];
        int answer = 1;
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] == X){
                answer *= Math.abs(dots[i][1] - Y);
            }
            
            else if(dots[i][1] == Y){
                answer *= Math.abs(dots[i][0] - X);
            }
        }
        
        return answer;
    }
}