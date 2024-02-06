class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        int ans = 0;
        
        for(var num : nums) {
            priorityQueue.offer(num);
        }
        
        while(k-- > 0) {
            ans = priorityQueue.poll();
        }
        
        return ans;
    }
}