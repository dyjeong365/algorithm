class Solution {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> queue = new LinkedList<>();

        for(var num : nums) {
            if(num != val) {
                queue.offer(num);
            }
        }

        final int SIZE = queue.size();

        for(int i=0; i<SIZE; i++) {
            nums[i] = queue.poll();
        }

        return SIZE;
    }
}