class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (var frequency : map.values()) {
            max = Math.max(max, frequency);
        }

        for(var num : nums){
            int frequency = map.get(num);

            if(frequency == max){
                ans++;
            }
        }

        return ans;
    }
}