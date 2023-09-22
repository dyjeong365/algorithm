class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int count = countDivisors(i);
            
            answer += count > limit ? power : count;
        }
        
        return answer;
    }
    
    private int countDivisors(int number){
        int count = 2;
        
        if(number == 1) return 1;
        
        for(int i=2; i<=Math.sqrt(number); i++){    
            
            if(number % i == 0){
                if(Math.pow(i, 2) == number) count++;
                else count += 2;
            }
        }
        
        return count;
    }
    
}