class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        final int MIN = Math.min(a, b);
        
        for(int i=MIN; i>1; i--){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                break;
            }
        }
        
        while(b > 2){
            for(int j=2; j<=b; j++){
                
                if(b%j == 0){
                    
                    if(j != 2 && j != 5) return 2;
                    
                    b /= j;
                    break;
                }                
            }
        }
        
        return answer;
    }
}