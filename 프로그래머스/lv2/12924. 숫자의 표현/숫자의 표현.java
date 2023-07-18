class Solution {
    public int solution(int n) {
        int count = 1;
        
        for(int i=1; i<=n/2; i++){
            int result = i;
            int nextNumber = i+1;
            
            while(result <= n){
                result += nextNumber++;
                
                if(result == n) count++;
            }
        }
        
        return count;
    }
}