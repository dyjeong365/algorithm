class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (var pos : s.toCharArray()) {
            frequency.put(pos, frequency.getOrDefault(pos, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        priorityQueue.addAll(frequency.entrySet());

        while (!priorityQueue.isEmpty()) {
            Map.Entry<Character, Integer> entry = priorityQueue.poll();
            Character key = entry.getKey();
            int value = entry.getValue();

            while (value-- > 0) {
                sb.append(key);
            }
        }

        return sb.toString();
    }
}