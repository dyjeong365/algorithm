import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int LENGTH = nums.length;
        int[] answer = new int[LENGTH];
        int left = 1;
        
        for(int i=0; i<LENGTH; i++) {
            answer[i] = left;
            left *= nums[i];
        }
        
        int right = 1;
        
        for(int i=LENGTH-1; i>=0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        
        return answer;
    }
}