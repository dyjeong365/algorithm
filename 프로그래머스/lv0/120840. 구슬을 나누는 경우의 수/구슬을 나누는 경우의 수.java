class Solution {
    public int solution(int balls, int share) {
        if(balls == share || balls == 1) return 1;
        if(share == 1) return balls;
        
        double answer = factorial(balls) / (factorial(balls-share) * factorial(share));

        return (int)Math.round(answer);
    }
    
    public static double factorial(int number){
        double result = number;
        
        while(number > 2){
            result *= --number;
        }
        return result;
    }
}