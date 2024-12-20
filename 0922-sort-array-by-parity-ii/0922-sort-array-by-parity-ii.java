class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Queue<Integer> odd = new LinkedList<Integer>();
        Queue<Integer> even = new LinkedList<Integer>();

        for (var num : nums) {
            if (num % 2 == 0) {
                even.offer(num);
            } else {
                odd.offer(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 2 == 0 ? even.poll() : odd.poll();
        }

        return nums;
    }
}