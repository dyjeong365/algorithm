class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        
        for(var num : nums){
            if(num < target){
                index++;
            }
        }
        
        return index;
    }
}