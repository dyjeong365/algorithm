class Solution {
    public int findKthLargest(int[] nums, int k) {
        final int MAX = 20000;
        int[] order = new int[MAX + 1];
        
        for(var el : nums) {
            order[el + MAX / 2]++;
        }
        
        for(int i=order.length-1; i>=0; i--) {
            k -= order[i];
            
            if(k <= 0) {
                return i - MAX / 2;
            }
        }
        
        return -1;
    }
}