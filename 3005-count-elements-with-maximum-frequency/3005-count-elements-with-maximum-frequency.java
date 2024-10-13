class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        int totalFrequency = 0;

        for (var num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
            int frequency = frequencies.get(num);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                totalFrequency = frequency;
            }

            else if (frequency == maxFrequency) {
                totalFrequency += frequency;
            }
        }

        return totalFrequency;
    }
}