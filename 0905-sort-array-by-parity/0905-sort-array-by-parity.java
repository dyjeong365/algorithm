class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Queue<Integer> even = new LinkedList<>();
        Queue<Integer> odd = new LinkedList<>();

        for (var num : nums) {
            if (num % 2 == 0) {
                even.offer(num);
            } else {
                odd.offer(num);
            }
        }

        int i = 0;

        while (!even.isEmpty()) {
            nums[i++] = even.poll();
        }

        while (!odd.isEmpty()) {
            nums[i++] = odd.poll();
        }

        return nums;
    }
}