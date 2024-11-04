class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int res = 0;
        Set<String> set = new HashSet<>();

        for (int i = 1; i <= k; i++) {
            set.add(String.valueOf(i));
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            String target = String.valueOf(nums.get(i));
            res++;

            if (set.contains(target)) {
                set.remove(target);

                if (set.isEmpty()) {
                    return res;
                }
            }
        }

        return -1;
    }
}