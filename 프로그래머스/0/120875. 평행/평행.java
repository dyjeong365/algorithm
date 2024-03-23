class Solution {
    public int solution(int[][] dots) {
        double x0 = dots[0][0];
        double y0 = dots[0][1];
        double x1 = dots[1][0];
        double y1 = dots[1][1];
        double x2 = dots[2][0];
        double y2 = dots[2][1];
        double x3 = dots[3][0];
        double y3 = dots[3][1];
        
        if(
            (y1 - y0) / (x1 - x0) == (y3 - y2) / (x3 - x2) 
           || (y2 - y0) / (x2 - x0) == (y3 - y1) / (x3 - x1) 
           || (y3 - y0) / (x3 - x0) == (y1 - y2) / (x1 - x2)
        ) {
            return 1;
        }
        
        return 0;
    }
}