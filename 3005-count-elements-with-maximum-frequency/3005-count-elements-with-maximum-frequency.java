class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequencies = new int[101];
        int maxFrequency = 0;
        int totalFrequency = 0;

        for (var num : nums) {
            frequencies[num]++;
        }

        Arrays.sort(frequencies);

        for (int i = frequencies.length - 1; i >= 0; i--) {
            if (frequencies[i] != 0) {
                maxFrequency = frequencies[i];
                break;
            }
        }

        for (var frequency : frequencies) {
            if (frequency == maxFrequency) {
                totalFrequency += maxFrequency;
            }
        }

        return totalFrequency;
    }
}