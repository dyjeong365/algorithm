class Solution {
    public boolean isPowerOfTwo(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 31; i++) {
            set.add((int) Math.pow(2, i));
        }

        return set.contains(n);
    }
}