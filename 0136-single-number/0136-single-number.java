class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        
        for(var num : nums) {
            answer ^= num;
        }
        
        return answer;
    }
}