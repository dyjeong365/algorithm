class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        int frequencyOfMaxFrequency = 0;

        for (int i = 0; i < nums.length; i++) {
            frequencies.put(nums[i], frequencies.getOrDefault(nums[i], 0) + 1);
        }

        for (var frequency : frequencies.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        for (var frequency : frequencies.values()) {
            if (frequency == maxFrequency) {
                frequencyOfMaxFrequency++;
            }
        }

        return frequencyOfMaxFrequency * maxFrequency;
    }
}