import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    result.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
                for(var el : result){
                    System.out.println(el);
        }
        
        for(var el : result){
            if(isPrime(el)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}