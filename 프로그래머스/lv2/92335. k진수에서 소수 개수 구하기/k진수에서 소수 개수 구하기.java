class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            sb.append(String.valueOf(n % k));
            n /= k;
            
            if(n < k){
                sb.append(n);
                break;
            }
        }
        
        for(var el : sb.reverse().toString().split("0")){
            if(!el.isEmpty() && isPrime(el)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(String strNum){
        long num = Long.parseLong(strNum);
        
        if(num == 1) return false;
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}