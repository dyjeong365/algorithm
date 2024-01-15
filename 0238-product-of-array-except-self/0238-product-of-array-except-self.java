import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int LENGTH = nums.length;
        int[] answer = new int[LENGTH];
        answer[0] = 1;
        int left = 1;
        
        for(int i=1; i<LENGTH; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        int right = 1;
        
        for(int i=LENGTH-1; i>=0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        
        return answer;
    }
}