class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for(var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(var entrySet : map.entrySet()) {
            if(entrySet.getValue() == 1) {
                answer = entrySet.getKey();
            }
        }

        return answer;
    }
}