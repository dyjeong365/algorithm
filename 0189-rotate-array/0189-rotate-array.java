class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for(var num : nums) {
            deque.offer(num);
        }

        while(k-- > 0) {
            deque.offerFirst(deque.pollLast());
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = deque.poll();
        }
    }
}