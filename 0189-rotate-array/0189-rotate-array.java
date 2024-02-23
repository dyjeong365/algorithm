class Solution {
    public void rotate(int[] nums, int k) {
        Map<Integer, Integer> treeMap = new TreeMap<>();

        for(int i=0; i<nums.length; i++) {
            treeMap.put((i + k) % nums.length, nums[i]);
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = treeMap.get(i);
        }
    }
}