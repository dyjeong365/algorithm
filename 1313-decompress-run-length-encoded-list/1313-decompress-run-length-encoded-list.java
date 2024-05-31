class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            int cnt = nums[i];

            while (cnt-- > 0) {
                list.add(nums[i + 1]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}