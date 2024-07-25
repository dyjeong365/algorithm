class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[0];

        for (var num1 : nums1) {
            set.add(num1);
        }

        for (var num2 : nums2) {
            if (set.contains(num2)) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[i++] = num2;
                set.remove(num2);
            }
        }

        return arr;
    }
}