class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int len = nums.length;
        int num = 1;
        int i = 0;

        Arrays.sort(nums);

        while (i < len) {
            if (nums[i] == num) {
                i++;
                num++;
            }

            else if (nums[i] > num) {
                answer.add(num++);
            }

            else {
                i++;
            }
        }

        while (num <= len) {
            answer.add(num++);
        }

        return answer;
    }
}