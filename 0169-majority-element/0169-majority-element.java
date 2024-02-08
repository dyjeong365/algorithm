class Solution {
    public int majorityElement(int[] nums) {
        final int HALF = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(var entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if(HALF < value) return key;
        }
        
        return -1;
    }
}